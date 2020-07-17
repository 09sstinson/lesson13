package com.sstinson.tutorial.lesson13;

public class CarSelector {

    public static void main(String[] args) {
        CarService carService = new CarService();

        for(String argument: args){
            if(isValid(argument)){
                carService.process(argument);
            } else {
                System.err.println("Invalid Argument: " + argument);
            }
        }
    }

    public static boolean isValid(String argument) {
        try{
            CarState.valueOf(argument);
        } catch(RuntimeException e) {
            return false;
        }
        return true;
    }
}
