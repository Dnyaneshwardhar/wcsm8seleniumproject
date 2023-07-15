package flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test(description = "login method")
  public void method2() {
	  Reporter.log("login performed !!",true);
	  
  }
}
