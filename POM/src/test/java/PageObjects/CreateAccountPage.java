package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sonal Gulhane on 18/01/2015.
 */
public class CreateAccountPage
{
    private static WebElement element;
    public static WebElement click_CreateAccount(WebDriver driver)
    {
        element = driver.findElement(By.partialLinkText("Create an account"));
        return element;

    }
}
