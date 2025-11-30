package programsjava;

import java.util.Scanner;

public class Comparestrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        boolean equals = true;
        if (a.length() != b.length()) {
            equals = false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    equals = false;
                    break;
                }
            }
        }
        System.out.println("Equal: " + equals);

        int compareTo = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                compareTo = a.charAt(i) - b.charAt(i);
                break;
            }
        }
        if (compareTo == 0) {
            if (a.length() == b.length()) compareTo = 0;
            else compareTo = a.length() < b.length() ? -1 : 1;
        }

        System.out.println("CompareTo result: " + compareTo);
        sc.close();
    }
}
