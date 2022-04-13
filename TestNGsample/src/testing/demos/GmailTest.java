package testing.demos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.GmailUtils;

public class GmailTest extends GmailUtils
{
	  @Parameters({"email"})
		@Test
	public void SendMail(String email) {
		System.out.println("send mail test"+email);
	}

}
