package org.testing.utilities;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void TakeLog(String message, String className)
	{
		DOMConfigurator.configure("..//ProjectSelenium/layout.xml");
		Logger log=Logger.getLogger(className);
		log.info(message);
		
	}

}
