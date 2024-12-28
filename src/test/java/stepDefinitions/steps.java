package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;//package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class steps {
    WebDriver driver;

//    public static void main(String[] args) {
//        WebDriver driver =new ChromeDriver();
//        driver.manage().timeouts().getImplicitWaitTimeout();
//        driver.get("https://www.tgsrtcbus.in/oprs-web/");
//        driver.manage().window().maximize();
////        WebElement dropdown=driver.findElement(By.xpath("//input[@name='fromPlaceName']"));
////        dropdown.sendKeys("Hyderabad");
////      //  driver.findElement(By.xpath("//*[@id=\"ui-id-58\"]")).click();
////Select sel=new Select(dropdown);
////sel.selectByVisibleText("HYDERABAD");
//      boolean disply=  driver.findElement(By.xpath("//div[@class='headerLogo']")).isDisplayed();
//        System.out.println("it is displayed="+disply);
//        driver.findElement(By.linkText("Driver Info")).click();
//        driver.findElement(By.xpath("//input[@name='serviceCode']")).sendKeys("7468");
//        driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
//       WebElement dropdown= driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
// dropdown.click();
// Select de=new Select(dropdown);
// de.selectByValue("6");
// WebElement dropdown1=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
//dropdown1.click();
// Select de1=new Select(dropdown1);
// de1.selectByValue("2024");
// driver.findElement(By.linkText("27")).click();
// driver.findElement(By.xpath("//input[@type='submit']")).click();
//        System.out.println( "driver is available="+driver.findElement(By.xpath("//td[@class='formheadercolor']")).isDisplayed());
//driver.quit();
//    }
//}
@Given("the user should navigate to TSRTC website")
public void the_user_should_navigate_to_tsrtc_website() {
     driver =new ChromeDriver();
        driver.manage().timeouts().getImplicitWaitTimeout();
        driver.get("https://www.tgsrtcbus.in/oprs-web/");
        driver.manage().window().maximize();
    System.out.println("user is on the website");
}

@Then("verify the TSRTC logo on the first page of the site")
public void verify_the_tsrtc_logo_on_the_first_page_of_the_site() {
    boolean display=  driver.findElement(By.xpath("//div[@class='headerLogo']")).isDisplayed();
       System.out.println("logo is displayed="+display);

}

@Given("user should navigate to driver information page")
public void user_should_navigate_to_driver_information_page() {
    driver.findElement(By.linkText("Driver Info")).click();
    System.out.println("user is on the driver information page");
}

@When("user enter the service number and date of journey")
public void user_enter_the_service_number_and_date_of_journey() {
          driver.findElement(By.xpath("//input[@name='serviceCode']")).sendKeys("7468");
     driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
     WebElement dropdown= driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
dropdown.click();
    Select de=new Select(dropdown);
de.selectByValue("6");
 WebElement dropdown1=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
dropdown1.click();
 Select de1=new Select(dropdown1);
 de1.selectByValue("2024");
 driver.findElement(By.linkText("27")).click();
    System.out.println("user has selected all ticket data");
}

@When("user should click on submit button")
public void user_should_click_on_submit_button() {
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    System.out.println("user has clicked on the submit button");


}

@Then("verify the driver information displayed on the webpage")
public void verify_the_driver_information_displayed_on_the_webpage() {
        System.out.println( "driver is available="+driver.findElement(By.xpath("//td[@class='formheadercolor']")).isDisplayed());
driver.quit();
    System.out.println("user have seen the information");

}}