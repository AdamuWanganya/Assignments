package tech.adamu;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();

        System.out.println(number);
        if (number % 2 == 1){
            System.out.println(number + " ,"+" is an odd number!!");
        }else{
            System.out.println(number +" ," + " is an even number!!");
        }
    }
}
