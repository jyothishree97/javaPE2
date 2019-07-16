package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesTest{
    private static Grades grades;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        grades = new Grades();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        grades = null;

    }

    @Test
    public  void givenInputShouldReturnHighestGrade(){
        //act
        int inputArray[]={67,79,39,90};
        int actualResult=grades.calculateGrades(inputArray);
        //asserts
        assertEquals(90,actualResult);
        assertNotEquals(39,actualResult);
    }

    @Test
    public  void givenInputShouldReturnLowestGrade(){
        //act
        int inputArray[]={67,79,39,90};
        //arrange
        int actualResult=grades.calculateGrades(inputArray);
        //asserts
        assertEquals(39,actualResult);
    }

    @Test
    public  void givenInputShouldReturnAverage(){
        //act
        int inputArray[]={25,25,25,25};
        //arrange
        int actualResult=grades.calculateGrades(inputArray);
        //assert
        assertEquals(25,actualResult);
    }


}