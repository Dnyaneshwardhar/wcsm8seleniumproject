package testNg3;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void f() {
	  Reporter.log("f method from demotest2");
	           }
  public void f1()
  {
	  Reporter.log("f1 method from demotest2");
  }
  public void f2()
  {
	  Reporter.log("f2 method from demotest2");
  }
}

