package regex1;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Candidate is not eligible to vote");
        }
        System.out.println("Candidate is eligible to vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter candidate's age: ");
        int age = sc.nextInt();
        
        try {
            checkEligibility(age);
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
        
    }
}

