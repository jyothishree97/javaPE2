package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileContentTest {
        private static FileContent fileContent;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fileContent= new FileContent();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
       fileContent = null;
    }


    @Test
    public void givenFileContentShouldReturnInUpperCases(){
        //given the pathname
        File file = new File("/home/desktop/java_practice.txt");
        //assert
        assertEquals("THE CONTENT SHOULD BE IN UPPER CASES",fileContent.getUpperCase(file.getAbsolutePath()));
    }
    @Test
    public void givenFileContentShouldReturnError(){
        //given the pathname
        File file =new File("home/desktop");
        //assert
        assertEquals("Give valid path ",fileContent.getUpperCase(file.getAbsolutePath()));
    }

}