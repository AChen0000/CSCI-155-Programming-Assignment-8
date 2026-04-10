/*
Programming Assignment 8
Name: Ann C.
Purpose: The purpose of this program is to create a class called MyInteger
that can check if a number is even, odd, or prime, compare values, 
and convert strings or character arrays into integers. 
It also tests these methods using sample values and user input. 
The loop will stop when the user enters'end'.
Date: April 9
 */

import java.util.Scanner;
// Main Class 
public class ProgrammingAssignmentEight {
public static void main(String[] args) {

    // Test objects
    MyInteger n1 = new MyInteger(5);

    System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));

    char[] chars = {'3','5','3','9'};
    System.out.println(MyInteger.parseInt(chars));

    String s = "3539";
    System.out.println(MyInteger.parseInt(s));

    MyInteger n2 = new MyInteger(24);

    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 equals n2? " + n1.equals(n2));
    System.out.println("n1 equals 5? " + n1.equals(5));

    // Third test object
    MyInteger n3 = new MyInteger(17);

    System.out.println("n3 is even? " + n3.isEven());
    System.out.println("n3 is odd? " + n3.isOdd());
    System.out.println("n3 is prime? " + n3.isPrime());
    System.out.println("n3 equals 17? " + n3.equals(17));

    System.out.println("\n--- Input Loop ---");

    Scanner input = new Scanner(System.in);
    String userInput;

    while (true) {
        System.out.print("Enter a number or 'end': ");
        userInput = input.next();

        if (userInput.equalsIgnoreCase("end")) {
            System.out.println("Bye!~");
            break;
        }

        int num = Integer.parseInt(userInput);
        MyInteger n = new MyInteger(num);

        System.out.println("Even? " + n.isEven());
        System.out.println("Odd? " + n.isOdd());
        System.out.println("Prime? " + n.isPrime());
        System.out.println("-------------------"); // Add a line for it be read easily 
        }

    input.close();
    }
}
