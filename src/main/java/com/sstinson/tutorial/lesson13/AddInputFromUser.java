package com.sstinson.tutorial.lesson13;

import java.util.Scanner;

public class AddInputFromUser {

    private static Scanner obj = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter 2 integers to add");

        int num1 = getIntFromUser();
        int num2 = getIntFromUser();
        int sum = num1 + num2;

        System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);
    }

    /*
    A function that returns an integer given by the user
     */
    public static int getIntFromUser() {
        while (!obj.hasNextInt()) {
            System.out.println("Please enter an integer");
            obj.next();
        }
        return obj.nextInt();
    }
}
