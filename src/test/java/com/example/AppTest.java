package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AppTest {

    @Test
    public void shouldReturnFourOnSumOneAndThree() {
        assertThat(new App().sum(1, 3), is(4));
    }
}
