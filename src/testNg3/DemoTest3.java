package testNg3;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoTest3 {
  @Test
  public void h() {
	  Reporter.log("h method from demotest3");
	           }
  public void h1()
  {
	  Reporter.log("h1 method from demotest3");
  }
  public void h2()
  {
	  int a=10;
	  int b=0;
	  int c=a/b;
	  
	  Reporter.log("h2 method from demotest3");
	 
  }
}

