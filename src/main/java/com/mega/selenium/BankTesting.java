package com.mega.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class BankTesting {
@Test
    public void test(){

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wellsfargo.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();


        WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
        userid.sendKeys("soha");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("13456$$444");
        WebElement signon=driver.findElement(By.xpath("//input[@id='btnSignon']"));
        signon.click();
        driver.getCurrentUrl();
        System.out.println("My url ="+driver.getCurrentUrl());
    }
    @Test
     public void test2(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.citi.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("soha");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("1256$$$SS");
        WebElement signin=driver.findElement(By.xpath("//button[@id='signInBtn']"));
        signin.click();
    }
    @Test
    public void test1(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement userid=driver.findElement(By.xpath("//input[@id='onlineId1']"));
        userid.sendKeys("soha");
        WebElement password=driver.findElement(By.xpath("//input[@id='passcode1']"));
        password.sendKeys("123456789");
        WebElement signin=driver.findElement(By.xpath("//button[@id='signIn']"));
        signin.click();
        driver.getCurrentUrl();
        System.out.println("My url ="+driver.getCurrentUrl());
    }


    @Test
    public void test3(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.capitalone.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        WebElement username=driver.findElement(By.xpath("//input[@id='ods-input-0']"));
        username.sendKeys("Sohana");
        WebElement password=driver.findElement(By.xpath("//input[@id='ods-input-1']"));
        password.sendKeys("123456$$$");
        WebElement signin=driver.findElement(By.xpath("//button[@id='noAcctSubmit']"));
        signin.click();
        driver.getCurrentUrl();
        System.out.println("My url ="+driver.getCurrentUrl());
    }

}
