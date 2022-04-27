package tech.adamu;

import java.util.Objects;
import java.util.Scanner;

public class TwoNumbersOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Choose the number for the operation to perform");
        System.out.println(1 + "."+" Addition");
        System.out.println(2 + "."+" Subtraction");
        System.out.println(3 + "."+" Multiplication");
        System.out.println(4 + "."+" Division");
        System.out.println(5 + "."+" Modulo");
        int UserInput = scanner.nextInt();

        if(UserInput == 1){
            System.out.println( number1 + number2);

        }
        else if(UserInput == 2){
            System.out.println(number1 - number2);
        }
        else if(UserInput == 3){
            System.out.println(number1 * number2);
        }
        else if(UserInput == 4){
            System.out.println(number1 / number2);
        }
        else if(UserInput == 5){
            System.out.println(number1 % number2);
        }
        else {
            System.out.println("There is no such an operation");
        }
    }
}
