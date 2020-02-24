package com.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SimpleInterest{
	
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
	float principalAmt, rateOfInterest, time;
	
	public SimpleInterest(float principal, float rate, float time) {
		
		principalAmt=principal;
		rateOfInterest=rate;
		this.time=time;
		
	}
	
	public float getSimpleInterest() {
		
		LOGGER.info("Entered into getSimpleInterest() method of SimpleInterest.java class\n");
		
		float sInterest;
		sInterest=(principalAmt * rateOfInterest * time) / 100;
		
		LOGGER.info("Exited from getSimpleInterest() method of SimpleInterest.java class\n");
		
		return sInterest;
		
	}
}