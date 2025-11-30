package programsjava;

import java.util.Scanner;

public class Substringoccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String s = sc.nextLine();

        System.out.print("Enter substring to find: ");
        String sub = sc.nextLine();

        int count = 0;
        int i = 0;
        while (i <= s.length() - sub.length()) {
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (s.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
                i += sub.length();
            } else {
                i++;
            }
        }
        System.out.println("Number of occurrences: " + count);
        sc.close();
    }
}
