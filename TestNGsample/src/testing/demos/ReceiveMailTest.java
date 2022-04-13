package testing.demos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.GmailUtils;

public class ReceiveMailTest extends GmailUtils
{
	@Parameters({"appurl"})
     @Test
	public void receivemail(String appurl){
		System.out.println("Receive Mail Test"+appurl);
	}
}
