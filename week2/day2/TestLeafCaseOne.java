package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		//FirefoxDriver driver1 = new FirefoxDriver();
		//EdgeDriver driver11 = new EdgeDriver();

		//load the Webpage
		driver.get("http://leaftaps.com/opentaps/control/main");

		//maximize the window
		driver.manage().window().maximize();

		//Find an element and insert username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		//Find an element and insert password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Find an element and click login
		driver.findElement(By.className("decorativeSubmit")).click();

		//Get the title of the page
		String title=driver.getTitle();

		//Print the title
		System.out.println(title);

		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click lead
		driver.findElement(By.linkText("Leads")).click();

		//click createlead
		driver.findElement(By.linkText("Create Lead")).click();

		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafs");

		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sethu");

		//Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");

		//click CreateLead
		driver.findElement(By.name("submitButton")).click();

		//Verify the text
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		System.out.println(text);
	}

}
