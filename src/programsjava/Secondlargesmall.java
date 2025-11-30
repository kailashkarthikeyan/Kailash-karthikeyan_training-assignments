package programsjava;

import java.util.Scanner;

public class Secondlargesmall{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x > smallest && x < secondSmallest) {
                secondSmallest = x;
            }
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x < largest && x > secondLargest) {
                secondLargest = x;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE || secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest or second smallest does not exist.");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
            System.out.println("Second largest: " + secondLargest);
        }
        sc.close();
    }
}
