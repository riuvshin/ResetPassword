package org.openqa.selenium.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResetPass {
	 public static void main(String[] args) {
	       
	        final WebDriver driver = new FirefoxDriver();
	    
	 
	        driver.get("http://exoplatform.cloud-workspaces.com/portal/dologin?initialURI=dawdawdawdwadortal/intranet/home");
	   

	        driver.findElement(By.linkText("Forgot Password?")).click();
	        driver.findElement(By.id("email")).clear();
	        driver.findElement(By.id("email")).sendKeys("zdombrovskaya@exoplatform.com");
	        driver.findElement(By.id("submitButton")).click();
	        WebDriverWait wait = new WebDriverWait(driver, 5); // wait for max of 5 seconds

	        ExpectedCondition<Boolean> resultsAreDisplayed = new ExpectedCondition<Boolean>() { // expected condition: element "pg" is displayed
      public Boolean apply(WebDriver arg0) {
	        return driver.findElement(By.xpath("//span[text()='Request completed, check your email for instructions.']")).isDisplayed();
	            }
	        };

	        wait.until(resultsAreDisplayed);
	        
	        driver.quit();}
}
