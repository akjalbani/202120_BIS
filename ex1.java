/*
Exercise 1 from Chapter 2 of Farrell's "Java Programming" asks you to create a Java program that 
calculates the area of a rectangle given its length and width. Here's one possible solution:
*/

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
