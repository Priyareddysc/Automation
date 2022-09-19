package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



//import MyPackage2.LandingPage;
@Test
public class Order_Page {



   public void sign() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/priyanka.sc/Downloads/chromedriver_win32/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           
           Main_Page OrderNow = new Main_Page (driver);
           OrderNow.goTo();
           
           OrderNow.orderapplication("Priyanka","Reddy","priyareddysc@gmail.com","passcode","9448359166","Tulasi vihar","Nagavara","Banaglore","1123456789","1","2");
          
}
}