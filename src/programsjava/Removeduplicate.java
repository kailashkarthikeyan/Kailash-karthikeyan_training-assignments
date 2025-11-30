package programsjava;

import java.util.Scanner;

public class Removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[k++] = arr[i];
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) System.out.print(temp[i] + " ");
        sc.close();
    }
}
