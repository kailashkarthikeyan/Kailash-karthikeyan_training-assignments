package programsjava;

import java.util.Scanner;

public class Replacecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Replace character or substring? (c/s): ");
        char choice = sc.next().charAt(0);

        if (choice == 'c') {
            System.out.print("Enter character to replace: ");
            char oldCh = sc.next().charAt(0);
            System.out.print("Enter new character: ");
            char newCh = sc.next().charAt(0);

            char[] chArr = s.toCharArray();
            for (int i = 0; i < chArr.length; i++) {
                if (chArr[i] == oldCh) chArr[i] = newCh;
            }
            System.out.println("Modified string: " + new String(chArr));
        } else if (choice == 's') {
            sc.nextLine(); // Consume leftover newline
            System.out.print("Enter substring to replace: ");
            String oldSub = sc.nextLine();
            System.out.print("Enter new substring: ");
            String newSub = sc.nextLine();

            String result = "";
            int i = 0;
            while (i < s.length()) {
                boolean match = true;
                if (i + oldSub.length() <= s.length()) {
                    for (int j = 0; j < oldSub.length(); j++) {
                        if (s.charAt(i + j) != oldSub.charAt(j)) {
                            match = false;
                            break;
                        }
                    }
                } else {
                    match = false;
                }

                if (match) {
                    result += newSub;
                    i += oldSub.length();
                } else {
                    result += s.charAt(i);
                    i++;
                }
            }
            System.out.println("Modified string: " + result);
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
