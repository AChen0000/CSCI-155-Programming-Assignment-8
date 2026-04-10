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

//MyInteger Class
class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    // Instance methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    // Static methods 
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Static methods 
    public static boolean isEven(MyInteger n) {
        return n.value % 2 == 0;
    }

    public static boolean isOdd(MyInteger n) {
        return n.value % 2 != 0;
    }

    public static boolean isPrime(MyInteger n) {
        return isPrime(n.value);
    }

    // equals methods
    public boolean equals(int n) {
        return value == n;
    }

    public boolean equals(MyInteger n) {
        return value == n.value;
    }

    // parseInt methods
    public static int parseInt(char[] chars) {
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result * 10 + (chars[i] - '0');
        }
        return result;
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}

// Main Class 
public class PA8 {

    public static void main(String[] args) {

        // Test objects
        MyInteger n1 = new MyInteger(5);

        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);

        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));

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
            System.out.println("-------------------");
        }

        input.close();
    }
}
