package stepdefinationpackage;

import java.io.IOException;


import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Utilities.ReportingManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepackage.loginp;

public class loginstepdefination extends loginp
     {
	
	@Given("^User is in login page$")
    public void user_is_in_login_page() throws IOException  
	{
		launchApplication();	
	    ExtentCucumberAdapter.addTestStepLog("application launched successfully");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());

	}
	
	   @When("^User enters email id \"([^\"]*)\"$")
	    public void user_enters_email_id(String EmailID) throws IOException, InterruptedException 
	   {
			enterEmailId(EmailID); 
			ExtentCucumberAdapter.addTestStepLog("User entered the emailid successfully"+EmailID);
			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
			
	    	Thread.sleep(3000);
	    	
	    }
	
	   
	   @And("^User enters password \"([^\"]*)\"$")
	    public void user_enters_password(String strArg1) throws IOException {
	        enterPassword(strArg1);
	        ExtentCucumberAdapter.addTestStepLog("entered password");
	        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	        
	
	    }
	   
	
	@And("^User clicks the signin button$")
    public void User_clicks_the_signin_button() throws IOException  
	{
		clickSigninButton();
		
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());

	}
	

	@Then("^close application$")
    public void close_application()  
	{
		
		closebrowser();
	}

}