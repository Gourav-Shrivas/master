package common;

import org.testng.annotations.DataProvider;

public class TestDataProvider {


	@DataProvider
	public Object[][] provideTestData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "sachin";
		data[0][1] = "tendulkar";
		
		data[1][0] = "rahul";
		data[1][1] = "dravid";
		
		return data;
		
	}
}
