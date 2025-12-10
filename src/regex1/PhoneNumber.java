package regex1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^(\\+?\\d{1,3}-)?\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        
        System.out.print("Enter phone number (e.g., 001-765-989-3421 or +1-456-765-9345): ");
        String phone = sc.nextLine();
        
        if (pattern.matcher(phone).matches()) {
            System.out.println(phone + " → Valid phone number");
        } else {
            System.out.println(phone + " → Invalid phone number");
        }
        sc.close();
    }
}

