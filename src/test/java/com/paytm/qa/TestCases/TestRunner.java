package com.paytm.qa.TestCases;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testNg;
		
		testNg=new TestNG();
		testNg.setTestClasses(new Class[] {LoginPageTest.class});
		testNg.run();

	}

}
