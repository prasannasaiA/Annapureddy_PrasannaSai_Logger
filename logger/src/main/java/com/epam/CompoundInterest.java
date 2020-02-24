package com.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest{
	
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
	float principalAmt, rateOfInterest, time;
	int noOfTimes;
	
	public CompoundInterest(float principal, float rate, float time, int noOfTimes) {
		
		principalAmt=principal;
		rateOfInterest=rate;
		this.time=time;
		this.noOfTimes=noOfTimes;
		
	}
	
	public float getCompoundInterest() {
		
		LOGGER.info("Entered into getCompoundInterest() method of CompoundInterest.java class\n");
		
		float compInterest, totalAmt;
		
		totalAmt = (float) (principalAmt * Math.pow((1 + (rateOfInterest/noOfTimes)), (noOfTimes * time)));
		compInterest = totalAmt-principalAmt;
		
		LOGGER.info("Exited from getCompoundInterest() method of CompoundInterest.java class\n");
		
		return compInterest;
		
	}
}