package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class KoalaPalaceRoomCreationPage {
    public KoalaPalaceRoomCreationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Log in")
    public WebElement MainLoginButton;

    @FindBy(id = "UserName")
    public WebElement userNameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy (id = "btnSubmit")
    public WebElement loginButton;

    @FindBy (linkText = "Hotel Management")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoom;

    @FindBy (xpath = "//span[@class='hidden-480']")
    public WebElement addRoomButton;

    @FindBy(id = "IDHotel")
    public WebElement hotelId;

    @FindBy(id = "Code")
    public WebElement codeBox;

    @FindBy(id = "Name")
    public WebElement nameBox;

    @FindBy(id = "Location")
    public WebElement locationBox;

    @FindBy(xpath = "//textarea[@role='textbox']")
    public WebElement descriptionBox;

    @FindBy(id = "Price")
    public WebElement priceBox;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;

    @FindBy(id = "MaxAdultCount")
    public WebElement adultBox;

    @FindBy(id = "MaxChildCount")
    public WebElement childBox;

    @FindBy(id = "IsAvailable")
    public WebElement approvedCheckBox;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okButton;

    @FindBy (xpath = "//input[@name='IDHotelRoom']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButton;

    @FindBy (xpath = "(//tr[1]//td[1])")
    public WebElement nameField;


}
