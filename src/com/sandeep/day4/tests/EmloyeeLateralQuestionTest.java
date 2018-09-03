package com.sandeep.day4.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day4.President;
import com.sandeep.day4.SalesManager;

class EmloyeeLateralQuestionTest {

	@Test
	void testEmployeeLateral() {
		
		assertEquals(16500, new SalesManager("12345","Sandeep Das",10000).calculateNetSalary());
		assertEquals(20100, new President("12345","Sandeep Das",10000,500).calculateNetSalary());
		
	}

}
