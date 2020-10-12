package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.KoalaPalaceRoomCreationPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class KoalaPalaceHotelRoomCreation {
    KoalaPalaceRoomCreationPage koalaPalaceRoomCreationPage = new KoalaPalaceRoomCreationPage();

    @Given("Application should be available and should accessible with valid credidentials")
    public void application_should_be_available_and_should_accessible_with_valid_credidentials() {
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        koalaPalaceRoomCreationPage.MainLoginButton.click();
    }

    @When("user input username")
    public void user_input_username() {
        koalaPalaceRoomCreationPage.userNameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @When("user input password")
    public void user_input_password() {
        koalaPalaceRoomCreationPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("user clicks login")
    public void user_clicks_login() {
       koalaPalaceRoomCreationPage.loginButton.click();
    }

    @When("user clicks hotel management")
    public void user_clicks_hotel_management() {
       koalaPalaceRoomCreationPage.hotelManagement.click();
    }

    @When("user clicks Hotel Rooms")
    public void user_clicks_hotel_rooms() {
       koalaPalaceRoomCreationPage.hotelRoom.click();
    }

    @When("user clicks on the ADD HOTELROOM button")
    public void user_clicks_on_the_add_hotelroom_button() {
        koalaPalaceRoomCreationPage.addRoomButton.click();
    }

    @When("user Select IDHotel")
    public void user_select_id_hotel() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(koalaPalaceRoomCreationPage.hotelId);
        select.selectByValue(ConfigReader.getProperty("hotel_index"));
    }

    @When("user input Code")
    public void user_input_code() {
       koalaPalaceRoomCreationPage.codeBox.sendKeys(ConfigReader.getProperty("code"));
    }

    @When("user input the name")
    public void user_input_the_name() {
        koalaPalaceRoomCreationPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
    }

    @When("user input the location")
    public void user_input_the_location() {
        koalaPalaceRoomCreationPage.locationBox.sendKeys(ConfigReader.getProperty("location"));
    }

    @When("user input description")
    public void user_input_description() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        koalaPalaceRoomCreationPage.descriptionBox.sendKeys(ConfigReader.getProperty("description"));
    }

    @When("user input price")
    public void user_input_price() {
       koalaPalaceRoomCreationPage.priceBox.sendKeys(ConfigReader.getProperty("price"));
    }

    @When("user select Room type")
    public void user_select_room_type() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select select = new Select(koalaPalaceRoomCreationPage.roomType);
        select.selectByVisibleText(ConfigReader.getProperty("room_type"));
    }

    @When("user input Max adult count")
    public void user_input_max_adult_count() {
       koalaPalaceRoomCreationPage.adultBox.sendKeys(ConfigReader.getProperty("adult"));
    }

    @When("user input Max children count")
    public void user_input_max_children_count() {
        koalaPalaceRoomCreationPage.childBox.sendKeys(ConfigReader.getProperty("child"));
    }

    @When("user clicks check box")
    public void user_clicks_check_box() {
       koalaPalaceRoomCreationPage.approvedCheckBox.click();
    }

    @When("click Save button")
    public void click_save_button() {
       koalaPalaceRoomCreationPage.saveButton.click();
    }

    @Then("verify hotel room created successfully")
    public void verify_hotel_room_created_successfully() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(koalaPalaceRoomCreationPage.successMessage));
        Assert.assertEquals(ConfigReader.getProperty("expected_success_message"),koalaPalaceRoomCreationPage.successMessage.getText());
        koalaPalaceRoomCreationPage.okButton.click();
        Driver.closeDriver();
    }

    @When("user input the code to the code box")
    public void user_input_the_code_to_the_code_box() throws InterruptedException {
        Thread.sleep(10);
     koalaPalaceRoomCreationPage.searchBox.sendKeys(ConfigReader.getProperty("name"));
    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        koalaPalaceRoomCreationPage.searchButton.click();
    }

    @Then("verify name field with your hotel name")
    public void verify_name_field_with_your_hotel_name() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       Assert.assertTrue(koalaPalaceRoomCreationPage.nameField.getText().contains("name"));
       Driver.closeDriver();
    }
}
