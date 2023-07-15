package flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Descriptionflag {
  @Test(description = "this method perform login!!")
  public void method1(){
	  Reporter.log("method1 login",true);
	  
  
  
  }
}
