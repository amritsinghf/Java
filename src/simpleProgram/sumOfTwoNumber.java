package simpleProgram;

import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter a second number : ");
        int secondNumber = sc.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("The sum of two number is : "+ result);
    }
}
