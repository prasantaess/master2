package com.qa.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDataProvider {

	
@Test (dataProvider ="TestProvider")
public void DataproviderTest(String T1) {
	
	System.out.println(T1);	
}

@DataProvider(name="TestProvider")
public Object[][] DataInsert() {
		return new Object[][] {  {"Test 1"},
								 {"Test 3"},
								 {"Test 5"}
			
		};
	}
	
@Test
@Parameters({"data"})
public void parameter(String data) {
	
	System.out.println(data);
	
	
}

@Test
@Parameters({"data2"})
public void ParameterTestII(@Optional("Chrome")String data2) {
	
	System.out.println(data2);
}
}


	
	
	
	
	

