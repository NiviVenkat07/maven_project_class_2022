package Com.Logger_Demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_configuration {

	static Logger log = Logger.getLogger(Basic_configuration.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
	
		
		log.debug("Debug");
		log.info("information");
		log.warn("Warning");
		log.error("Error");
		log.fatal("Fatal");
		
	}
	
}
