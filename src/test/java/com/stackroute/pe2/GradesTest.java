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
    //checking of lowest grade
    @Test
    public  void givenInputShouldReturnHighestGrade(){
        //act
        int inputArray[]={67,79,39,90};
        int actualResult=grades.calculateGrades(inputArray);
        //asserts
        assertEquals(90,actualResult);
        assertNotEquals(39,actualResult);
    }

    //Checking of Highest grade
    @Test
    public  void givenInputShouldReturnLowestGrade(){
        //act
        int inputArray[]={67,79,39,90};
        int actualResult=grades.calculateGrades(inputArray);
        //asserts
        assertEquals(39,actualResult);
    }

    //checking of average grades
    @Test
    public  void givenInputShouldReturnAverage(){
        //act
        int inputArray[]={25,25,25,25};
        int actualResult=grades.calculateGrades(inputArray);
        //assert
        assertEquals(25,actualResult);
    }


    //checking for valid inputs
    @Test
    public void  givenInputShouldReturnError(){
        int inputArray[]={25,-90,45,66};
        int actualResult=grades.calculateGrades(inputArray);
        assertEquals("Give the valid Input",actualResult);
    }


}