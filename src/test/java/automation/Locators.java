package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ListIterator;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/percent-calculator.html");

        Thread.sleep(2000);

//		driver.findElement(By.id("cpar1")).click();
//        driver.findElement(By.id("cpar1")).sendKeys("1000");
//        Thread.sleep(5000);
//        driver.findElement(By.id("cpar2")).sendKeys("120");
//        Thread.sleep(5000);
//        driver.findElement(By.id("cpar2")).clear();
//        Thread.sleep(5000);
//        System.out.println("Value is " + driver.findElement(By.id("cpar1")).getAttribute("value"));

//		List<WebElement> listByTag = driver.findElements(By.tagName("p"));
//		System.out.println("List of tag");
//		for(WebElement element : driver.findElements(By.tagName("p"))) {
//			System.out.println(element.getText());
//		}
//        for(WebElement element : listByTag) {
//            System.out.println(element.getText());
//        }
//        System.out.println("List size is : " + listByTag.size());

//        ListIterator list_it= listByTag.listIterator();
//        while (list_it.hasNext()){
//            System.out.println(list_it.next().getClass().);
//        }

//		System.out.println("Link Text : " + driver.findElement(By.linkText("Scientific")).getTagName());
//		System.out.println("Link Text : " + driver.findElement(By.linkText("Scient")).getTagName());
//
//		System.out.println("Partial Link Text : " + driver.findElement(By.partialLinkText("Scient")).getTagName());
//        System.out.println(driver.findElement(By.tagName("p")).getText());


//		driver.findElement(By.className("inlong")).sendKeys("Prashant");

//        List<WebElement> listOfTextbox = driver.findElements(By.className("flsjhfdlishdf"));
//        List<WebElement> listOfTextbox = driver.findElements(By.className("inlong"));

//        System.out.println("Size of list i.e. number of text boxes is : " + listOfTextbox.size());

//		System.out.println("Class " + driver.findElement(By.className("verybigtext")).getText());

//		driver.findElement(By.name("c21par1")).sendKeys("10");
//		Thread.sleep(5000);
//		driver.findElement(By.name("c21par2")).sendKeys("120");
//		Thread.sleep(5000);
//		driver.findElement(By.name("c21par2")).clear();
//		Thread.sleep(5000);
//		System.out.println("Value is " + driver.findElement(By.name("c21par1")).getAttribute("value"));


//		driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[1]")).sendKeys("10");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[2]")).sendKeys("120");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[2]")).clear();
//		Thread.sleep(5000);
//		System.out.println("Value is " + driver.findElement(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[1]/td/input[1]")).getAttribute("value"));

//		driver.findElement(By.cssSelector("input[name='cpar1']")).sendKeys("10");   // tag[Attribute='value']
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("input#cpar2")).sendKeys("120");
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("input[name='cpar2']")).clear();
//		Thread.sleep(5000);
//		System.out.println("Value is " + driver.findElement(By.cssSelector("input[name='cpar1']")).getAttribute("value"));

        Thread.sleep(5000);


        driver.quit();
    }
}
