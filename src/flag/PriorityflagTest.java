package flag;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class PriorityflagTest {

  @Test
  public void Test1() {
    Reporter.log("test1 method",true);
  }
  @Test
  public void Test2() {
    Reporter.log("test2 method",true);
  }
  @Test(priority = 1)
  public void Test3() {
    Reporter.log("test2 method",true);
  }
  
}
