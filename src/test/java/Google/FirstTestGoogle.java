package Google;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestGoogle {

    @Test
    public void signUp(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.ru");
    }
}
