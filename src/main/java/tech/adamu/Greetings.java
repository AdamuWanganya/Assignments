package tech.adamu;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String name = scanner.next();

        System.out.println("Hello " + name + " welcome!");
    }
//    class capitalize {
//
//
//            // create a string
//            String name = "programiz";
//
//            // create two substrings from name
//            // first substring contains first letter of name
//            // second substring contains remaining letters
//            String firstLetter = name.substring(0, 1);
//            String remainingLetters = name.substring(1);
//
//            // change the first letter to uppercase
//            firstLetter = firstLetter.toUpperCase();
//
//            // join the two substrings
//            name = firstLetter + remainingLetters;
//            System.out.println("Name: " + name);
//
//
//    }
}