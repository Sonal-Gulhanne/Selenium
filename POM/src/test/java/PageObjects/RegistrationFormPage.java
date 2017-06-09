package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sonal Gulhane on 18/01/2015.
 */
public class RegistrationFormPage
{
    private  static WebElement element = null;

    public static WebElement enter_FirstName(WebDriver driver)
    {
        element = driver.findElement(By.id("FirstName"));
        return element;

    }

    public static  WebElement enter_LastName(WebDriver driver)
    {
        element = driver.findElement(By.id("LastName"));
        return element;

    }

    public static WebElement enter_UserName(WebDriver driver)
    {
        element = driver.findElement(By.id("GmailAddress"));
        return element;
    }

    public static WebElement enter_Password(WebDriver driver)
    {
        element = driver.findElement(By.id("Passwd"));
        return element;
    }

    public static  WebElement enter_PasswordAgain(WebDriver driver)
    {
        element =  driver.findElement(By.id("PasswdAgain"));
        return element;
    }

    public static WebElement click_MonthDropdown(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//label[@id='month-label']/span/div/div"));
        return element;
    }

    public static WebElement select_MonthDropdown(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//label[@id='month-label']/span/div[2]/div[@id=':5']"));
        return element;
    }


    public static WebElement enter_Day(WebDriver driver)
    {
        element = driver.findElement(By.id("BirthDay"));
        return  element;
    }

    public static WebElement enter_Year(WebDriver driver)
    {
        element = driver.findElement(By.id("BirthYear"));
        return element;
    }

    public static WebElement enter_Gender(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//label[@id='gender-label']/div/div/div"));
        return element;
    }

    public static WebElement enter_PhoneNumber(WebDriver driver)
    {
        element = driver.findElement(By.id("RecoveryPhoneNumber"));
        return element;
    }

    public static WebElement enter_AlternateEmail(WebDriver driver)
    {
        element = driver.findElement(By.id("recovery-email-form-element"));
        return element;
    }

    public static WebElement click_SkipCaptcha(WebDriver driver)
    {
        element =  driver.findElement(By.id("SkipCaptcha"));
        return element;
    }

    public static WebElement click_TermsCondition(WebDriver driver)
    {
        element =  driver.findElement(By.id("TermsOfService"));
        return element;
    }

    public static WebElement click_NextStep(WebDriver driver)
    {
        element = driver.findElement(By.id("submitbutton"));
        return element;
    }


    public static WebElement verify_Error(WebDriver driver)
    {
        element =  driver.findElement(By.id("errormsg_0_GmailAddress"));

        return element;
    }

     public static WebElement verify_Error1(WebDriver driver)
    {
        element =  driver.findElement(By.id("errormsg_0_GmailAddress"));

        return element;
    }


}
