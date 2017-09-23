package com.org.IExecutionListners;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class IExecitionListnerTest {
	
	public class TestClass {
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Before Suite is running");
		}
		
		@Test
		public void DBTest() {
			System.out.println("Executing the DB test");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("After Suite is running");
		}
	}

}
