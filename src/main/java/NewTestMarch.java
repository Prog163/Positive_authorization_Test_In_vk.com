import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NewTestMarch {

    @Test
    public void testSearchGoogle(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        //import driver
        WebDriver driver = new ChromeDriver();

            //Time wait
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

                //open vk.com
                driver.navigate().to("https://vk.com");

                //setings of window + info of the size window print
                driver.manage().window().maximize();
                System.out.println("sizeOfWindow-> " + driver.manage().window().getSize());

                //autorise
                WebElement indexEmail = driver.findElement(By.id("index_email"));
                indexEmail.sendKeys("isNotTrueEmail@google.com");
                WebElement indexPass = driver.findElement(By.id("index_pass"));
                indexPass.sendKeys("Thispasswordisnottrue");
                WebElement indexLoginButton = driver.findElement(By.id("index_login_button"));
                indexLoginButton.submit();
                /*
                    //alert
                    WebElement alertRun = driver.findElement(By.xpath("//a[@data-id='run']"));
                    alertRun.click();
                    Alert alert = driver.switchTo().alert();
                    alert.accept();
                    alertRun.click();
                    System.out.println("text from the alert-> " + alert.getText());
                    alert.accept();

                    //confirm
                    WebElement confirmRun = driver.findElement(By.xpath("//a[@data-id='run']"));
                    confirmRun.click();
                    Alert confirm = driver.switchTo().alert();
                    confirm.dismiss();
                    confirm.accept();

                    //promt
                    WebElement promtRun = driver.findElement(By.xpath("//a[@data-id='run']"));
                    promt.click();
                    Alert promt = driver.switchTo().alert();
                    promt.sendKeys("text");
                    promt.accept();
                    promt.accept();

                 */
                    /*
                    //negative + frame
                    WebDriverWait wait = new WebDriverWait(driver, 10);
                    driver.navigate().to("https://vk.com");
                    WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("...")));
                    buttonLogin.click();
                    WebElement authFrame = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("...")));
                    driver.switchTo().frame(authFrame);
                    WebElement buttonContinue = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("...")));
                    buttonContinue.click();
                    WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("...")));
                    */


            //logs
            Set<String> allLogsType = driver.manage().logs().getAvailableLogTypes();
            System.out.println("allLogsType->" + allLogsType);
            LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
            for (
                    LogEntry entry : logs
            )
                System.out.println("logs-> " + entry);

            //close browser
            driver.quit();






    }
}
