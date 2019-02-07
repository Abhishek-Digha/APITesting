package com.arc.BaseClass
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.ss.usermodel.IndexedColors

import com.kms.katalon.core.configuration.RunConfiguration

public class BaseClass {

	//Excel Font color
	
	public static short Red = IndexedColors.RED.getIndex()
	public static short Green = IndexedColors.GREEN.getIndex();
	public static short Yellow = IndexedColors.YELLOW.getIndex();
	public static short fontWhite = IndexedColors.WHITE.getIndex();
	
	//Excel Report Configuration
	public static rowNumTAG=2
	public static String leedApiReportFile= RunConfiguration.getProjectDir()+"/LEEDDataTemplete/Leedonline-AutomationReport.xlsx"
	public static XlsReader leedReportSheet = new XlsReader(leedApiReportFile)
	/*public static String arcReportFile= RunConfiguration.getProjectDir()+"/ARCDataTemplete/ARCReport.xlsx"
	 public static XlsReader arcSheet = new XlsReader(arcReportFile)
	 public static String UploadPng=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploadPng.png"
	 public static String UploadGif=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploadGif.gif"
	 public static String UploadXls=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploasExcel.xlsx"
	 public static String UploadDocs=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploadDoc.docx"
	 public static String UploadManageCalculatorExcel = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Arc_Data_Template_v03.xlsm"
	 public static String DownloadManageCalculatorExcel = RunConfiguration.getProjectDir()+"/Download/Arc_Data_Template_v03.xlsm"
	 public static String DataResourcesPdf = RunConfiguration.getProjectDir()+"/Download/DataResources.pdf"*/
}