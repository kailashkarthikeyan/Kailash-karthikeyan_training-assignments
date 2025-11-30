package programsjava;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String reversed = new String(ch);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
