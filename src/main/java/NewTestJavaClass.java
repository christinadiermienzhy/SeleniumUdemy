import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NewTestJavaClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\USER.GB-600-QA01.000\\IdeaProjects\\testSelenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
      //  driver.manage().window().setSize(new Dimension (800,1200));
       /* driver.navigate().to("https://jamboard.google.com/d/1luYrn5WoYIjJXPIPrN-2v4C1YhsPhx0BAodCO0OjvZc/viewer?f=9");
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());*/
       /* WebElement link =  driver.findElement(By.linkText("Контакты"));
        link.click();
        System.out.println(driver.getCurrentUrl());*/
      /*  WebElement link =   driver.findElement(By.partialLinkText("COVID-19"));
        link.click();
        System.out.println(driver.getCurrentUrl());*/
      /*  WebElement searchField  = driver.findElement(By.name("search"));
        searchField.click();
        WebElement wishList = driver.findElement(By.xpath("//a[@class='header-actions__button header-actions__button_type_wish']"));
        wishList.click();
        System.out.println(driver.getCurrentUrl());
        WebElement element2 = driver.findElement(By.xpath("//a[@class='header__logo']"));
        driver.quit();*/
        driver. findElement(By.xpath("//button[@class=\"menu-toggler\"]")).click();
        driver.navigate().to("https://github.com/");
        WebElement testButtonSubmit =  driver.findElement(By.xpath("//div[@class=\"d-flex flex-column flex-sm-row flex-items-center\"]/button"));
       // System.out.println(testButtonSubmit.getText());
        if (testButtonSubmit.getText().equals("Sign up for GitHub")){
            System.out.println("Success!!!!");
        } else{
            System.out.println("Errorrrrrr");
        }
        //testButtonSubmit.submit();

        WebElement signIn = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        signIn.click();

    }
}
