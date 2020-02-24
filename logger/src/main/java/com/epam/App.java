package com.epam;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	static Scanner input=new Scanner(System.in);
	static float principalAmt, rateOfInterest, time;
	
	public static float calculateSimpleInterest() {

		float simpleInterest;
		
		LOGGER.info("Entered into calculateSimpleInterest() method of APP.JAVA class\n");
		
		LOGGER.info("Enter the principal amount : ");
    	principalAmt=input.nextFloat();
    	LOGGER.info("Enter the Rate of Interest : ");
    	rateOfInterest=input.nextFloat();
    	LOGGER.info("Enter the Time period(in years) : ");
    	time=input.nextFloat();
    	
    	SimpleInterest simpleInterestObject=new SimpleInterest(principalAmt,rateOfInterest,time);
    	simpleInterest=simpleInterestObject.getSimpleInterest();
    	
    	LOGGER.info("Exited from calculateSimpleInterest() method of APP.JAVA class\n");
    	
    	return simpleInterest;
    	
	}
	
	public static float caluculateCompoundInterest() {
		
		LOGGER.info("Entered into calculateCompoundInterest() method of APP.JAVA class\n");

		float compoundInterest;
		int noOfTimes;
		
		LOGGER.info("Enter the principal amount : ");
    	principalAmt=input.nextFloat();
    	LOGGER.info("Enter the Rate of Interest : ");
    	rateOfInterest=input.nextFloat();
    	LOGGER.info("Enter the Time period(in years) : ");
    	time=input.nextFloat();
    	LOGGER.info("Enter the no. of times the interest is compounded per unit time : ");
    	noOfTimes=input.nextInt();
    	
    	CompoundInterest compInterestObject=new CompoundInterest(principalAmt, rateOfInterest, time, noOfTimes);
    	compoundInterest=compInterestObject.getCompoundInterest();
    	
    	LOGGER.info("Exited from calculateCompoundInterest() method of APP.JAVA class\n");
    	
    	return compoundInterest;
    	
	}
	
	public static float findConstructionCost() {
		
		LOGGER.info("Entered into findConstructionCost method() of APP.JAVA class\n");
		
		float constCost, area;
		int choice;
		while(true){
			LOGGER.info("Choose a Standard of material to be used for House Construction from the following : ");
			LOGGER.info("\n1. Standard Materials.\n2. Above Standard Materials\n3. High Standard Materials\n4. High Standard AMterial and Fully Automated House.");
			LOGGER.info("\nEnter a valid Choice : ");
			choice=input.nextInt();
			if(choice>4 || choice<1)
				LOGGER.info("\nTry Again!!!!....");
			else
				break;
		}
		LOGGER.info("Enter the total Area of house in square feet :");
		area=input.nextFloat();
		
		ConstructionCost house=new ConstructionCost(choice,area);
		constCost=house.calculateCost();
		
		LOGGER.info("Exited from  method findConstructionCost() of APP.JAVA class\n");
		
		return constCost;
	}
	
    public static void main( String[] args )
    {
    	
    	LOGGER.info("Entered into main() method\n");
    	
     // Simple Interest
    	float simpleInterest;
    	LOGGER.info("To find Simple Interest:\n");
    	simpleInterest=calculateSimpleInterest();
    	LOGGER.info("Simple interest is : "+simpleInterest);
    	
    //Compound Interest
    	float compoundInterest;
    	LOGGER.info("\nTo find Compound Interest:\n");
    	compoundInterest=caluculateCompoundInterest();
    	LOGGER.info("\nCompound Interest after "+time+" years is : "+compoundInterest+" (without principal amount)");
    	
    //Construction cost of House
    	float constructionCost;
    	LOGGER.info("\nTo find House Construction Cost : \n");
    	constructionCost=findConstructionCost();
    	LOGGER.info("Total Construction Cost of House according to given details : "+constructionCost+"INR");
    	
    	LOGGER.info("\nExited from main() method");
    	
    }
}
