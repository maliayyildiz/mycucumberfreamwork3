package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US15Page;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class Us15StepDefinitions {
    US15Page us15Page = new US15Page();

    @Given("user is on the Global Trader page")
    public void user_is_on_the_global_trader_page() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader_url"));
    }

    @When("user hover over Cellphone & Communication under Categories")
    public void user_hover_over_cellphone_communication_under_categories() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us15Page.cellphoneAndCommunicationsMenu).perform();
        Thread.sleep(5000);
    }

    @When("user see all option on dropdown menu")
    public void user_see_all_option_on_dropdown_menu() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us15Page.cellphoneAndCommunicationsMenu).click().perform();
        assertTrue(us15Page.wallet.isDisplayed());
    }

    @When("user clicks on Wallet Cases")
    public void user_clicks_on_wallet_cases() {
       us15Page.wallet.click();
    }

    @When("user sees Products on the page")
    public void user_sees_products_on_the_page() {
      assertTrue(us15Page.product.isDisplayed());
    }

    @Then("verify Design Filter on the page")
    public void verify_design_filter_on_the_page() {
       assertTrue(us15Page.designFilter.isDisplayed());
    }

    @When("select each option from design filter")
    public void select_each_option_from_design_filter() {
       us15Page.exoticCheckBox.click();
       us15Page.geometricCheckBox.click();
       us15Page.jewelledCheckBox.click();
       us15Page.sportsCheckBox.click();
       us15Page.vintageCheckBox.click();
    }

    @Then("verify options are selected")
    public void verify_options_are_selected() {
        assertTrue(us15Page.vintageCheckBox.isSelected());
        assertTrue(us15Page.sportsCheckBox.isSelected());
        assertTrue(us15Page.exoticCheckBox.isSelected());
        assertTrue(us15Page.geometricCheckBox.isSelected());
        assertTrue(us15Page.jewelledCheckBox.isSelected());
    }

    @When("user select Business option from Desing filter")
    public void user_select_business_option_from_desing_filter() {
       us15Page.businessCheckBox.click();
       assertTrue(us15Page.businessCheckBox.isSelected());
    }

    @When("user clicks design search button")
    public void user_clicks_design_search_button() {
        us15Page.designFilterButton.click();
    }

    @Then("user sees products under Business option")
    public void user_sees_products_under_business_option() {
        assertTrue(us15Page.businessProduct.isDisplayed());
    }

}
