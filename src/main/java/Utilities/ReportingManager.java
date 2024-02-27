package Utilities;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import basepackage.basec;

public class ReportingManager 
{

	public static String captureScreenshot() throws IOException
	{
		String screenshotpath = "";
		
		//1. take screenshot object
		TakesScreenshot scrshot = (TakesScreenshot) basec.driver;
		
		File soursefile = scrshot.getScreenshotAs(OutputType.FILE);
		
		File destinationpath = new File("D:\\screenshots selenium"+"ScreenCapture"+System.currentTimeMillis() +".png");
		
		//4. copy the source file into destination path
		FileUtils.copyFile(soursefile, destinationpath);
		
		
		//5. capturing the in string
		screenshotpath = destinationpath.getAbsolutePath();
		
		return screenshotpath;
		
	}
}
