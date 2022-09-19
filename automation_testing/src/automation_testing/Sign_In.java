package automation_testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class Sign_In {
    
    
    @Test
    public void signin() throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver", "C:/Users/priyanka.sc/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
      
         Main_Page mainpage3 = new Main_Page(driver);
         mainpage3.goTo();
         Thread.sleep(1000);
         mainpage3.signinapplication("priyareddysc123@gmail.com","1234dfs");
        
    }
       
    }