package com.ww.junitpractise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Object[] expectedEmps = new Object[3];
    
    @Before
    public void initInputs(){
        expectedEmps[0] = new Employee(1, "Aditya", 15000);
        expectedEmps[1] = new Employee(2, "Shyam", 25000);
        expectedEmps[2] = new Employee(3, "Sanjay", 5000);
    }
     
    @Test
    public void compareEmployees(){
       
        Object[] testOutput = Employee.getEmpList().toArray();
        assertArrayEquals(expectedEmps, testOutput);
    }
}
