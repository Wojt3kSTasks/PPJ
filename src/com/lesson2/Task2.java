package com.lesson2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber ;
        while (true) {
            System.out.println("Enter an integer:");
            try {
                enteredNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("An incorrect number has been entered");
            }
        }
        System.out.println(String.format("Decimal: %s", enteredNumber));
        System.out.println(String.format("Binary: %s", Integer.toBinaryString(enteredNumber)));
        System.out.println(String.format("Octal: %s", Integer.toOctalString(enteredNumber)));
        System.out.println(String.format("Hexadecimal: %s", Integer.toHexString(enteredNumber)));
    }
}
