package tech.adamu;

import java.util.Scanner;

public class TwoNumbersLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to compare");
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        if (first > second){
            System.out.println(first + " is the largest!");
        }
        else{
            System.out.println(second + " is the largest!");
        }
    }
}
