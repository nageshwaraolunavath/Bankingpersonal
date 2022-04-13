package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GmailUtils {
   @BeforeTest
	public static void login(){
		System.out.println(" Gmail Login");
	}
	@AfterTest
	public static void logout(){
		
		System.out.println("Gmail Logout");
		
	}
}
