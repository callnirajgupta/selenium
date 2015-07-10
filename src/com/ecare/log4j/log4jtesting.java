package com.ecare.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;

public class log4jtesting {
	
	private static final Logger logger=Logger.getLogger(log4jtesting.class);
	
  @Test
  public void faaaaa() {
	  PropertyConfigurator.configure("log4j.properties");
	  
	  logger.info("testing method            dfdfgdfgfdgdf"+log4jtesting.class.getCanonicalName());
	  logger.debug("hello i am in test f");	
	  
	  logger.info("info");
  }
}
