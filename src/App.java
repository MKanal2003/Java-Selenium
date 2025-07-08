import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class App {
    public static void main(String[] args) throws Exception {
       
       System.setProperty("webdriver.chrome.driver","C:\\Users\\malli\\OneDrive\\Desktop\\java\\Workspace\\sel\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://www.automationtesting.co.uk/");

       driver.findElement(By.cssSelector(".close-cookie-warning>span")).click();

       System.out.println(driver.getTitle());

       driver.findElement(By.linkText("ACCORDION")).click();
       Thread.sleep(3000);

       

       for(int i=0; i<=5; i++){
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();

        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();

        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
       }
    

       driver.findElement(By.linkText("BUTTONS")).click();
       driver.findElement(By.cssSelector("button#btn_one")).click();
       Thread.sleep(3000);

       Alert alert = driver.switchTo().alert();
       alert.accept();
       
       driver.findElement(By.cssSelector("button#btn_two")).click();
       Thread.sleep(3000);
       alert.accept();

       driver.findElement(By.cssSelector("button#btn_three")).click();
       Thread.sleep(3000);
       alert.accept();

       WebElement button = driver.findElement(By.cssSelector("button#btn_four"));

       if(button.isEnabled()){
        button.click();
       }
       if(button.isDisplayed()){
            System.out.println("Button is visibale");
       }

    driver.findElement(By.linkText("CONTACT US FORM TEST")).click();
    driver.findElement(By.cssSelector("form#contact_form > input[name='first_name']")).sendKeys("Mallu");
    driver.findElement(By.cssSelector("form#contact_form > input[name='last_name']")).sendKeys("kanal");
    driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys("mallu@tyuiol");
    driver.findElement(By.cssSelector("form#contact_form > textarea[name='message']")).sendKeys("aewrsxctygvbhuinjkmlnbjvcdxrctfgvbhuinjkmp,lmkbuvyctxtcfgvybhuinjk");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div#form_buttons > input:nth-of-type(1)")).click();

    driver.findElement(By.cssSelector("form#contact_form > input[name='first_name']")).sendKeys("Mallu");
    driver.findElement(By.cssSelector("form#contact_form > input[name='last_name']")).sendKeys("kanal");
    driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys("mallu@tyuiol");
    driver.findElement(By.cssSelector("form#contact_form > textarea[name='message']")).sendKeys("aewrsxctygvbhuinjkmlnbjvcdxrctfgvbhuinjkmp,lmkbuvyctxtcfgvybhuinjk");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div#form_buttons > input:nth-of-type(2)")).click();
    Thread.sleep(3000);

    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.automationtesting.co.uk/");

    driver.findElement(By.cssSelector(".close-cookie-warning>span")).click();
    Thread.sleep(3000);


    driver.findElement(By.linkText("DROPDOWN CHECKBOX RADIO")).click();
    driver.findElement(By.cssSelector("div:nth-of-type(1) > label")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".inner > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > label")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div:nth-of-type(3) > label")).click();
    Thread.sleep(3000);

    
    driver.findElement(By.cssSelector("div:nth-of-type(2) > label:nth-of-type(2)")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div:nth-of-type(2) > label:nth-of-type(3)")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".inner > div:nth-of-type(1) > div:nth-of-type(2) > label:nth-of-type(1)")).click();
    Thread.sleep(3000);

    
    WebElement drop = driver.findElement(By.id("cars"));
    Select sel = new Select(drop);
    sel.selectByVisibleText("Jeep");




    

    Thread.sleep(3000);
    driver.quit();
    }
}
