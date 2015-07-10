package com.ecare.com.ecare.TestNG;

import org.testng.annotations.Test;

public class TestNGwithGroup {
	
	
  @Test(groups={"smoke","regression"})
  public void f() {
	  System.out.println("testing smoke and regression");
  }
  
  @Test(groups={"smoke"})
  public void g(){
	  System.out.println("testing only smoke");
  }
  
  @Test
  public void a(){
	  System.out.println("only test");
	  
  }
  
  

 
  @Test(groups={"regression"})
  public void b(){
	  System.out.println("testing regression");
  }
}
