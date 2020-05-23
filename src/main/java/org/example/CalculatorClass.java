package org.example;

/**
 * Hello world!
 */
public class CalculatorClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean isItEmpty(String inputString) {
        // returning false if the given inputString is not empty.
        return inputString == null || inputString.equals("");
    }

    public static boolean isNumberOfInputsOne(String inputString) {
        // Return True if the number of inputs is 1.
        int numberOfInputs = inputString != null ? inputString.split(",").length : 0;

        return numberOfInputs == 1;
    }

    public static boolean isNumberOfInputsTwo(String inputString) {

        // Return true if the number of inputs is two.
        int numberOfInputs = inputString != null ? inputString.split(",").length : 0;

        return numberOfInputs == 2;
    }

    public static int calculateSum(String inputString) {
        // calculating the Sum according to the kata

        // checking the whether given input is empty or not
        boolean isItEmpty = isItEmpty(inputString);
        if (isItEmpty) {
            return 0;
        }

        // checking the whether given input is one
        boolean isItOne = isNumberOfInputsOne(inputString);
        if (isItOne) {
            return Integer.parseInt(inputString);
        }

        // checking whether the given input is two
        boolean isItTwo = isNumberOfInputsTwo(inputString);
        if (isItTwo) {
            String[] inputArray = inputString.split(",");
            return Integer.parseInt(inputArray[0]) + Integer.parseInt(inputArray[1]);
        }

        return -1;
    }
}
