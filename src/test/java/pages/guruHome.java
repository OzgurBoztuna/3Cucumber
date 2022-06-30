package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;


    public class guruHome extends BrowserUtils {
        public guruHome() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//a[.='Add Customer']")
        private WebElement addCustomerButton;
        @FindBy(xpath = "//h1[.='Add Customer']")
        private WebElement CustomerHeader;

        public void setAddCustomerButton() {
            addCustomerButton.click();
            Actions actions = new Actions(Driver.getDriver());
            actions.moveByOffset(0,0).click().build().perform();
        }
        public void setVerifyCustomerHeader(String str){
            Assert.assertEquals(str, CustomerHeader.getText());
            BrowserUtils.staticWait(2);
        }

        @FindBy(xpath = "//label[@for='done']")
        private WebElement doneButton;
        @FindBy (xpath = "//label[@for='pending']")
        private WebElement pendingButton;

        public void setBackgroundCheck(String str){
            if(str.equalsIgnoreCase(doneButton.getText())){
                doneButton.click();
            }else if(str.equalsIgnoreCase(pendingButton.getText())){
                pendingButton.click();
            }
        }

        @FindBy(xpath = "//input[@id='fname']")
        private WebElement firstName;
        @FindBy(xpath = "//input[@id='lname']")
        private WebElement lastName;
        @FindBy(xpath = "//input[@id='email']")
        private WebElement emailID;
        @FindBy(xpath = "//textarea[@id='message']")
        private WebElement address;
        @FindBy(xpath = "//input[@id='telephoneno']")
        private WebElement phoneNumber;
        @FindBy(xpath = "//input[@type='submit']")
        private WebElement submit;


        public void setFillingInTableInfo(String firstname, String lastname, String email,
                                          String addRESS, String phoneNum){
            firstName.sendKeys(firstname);
            lastName.sendKeys(lastname);
            emailID.sendKeys(email);
            address.sendKeys(addRESS);
            phoneNumber.sendKeys(phoneNum);
            submit.click();
            BrowserUtils.staticWait(3);
        }

        @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']")
        private WebElement verifyAccessDetails;

        public void setVerifyAccessDetails(String str) {
            Assert.assertEquals(str,verifyAccessDetails.getText());
            // BrowserUtils.staticWait(2);
        }

    }
