package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Sign_Up {
    
  @Test
    public void signup() throws InterruptedException {
       
         System.setProperty("webdriver.chrome.driver","C:/Users/priyanka.sc/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
      
         Main_Page mainpage2 = new Main_Page(driver);
         mainpage2.goTo();
         Thread.sleep(1000);
         mainpage2.signupapplication("Priyanka","S c","priyareddysc@gmail.com","priya123" ,"12/16/1998","9448359166","Hello ");
       
    }






}
