package testNGAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.security.Provider;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
  @Test
  public void f() {
	  Reporter.log("f method of annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before method of annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method of annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before method of annotation");
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class of annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before test of annotation");
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("after test of annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite of annotation ");
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite of annotation");
  }

}
