package tech.adamu;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int Radius = scanner.nextInt();

        double pie = 3.14;

        System.out.println("Area of circle = "+ pie*Radius*Radius);

    }
}
