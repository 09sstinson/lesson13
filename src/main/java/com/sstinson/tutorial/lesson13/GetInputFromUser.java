package com.sstinson.tutorial.lesson13;

import java.util.Scanner;

class GetInputFromUser {
    private static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
          // Create a Scanner object
        int num;
        System.out.println("Enter an integer");
        while(!myObj.hasNextInt()) {
            System.out.println("Not an integer");
            myObj.next();
        }
         num = myObj.nextInt();
        System.out.println("Integer is: " + num);  // Output user input
    }
}

