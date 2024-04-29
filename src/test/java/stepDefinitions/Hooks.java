package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
 
	@Before("@netBanking")
	public void netbankingSetup() {
		System.out.println("***********************");
		System.out.println("set up the entries in netbanking database");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("clear the entries");	
	}
	
  
	@Before("@mortgage")
	public void mortgageSetup() {
		System.out.println("set up the entries in mortgage database");
	}
}
