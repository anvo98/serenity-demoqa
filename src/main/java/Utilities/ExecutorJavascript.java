package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ExecutorJavascript {
    public void WindowScroll(WebDriver driver,int xCoord, int  yCoord){


        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("window.scroll(0,500)");
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }


    }
}

