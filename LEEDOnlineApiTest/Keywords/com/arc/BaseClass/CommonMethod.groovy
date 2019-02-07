package com.arc.BaseClass

import java.awt.Robot
import java.awt.event.KeyEvent
import java.text.SimpleDateFormat

import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class CommonMethod extends BaseClass{
	
	public static FileInputStream fis;
	public static String resultFile = System.getProperty("user.dir") + "/Excel/Leedonline-AutomationReport.xlsx";
	public static int num = 0;

	public static String randomNumber() throws IOException, InterruptedException{

		String random;
		int random_num = 1;
		Random t = new Random();

		// random integers in [1000, 800000]
		random_num=	(t.nextInt(800000));
		random = String.valueOf(random_num);
		return random;

	}

	

	@Keyword
	public static void clickCancel(){
		WebUI.delay(2)
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_C)
		robot.keyRelease(KeyEvent.VK_C)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
	}

	public static String agreementDate() throws IOException, InterruptedException{

		SimpleDateFormat weekDay = new SimpleDateFormat("EEE");
		SimpleDateFormat month = new SimpleDateFormat("MMM");
		SimpleDateFormat day = new SimpleDateFormat("dd");
		SimpleDateFormat year = new SimpleDateFormat("YYYY");
		def dateNew = weekDay.format(new Date()) + ", " +day.format(new Date()) +" " +month.format(new Date()) +" " +year.format(new Date())
		println dateNew
		return dateNew
	}

	public static String dateNew() throws IOException, InterruptedException{

		SimpleDateFormat month = new SimpleDateFormat("MMM");
		SimpleDateFormat day = new SimpleDateFormat("dd");
		SimpleDateFormat year = new SimpleDateFormat("YYYY");
		//+" at " + date.format('hh:mm a')
		def dateNew = month.format(new Date()) +" " +day.format(new Date()) +", " +year.format(new Date())
		return dateNew

	}

	public static String utcTime() throws IOException, InterruptedException{

		Date currentTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		println("UTC time: " + sdf.format(currentTime));
		return sdf.format(currentTime)
	}
	
	

}
