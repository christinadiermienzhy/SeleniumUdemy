import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\USER.GB-600-QA01.000\\IdeaProjects\\testSelenium\\drivers\\geckodriver.exe");
       // WebDriver driver  =  new FirefoxDriver();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// указываем в  начале программы для создания дополнительного ожидания при каждом действии вебдрайвеера
       // driver.get("https://www.selenium.dev/");
        //driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(900,600));
       // driver.get("https://google.com");
      /*  driver.navigate().to("https://www.selenium.dev/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());*/
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        WebElement link =  driver.findElement(By.linkText("Войти"));
        WebElement link2 = driver.findElement(By.partialLinkText("Андский"));
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton= driver.findElement(By.className("searchButton"));
        WebElement contentBlock = driver.findElement(By.id("main-tfa"));
        driver.findElement(By.tagName("input"));//будет брать первый найденный
       // System.out.println(link + "этот текст");
        WebElement makeArticle =  driver.findElement(By.cssSelector("span.mw-ui-button"));
        WebElement logo =  driver.findElement(By.xpath("//div[@id=\"p-logo\"]/a"));

        driver.quit();
    }

}
