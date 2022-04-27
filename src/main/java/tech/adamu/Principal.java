package tech.adamu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the principal: ");
        int principal = scanner.nextInt();

        System.out.println("please enter the Rate: ");
        int Rate = scanner.nextInt();

        System.out.println("please enter the time period: ");
        int Time = scanner.nextInt();

        System.out.println("Simple interest is "+(principal*Rate*Time)/100);
    }
}
