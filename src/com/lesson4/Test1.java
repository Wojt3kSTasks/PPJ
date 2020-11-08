package com.lesson4;

public class Test1 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("----------TASK 1---------");
        int numberToConvert = 327;
        System.out.println(String.format("Decimal: %s", numberToConvert));
        System.out.println(String.format("Binary: %s", Integer.toBinaryString(numberToConvert)));
        System.out.println(String.format("Hexadecimal: %s", Integer.toHexString(numberToConvert)));
        System.out.println(String.format("Octal: %s", Integer.toOctalString(numberToConvert)));
    }

    public static void task2() {
        System.out.println("----------TASK 2---------");
        int variableOne = 218;
        int x = 58;
        int result = 26;
        System.out.println(String.format("%s & %s = %s", variableOne, x, variableOne & x));
    }

    public static void task3() {
        System.out.println("----------TASK 3---------");
        short variable = 22357;
        int variable2 = variable;
        int foundBits = 0;
        boolean isBitEven = true;
        while (variable2 > 0) {
            variable2 = variable2 >> 1;
            if (isBitEven) {
                foundBits++;
            }
            isBitEven = !isBitEven;
        }
        if (foundBits >= 3) {
            System.out.println(String.format("Variable %s have at least 3 ones on even bit positions", variable));
        } else {
            System.out.println(String.format("Variable %s does not have at least 3 ones on even bit positions", variable));
        }
        int variable3 = 21;
        if (((variable % variable3) | variable) % 2 == 0) {
            System.out.println("Alternatywa bitowa użytej w zadaniu wartości z resztą z dzielenia przez 21 jest wartością parzysta");
        } else {
            System.out.println("Alternatywa bitowa użytej w zadaniu wartości z resztą z dzielenia przez 21 jest wartością nieparzysta");
        }
    }
}
