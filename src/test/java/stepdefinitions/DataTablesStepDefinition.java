package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class DataTablesStepDefinition {

    DataTablePage dataTablePage = new DataTablePage();

    @Given("user should be on the web table page")
    public void user_should_be_on_the_web_table_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));
    }

    @Given("user should add new data by clicking new button")
    public void user_should_add_new_data_by_clicking_new_button() {
      dataTablePage.newButton.click();
    }

    @When("user input the first name")
    public void user_input_the_first_name() {
      dataTablePage.firstNameBox.sendKeys(ConfigReader.getProperty("first_name"));
    }

    @When("user input the last name")
    public void user_input_the_last_name() {
      dataTablePage.lastNameBox.sendKeys(ConfigReader.getProperty("last_name"));
    }

    @When("user input the position")
    public void user_input_the_position() {
      dataTablePage.positionBox.sendKeys(ConfigReader.getProperty("position"));
    }

    @When("user input the office")
    public void user_input_the_office() {
        dataTablePage.officeBox.sendKeys(ConfigReader.getProperty("office"));
    }

    @When("user input the extension")
    public void user_input_the_extension() {
        dataTablePage.extensionBox.sendKeys(ConfigReader.getProperty("extension"));
    }

    @When("user input the start date")
    public void user_input_the_start_date() {
        dataTablePage.startDateBox.sendKeys(ConfigReader.getProperty("start_date"));
    }

    @When("user input the salary")
    public void user_input_the_salary() {
        dataTablePage.salaryBox.sendKeys(ConfigReader.getProperty("salary"));
    }

    @Then("user clicks on the create button")
    public void user_clicks_on_the_create_button() throws InterruptedException {
      dataTablePage.createButton.click();
      Thread.sleep(3000);
    }

    @Then("search for the first name")
    public void search_for_the_first_name() {
        dataTablePage.searchBox.sendKeys(ConfigReader.getProperty("first_name"));
    }

    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() {
        Assert.assertTrue(dataTablePage.nameField.getText().contains(ConfigReader.getProperty("first_name")));
    }

    @When("user input the first name {string}")
    public void user_input_the_first_name(String firstname) {
        dataTablePage.firstNameBox.sendKeys(firstname);
    }

    @When("user input the last name  {string}")
    public void user_input_the_last_name(String lastname) {
       dataTablePage.lastNameBox.sendKeys(lastname);
    }

    @When("user input the position    {string}")
    public void user_input_the_position(String position) {
        dataTablePage.positionBox.sendKeys(position);
    }

    @When("user input the office      {string}")
    public void user_input_the_office(String office) {
        dataTablePage.officeBox.sendKeys(office);
    }

    @When("user input the extension {string}")
    public void user_input_the_extension(String extension) {
        dataTablePage.extensionBox.sendKeys(extension);
    }

    @When("user input the start date {string}")
    public void user_input_the_start_date(String startdate) {
       dataTablePage.startDateBox.sendKeys(startdate);
    }

    @When("user input the salary {string}")
    public void user_input_the_salary(String salary) {
        dataTablePage.salaryBox.sendKeys(salary);
    }

    @Then("search for the first name {string}")
    public void search_for_the_first_name(String firstname) throws InterruptedException {
       dataTablePage.searchBox.sendKeys(firstname);
    }

    @Then("verify the name fields contains first name {string}")
    public void verify_the_name_fields_contains_first_name(String firstname) throws InterruptedException {
        Assert.assertTrue(dataTablePage.nameField.getText().contains(firstname));
        Driver.closeDriver();
    }
}
