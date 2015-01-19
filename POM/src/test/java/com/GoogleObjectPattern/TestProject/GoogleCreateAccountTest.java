package com.GoogleObjectPattern.TestProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import PageObjects.CreateAccountPage;
import PageObjects.GooglePage;
import PageObjects.RegistrationFormPage;


/**
 * Created by Sonal Gulhane on 18/01/2015.
 */
public class GoogleCreateAccountTest
{
    @Test
    public void GoogleSearch()
    {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,

        WebDriver driver = new FirefoxDriver();
        // And now use this to visit Google
        driver.get("http://www.google.co.uk");
        driver.manage().window().maximize();

        // Find the text input element by its name
        GooglePage.click_GmailLink(driver).click();
        Assert.assertTrue("Page tile contents", driver.getTitle().contains("Gmail"));
        // Find the Link and Click on 'Create an Account'
        CreateAccountPage.click_CreateAccount(driver).click();
        RegistrationFormPage.enter_FirstName(driver).sendKeys("John");
        RegistrationFormPage.enter_LastName(driver).sendKeys("Parker");
        RegistrationFormPage.enter_UserName(driver);
        RegistrationFormPage.enter_Password(driver).sendKeys("okokokok1");
        RegistrationFormPage.enter_PasswordAgain(driver).sendKeys("okokokok1");
        RegistrationFormPage.click_MonthDropdown(driver).click();
        //Select value from the list
        RegistrationFormPage.select_MonthDropdown(driver).click();
        RegistrationFormPage.enter_Day(driver).sendKeys("15");
        RegistrationFormPage.enter_Year(driver).sendKeys("1989");
        RegistrationFormPage.enter_Gender(driver).click();
        RegistrationFormPage.enter_PhoneNumber(driver).sendKeys("1234567890");
        RegistrationFormPage.enter_AlternateEmail(driver).sendKeys("johnparker@gmail.com");
        RegistrationFormPage.click_SkipCaptcha(driver).click();
        RegistrationFormPage.click_TermsCondition(driver).click();
        RegistrationFormPage.click_NextStep(driver).click();
        Assert.assertFalse("Username required", RegistrationFormPage.verify_Error(driver).toString().contains("You can't leave this empty. "));
        driver.quit();


    }

    }