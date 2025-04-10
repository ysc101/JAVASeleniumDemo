package baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import dev.failsafe.internal.util.Assert;

import java.security.*;

public class CommonUtils extends BaseClass

{

	// @Author Name
	// This Method is use for fetch the external Excel sheet Data

	// need to pass 2 Parameter 1 is int row and 2 is int column

	public static String getExcelData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\ZPFMS_TEST_DATA.xlsx");
		String value = WorkbookFactory.create(file).getSheet("ZPFMS_TEST_DATA").getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}
}
