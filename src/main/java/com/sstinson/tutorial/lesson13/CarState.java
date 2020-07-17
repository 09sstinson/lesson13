package com.sstinson.tutorial.lesson13;

public enum CarState {

    DRIVING, WAITING, PARKING;

    public static CarState from(String state) {
        if("PARKING".equals(state)){
            return PARKING;
        }else if("DRIVING".equals(state)) {
            return WAITING;
        }else if("WAITING".equals(state)) {
            return DRIVING;
        } else {
            throw new RuntimeException("Invalid argument: " + state);
        }
    }
}
