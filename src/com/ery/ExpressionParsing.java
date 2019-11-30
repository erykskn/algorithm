package com.ery;

import java.util.Arrays;

public class ExpressionParsing {

    public static String parseExpressionToPrefix(String str) {
        String toPrefix;
        char[] operand = new char[str.length() / 2 + 1];
        int operandIndex = 0;
        char[] operator = new char[str.length() / 2];
        int operatorIndex = 0;


        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == '*' || str.charAt(index) == '-' || str.charAt(index) == '/' || str.charAt(index) == '+' || str.charAt(index) == '^') {
                operator[operatorIndex] = str.charAt(index);
                operatorIndex++;
            } else {
                operand[operandIndex] = str.charAt(index);
                operandIndex++;
            }
        }

        toPrefix = reverseArrayToString(operator) + Arrays.toString(operand);
        return toPrefix;
    }

    private static String reverseArrayToString(char[] arr) {
        String s = "";
        for (int index = arr.length - 1; index >= 0; index--) {
            s = s + arr[index];
        }
        return s;
    }
}
