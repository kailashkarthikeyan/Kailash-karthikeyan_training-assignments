package programsjava;

import java.util.Scanner;

public class Countposandneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;
        for (int x : arr) {
            if (x > 0) positive++;
            else if (x < 0) negative++;
            else zero++;
        }

        System.out.println("Positive elements: " + positive);
        System.out.println("Negative elements: " + negative);
        System.out.println("Zero elements    : " + zero);
        sc.close();
    }
}
