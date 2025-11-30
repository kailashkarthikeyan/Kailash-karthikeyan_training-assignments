package programsjava;

import java.util.Scanner;

public class Sortcharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - 1 - i; j++) {
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted characters: " + new String(ch));
        sc.close();
    }
}
