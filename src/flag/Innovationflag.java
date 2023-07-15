package flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innovationflag {

	@Test(invocationCount=1000)
	public void method()
	{
	  Reporter.log( "login testcase",true);
	}

}
