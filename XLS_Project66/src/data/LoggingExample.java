package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add log4j.jar to the project - to build path
		//copy log4j.property directly inside the src folder
		//create the object of logger in the code
		
		Logger print= Logger.getLogger("devpinoyLogger");
		print.debug("hello");
		print.debug("we are writing in to a log file");
		print.debug("starting the test case xyz test");
		print.debug("starting the test case xyz test11");
		

	}

}
