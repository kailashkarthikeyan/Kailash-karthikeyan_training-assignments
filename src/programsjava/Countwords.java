package programsjava;

import java.util.Scanner;

public class Countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Word count: 0");
            sc.close();
            return;
        }
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i + 1 < s.length() && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Word count: " + count);
        sc.close();
    }
}
