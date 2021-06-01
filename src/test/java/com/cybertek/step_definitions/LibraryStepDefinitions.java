package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user is on the login page");

    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");

    }

    @Then("user should see dashboard")
    public void userShouldSeeDashboard() {
        System.out.println("user should see dashboard");
    }

    @When("user enter student username")
    public void userEnterStudentUsername() {
        System.out.println("enter student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("enter student password");
    }

    @When("user enter admin username")
    public void userEnterAdminUsername() {
        System.out.println("admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("admin password");
    }
}
