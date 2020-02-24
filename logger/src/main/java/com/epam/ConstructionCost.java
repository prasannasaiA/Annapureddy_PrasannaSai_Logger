package com.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	
	int choice, cost;
	float area;
	
	public ConstructionCost(int choice, float area) {
		this.choice=choice;
		this.area=area;
	}
	
	public int getCostPerFeet() {
		
		LOGGER.info("Entered into getCostPerFeet() method of ConstructionCost.java class\n");
		
		int cost=0;
		
		switch(choice) {
			case 1:
				cost = 1200;
			case 2:
				cost = 1500;
			case 3:
				cost = 1800;
			case 4:
				cost = 2500;
		}
		
		LOGGER.info("Exited from getComstPerFeet() method of ConstructionCost.java class\n");
		
		return cost;
		
	}
	
	public float calculateCost() {
		
		LOGGER.info("Entered into calculateCost() method of ConstructionCost.java class\n");
		
		float totalCost;
		
		cost = getCostPerFeet();
		totalCost = cost * area;
		
		LOGGER.info("Exited from calculateCost() method of ConstructionCost.java class\n");
		
		return totalCost;
		
	}
	
}