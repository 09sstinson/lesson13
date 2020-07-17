package com.sstinson.tutorial.lesson13;

import org.junit.Test;

public class CarSelectorTest {

    @Test
    public void shouldCallMain() {
        String [] args = {"Ford", "Toyota"};
        CarSelector.main(args);
    }
}
