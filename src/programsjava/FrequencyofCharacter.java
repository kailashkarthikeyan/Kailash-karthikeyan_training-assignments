package programsjava;

import java.util.Scanner;

public class FrequencyofCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter character to find frequency: ");
        char ch = sc.next().charAt(0);

        int freq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) freq++;
        }
        System.out.println("Frequency of '" + ch + "' is: " + freq);
        sc.close();
    }
}
