package Assignment.Assignment;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class Assignment1 
{
   
  
	private int num1;
	private int num2;
	private WebDriver driver;

	@BeforeTest
	public void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		}
	
    @Test
	public void Multiplication()
	{
		num1=423;
		num2=525;
		int result = num1*num2;
		System.out.println(result);
		Assert.assertEquals(222075, result);
	}
	
	@Test
	public void division()
	{
		num1=4000;
		num2=200;
		int result=num1/num2;
		System.out.println("Result is :"+result);
		
		Assert.assertEquals(20, result);
	}
	
	@Test
	public void Addition()
	{
		num1=-234234;
		num2=345354;
		int result=num1+num2;
		System.out.println("Result is :"+result);
		int expectedresult = 111111;
		
		Assert.assertEquals(expectedresult, result);
	}
	
	@Test
	public void Substraction()
	{
		num1=234823;
		num2=-23094823;
		int result=num1+num2;
		System.out.println("Result is :"+result);
		int expectedresult = 23329646;
		
		Assert.assertEquals(expectedresult, result);
	}
	
	public void closesetup()
	{
		
	 driver.close();
	}
	
}
