package multiple;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider_Holder {
	// step 1 
	
	@DataProvider  // rule 1
	public static Object[][] getData(Method getMethod){ // make my method Static // step7
	    // System.out.println("test case which has the methodis:"+name.getName());
		
		Object[][] Data=new Object[3][4]; // Rule2 create object array


		Data[0][0]="username1";
		Data[0][1]="password1";
		Data[0][2]=12345;
		Data[0][3]="Chrome";

		Data[1][0]="username2";
		Data[1][1]="password2";
		Data[1][2]=123456;
		Data[1][3]="Firefox";

		Data[2][0]="username3";
		Data[2][1]="password3";
		Data[2][2]=1234567;
		Data[2][3]="Edge";
		
		return Data;
	}
}
