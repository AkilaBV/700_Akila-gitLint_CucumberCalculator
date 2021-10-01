package Test_Cucumber.Test_Cucumber;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
	
	int x,y,sum,diff,product,q;
	
	@Given("^two numbers$")
	public void two_numbers() throws Throwable {
	    x=10;y=5;
	}

	@When("^I add those (\\d+) numbers$")
	public void i_add_those_numbers(int arg1) throws Throwable {
	   sum=x+y;
	}

	@Then("^I validate the sum$")
	public void i_validate_the_sum() throws Throwable {
	    Assert.assertEquals(sum,15);
	}

	@And("^display the sum$")
	public void display_the_sum() throws Throwable {
	    System.out.println("sum : "+ sum);
	}
	
	
	@Given("^two other numbers$")
	public void two_other_numbers() throws Throwable {
	    x=10;y=20;
	}

	@When("^I subtract those (\\d+) numbers$")
	public void i_subtract_those_numbers(int arg1) throws Throwable {
	    diff=y-x;
	}

	@Then("^I validate the difference$")
	public void i_validate_the_difference() throws Throwable {

Assert.assertTrue(diff==10);
	}

	@And("^display the difference$")
	public void display_the_difference() throws Throwable {
		System.out.println("difference : " +diff);
	}


	@When("^when multipled$")
	public void when_multipled() throws Throwable {
	   product=x*y;
	}

	@Then("^I validate the product$")
	public void i_validate_the_product() throws Throwable {
		// System.out.println(product);
	   Assert.assertTrue(product==50);
	}

	@And("^display the product$")
	public void display_the_product() throws Throwable {
	    System.out.println(product);
	}

	
	@When("^divide these numbers$")
	public void divide_these_numbers() throws Throwable {
	   q=x/y;
	}

	@Then("^I validate the quostiant$")
	public void i_validate_the_quostiant() throws Throwable {
		 System.out.println("q : " +q);
	   Assert.assertTrue(q==2);
	}

	@Then("^display quostiant$")
	public void display_quostiant() throws Throwable {
	   System.out.println("q : " +q);
	}





}
