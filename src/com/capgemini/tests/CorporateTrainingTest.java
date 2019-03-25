package com.capgemini.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.CorporateTraining;
import com.capgemini.main.Training;


public class CorporateTrainingTest {


	Training obj;
	@Before
	public void setUp()
	{
		obj= new CorporateTraining(101, "java", 35_000, 4);
	}

	@Test
	public void testForValidInput() {
		assertEquals(140000, obj.getOrderValue(),0.01);
	}

}
