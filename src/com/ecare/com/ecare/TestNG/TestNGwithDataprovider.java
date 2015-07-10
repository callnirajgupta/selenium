package com.ecare.com.ecare.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGwithDataprovider {
	// 
  @Test(dataProvider="emplogin")
  public void login(String username,String password) {
	  System.out.println("username  :"+username);
	  System.out.println("password   :"+password);
	  
	  
  }
  
  @Test
  public void c(){
	  System.out.println("i am in test()");
  }
  @DataProvider(name="emplogin")
  public Object[][] logindata(){
	  Object[][] objectarray=new Object[2][2];
	  
	  objectarray[0][0]="account1";
	  objectarray[0][1]="password1";
	  objectarray[1][0]="account2";
	  objectarray[1][1]="passwor2";
	  
	  
	  return objectarray;
	  
  }
}
