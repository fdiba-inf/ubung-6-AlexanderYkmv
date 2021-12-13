package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int reversedNumber = 0;
        int manipulatedNumber;
        int digit;
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        manipulatedNumber = number;
        while(manipulatedNumber > 0) {
            digit = manipulatedNumber % 10;

            reversedNumber = reversedNumber * 10 + digit;
            manipulatedNumber = manipulatedNumber / 10;
        }
        boolean palindrome = number == reversedNumber;
        System.out.println("Palindrome: " + palindrome);


    }
}
