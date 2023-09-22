package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicTest
{
    @Test
   public void firstTest()
   {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://mvnrepository.com/");

   }

}
