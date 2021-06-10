package Test_Automation.Helper;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {
    public static String captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
        try
        {
            TakesScreenshot ts = (TakesScreenshot)driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String dest = "C:\\Driver\\"+screenshotName+".png";
            File destination = new File(dest);
            org.apache.commons.io.FileUtils.copyFile(source,destination);
            System.out.println("Screenshot taken");
            return dest;
        }
        catch (Exception e)
        {
            System.out.println("Exeption while taking screenshot " +e.getMessage());
            return e.getMessage();
        }
    }
}
