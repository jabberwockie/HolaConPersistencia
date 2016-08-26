package com.nisum.onboarding.hw;

//import org.apache.log4j.Logger;

import java.io.*;
import java.util.Date;

public class Log {
	 	
	public void addLog(String string) throws SecurityException, IOException{
		//Logger logger = Logger.getLogger("MyLog");  
		FileWriter fh;  

		fh = new FileWriter(new File("/home/kmii/Desktop/MyLogFile.log"),true);  
		//logger.addHandler(fh);
		//SimpleFormatter formatter = new SimpleFormatter();  
		fh.write(string+" "+new Date()+"\n");
		
		fh.close();
			
	}

}