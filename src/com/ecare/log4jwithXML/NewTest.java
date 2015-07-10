package com.ecare.log4jwithXML;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  DOMConfigurator.configure("log4j.xml");
	  Logger log = Logger.getLogger(NewTest.class.getName());
	  log.info("printing info");
	  log.debug("debugging");
	  log.warn("warning");
	  log.error("error");
	  
  }
}
