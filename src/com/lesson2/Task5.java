package com.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        int firstNumber = 5;
        int result = 1;
        System.out.println(String.format("%s & %s = %s", firstNumber, findSecondNumberForSpecifiedAndResult(firstNumber, result), result));
        result = 4;
        System.out.println(String.format("%s & %s = %s", firstNumber, findSecondNumberForSpecifiedAndResult(firstNumber, result), result));
        result = 5;
        System.out.println(String.format("%s & %s = %s", firstNumber, findSecondNumberForSpecifiedAndResult(firstNumber, result), result));
        result = 0;
        System.out.println(String.format("%s & %s = %s", firstNumber, findSecondNumberForSpecifiedAndResult(firstNumber, result), result));
    }

    private static List<Integer> findSecondNumberForSpecifiedAndResult(int firstNumber, int result) {
        List<Integer> availableAnswers = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            if ((i & firstNumber) == result) {
                availableAnswers.add(i);
            }
        }
        return availableAnswers;
    }
}
