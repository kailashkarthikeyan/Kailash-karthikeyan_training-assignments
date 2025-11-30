package programsjava;

import java.util.Scanner;

public class Removeduplicatechars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += c;
            }
        }
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
