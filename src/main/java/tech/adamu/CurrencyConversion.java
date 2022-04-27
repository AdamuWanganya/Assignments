package tech.adamu;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ksh to convert: ");
        int ksh = scanner.nextInt();
        System.out.println("USD = " + ksh/115.87);
    }
}
