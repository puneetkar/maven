package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestGreeter {

    private Greeter greeter;

    @BeforeEach
    void setUp() {
        greeter = new Greeter();
    }

    @Test
    void testGreetingContainsHello() {
        assertThat(greeter.greet("World"), containsString("Hello"));
    }

    @Test
    void testGreetingLength() {
        assertThat(greeter.greet("World").length(), greaterThan(5));
    }
}
