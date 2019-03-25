package com.capgemini.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.PublicTraining;
import com.capgemini.main.Training;

public class PublicTrainingTest {
	
	Training obj;
	@Before
	public void setUp()
	{
		obj= new PublicTraining(101, "java", 5_000, 50);
	}

	@Test
	public void testForValidInput() {
		assertEquals(250000, obj.getOrderValue(),0.01);
	}

}
