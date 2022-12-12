package multiple;

import org.testng.annotations.Test;

public class TestCases_For_MyData {
// step2
	
	
	@Test(dataProviderClass = Data_Provider_Holder.class,dataProvider = "getData") // step4 and step5
	public void launchUrl(String username, String password, int rollNumber, String browser) {
		
	}
	@Test(dataProviderClass = Data_Provider_Holder.class,dataProvider = "getData")
	public void logIn(String username, String password, int rollNumber, String browser) {
		
	}
	@Test(dataProviderClass = Data_Provider_Holder.class,dataProvider = "getData")
	public void logOut(String username, String password, int rollNumber, String browser) {
		
	}
}
