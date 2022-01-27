package com.epages.sonarsandbox;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

    @Test
    public void should_add_numbers() {
        var calculator = new Arithmetic();

        var result = calculator.add(1, 3);

        assertThat(result, equalTo(4.0));
    }
}
