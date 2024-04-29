package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;

public class MainSteps {

@Given("setup the entries in database")
public void entrySetup() {
	System.out.println("***********************");
	System.out.println("setup the entries in database");
}

@When("launch the browser from config variables")
public void launchBrowser() {
	System.out.println("launch the browser from config variables");
}

@And("hit the home page url of banking site")
public void getUrl() {
	System.out.println("hit the home page url of banking site");
	
}

@Given("User is on NetBanking landing page")
public void user_is_on_net_banking_landing_page() {
    System.out.println("User is on NetBanking landing page");
   // Assert.assertTrue(false);
}

@Given("User is on Practice landing page")
public void user_is_on_practice_landing_page() {
	 System.out.println("User is on Practice landing page");
	 Assert.assertTrue(false);
}

@When("User Signup into application")
public void user_signup_into_application(List<String> data) {
    for(int i= 0; i<data.size() ; i++)
	System.out.println(data.get(i));
}


//@When("User login into application with username {string} and password {string}")
//public void user_login_into_application_with_and_password(String username, String password) {
//	System.out.println("username is "+username+"password is "+password);
//}

// Regex Expression
@When("^User login into application with username (.+) and password (.+)$")
public void user_login_into_application_with_and_password(String username, String password) {
	System.out.println("username is "+username+" and password is "+password);
}
@Then("Home Page is displayed")
public void home_page_is_displayed() {
	 System.out.println("Home Page is displayed");
}
@And("Cards are displayed")
public void cards_are_displayed() {
	 System.out.println("Cards are displayed");
}

}
