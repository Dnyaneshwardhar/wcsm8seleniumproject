package flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRun {
	 
	@Test(groups="functionaltesting")
	public void ft1()
	{
		Reporter.log("FTS01",true);
    }
	@Test(groups="smoketesting")
	public void st1()
	{
		Reporter.log("STS01",true);
    }	
	@Test(groups="integrationtesting")
	public void it1()
	{
		Reporter.log("ITS01",true);
    }	
	@Test(groups="functionaltesting")
	public void ft2()
	{
		Reporter.log("FTS02",true);
    }
	@Test(groups="smoketesting")
	public void st2()
	{
		Reporter.log("STS02",true);
    }	
	@Test(groups="integrationtesting")
	public void it2()
	{
		Reporter.log("ITS02",true);
    }	
	  @Test(groups="functionaltesting")
	public void ft3()
	{
		Reporter.log("FTS03 k",true);
    }

	@Test(groups="smoketesting")
	public void st3()
	{
		Reporter.log("STS03",true);
    }	
	@Test(groups="integrationtesting")
	public void it3()
	{
		Reporter.log("ITS03",true);
    }	
}
	
	
	
    
    
    
    