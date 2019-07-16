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
        //Intialization
        int num=5;
        //For Integer Variables
        int actualResult=factorial.factorialNumber(num);
        int expectedResult=120;
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenNumberShouldReturnGreaterThanZer0(){
        //Intialization
        int num=0;
        //For Integer Variables
        int actualResult=factorial.factorialNumber(num);
        int expectedResult=0;
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public  void givenNumberShouldReturnOutOfRange(){
        //Intialization
        int num=13;
        //Method for Integer variables
        int actualRseult=factorial.factorialNumber(num);
        //assert
        assertEquals("out of range",actualRseult);
    }

    @Test
    public  void givenNumberShouldReturnFactorialForLongInt(){
        //Intialization
        int num=20;
        //For Max_value
        int actualResult=factorial.longFactorial(num);
        BigInteger expectedResult=new BigInteger("2432902008176640000");
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenNumberShouldReturnOutOfRangeForLongInt(){
        //Intialization
        int num=21;
        //For Max_Value
        int actualResult=factorial.longFactorial(num);
        //assert
        assertEquals("out of range",actualResult);
    }

}