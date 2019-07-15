package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class PallindromeTest {
    private static Factorial factorial;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        factorial = new Factorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        factorial = null;

    }

}