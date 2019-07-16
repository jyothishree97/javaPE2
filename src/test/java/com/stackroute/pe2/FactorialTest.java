package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FactorialTest {
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

    @Test
    public void givenNumberShouldReturnTheFactorialOfNumber(){
        int num=5;
        int actualResult=factorial.factorialNumber(num);
        int expectedResult=120;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenNumberShouldReturnGreaterThanZer0(){
        int num=0;
        int actualResult=factorial.factorialNumber(num);
        int expectedResult=0;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public  void givenNumberShouldReturnOutOfRange(){
        int num=13;
        int actualRseult=factorial.factorialNumber(num);
        assertEquals("out of range",actualRseult);
    }

    @Test
    public  void givenNumberShouldReturnFactorialForLongInt(){
        int num=20;
        int actualResult=factorial.longFactorial(num);
        BigInteger expectedResult=new BigInteger("2432902008176640000");
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenNumberShouldReturnOutOfRangeForLongInt(){
        int num=21;
        int actualResult=factorial.longFactorial(num);
        assertEquals("out of range",actualResult);
    }

}