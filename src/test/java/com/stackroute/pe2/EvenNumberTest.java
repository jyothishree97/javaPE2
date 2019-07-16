package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
    private static EvenNumber evenNumber;
    boolean result;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        evenNumber = new EvenNumber();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        evenNumber = null;
    }
    @Test
    public  void givenNumberShouldReturnEven(){
        int n=24;
        result=evenNumber.isEven(n);
        assertEquals("The given number is Even",true,result);
    }
    @Test
    public  void givenNumberShouldReturnNotEven(){
        int n=23;
        result=evenNumber.isEven(n);
        assertEquals("The given number is Even",false,result);
    }
//    @Test
//    public void givenNumberShouldReturnOdd(){
//        int n=121;
//        result=evenNumber.isEven(n);
//        assertEquals("The given number is odd",true,result);
//    }

}