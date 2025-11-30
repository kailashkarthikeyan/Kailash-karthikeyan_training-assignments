package programsjava;

import java.util.Scanner;

public class Countdigitsalphaspecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int digits = 0, letters = 0, special = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') digits++;
            else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) letters++;
            else special++;
        }
        System.out.println("Digits: " + digits);
        System.out.println("Alphabets: " + letters);
        System.out.println("Special characters: " + special);
        sc.close();
    }
}
