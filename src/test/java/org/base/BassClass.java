package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
	public static WebDriver driver;

	public static void getDriver(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "InternetExplorer":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

			break;
		}
		driver.manage().window().maximize();

	}

	public static void loadUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {

		}

	}

	public WebElement findElementId(String AttributeValue) {
		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public WebElement findElementName(String AttributeValue) {
		WebElement element = driver.findElement(By.name(AttributeValue));
		return element;
	}

	public WebElement findElementClass(String AttributeValue) {
		WebElement element = driver.findElement(By.className(AttributeValue));
		return element;
	}

	public WebElement findElementXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public WebElement findElementTagName(String TagName) {
		WebElement element = driver.findElement(By.tagName(TagName));
		return element;
	}

	public WebElement findElementLinkText(String linkText) {
		WebElement element = driver.findElement(By.linkText(linkText));
		return element;
	}

	public WebElement findElementPartiallyLinkText(String PartialLinkText) {
		WebElement element = driver.findElement(By.partialLinkText(PartialLinkText));
		return element;
	}

	public WebElement findElementCssSelector(String CssSelector) {
		WebElement element = driver.findElement(By.cssSelector(CssSelector));
		return element;
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public String getCurrentUrl(String data) {
		String string = driver.getCurrentUrl();
		return string;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttribute(WebElement element) {
		String string = element.getAttribute("value");
		return string;
	}

	public String getAttribute(WebElement element, String AttributeName) {
		String string = element.getAttribute(AttributeName);
		return string;
	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void dragandDrop(WebElement element, String AttributeValue) {
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id(AttributeValue));
		WebElement target = driver.findElement(By.id(AttributeValue));
		actions.dragAndDrop(source, target).perform();
	}

	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}

	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();
	}

	public void robot(WebElement element, int keyEvent) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keyEvent);
		robot.keyRelease(keyEvent);
	}

	public void alertAccept(WebElement element) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void alertDismiss(WebElement element) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public Alert alertSendKeys(WebElement element, String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
		return alert;
	}

	public String alertGetText(WebElement element, String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
		alert.accept();
		String text = alert.getText();
		return text;
	}

	public File takeScreenShot(WebElement element, File Screenshot) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	public File takeScreenShotfull(WebElement element, File Screenshot) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	public void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void jsScrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void jsScrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public void selectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectByAttribute(WebElement element, String Attribute) {
		Select select = new Select(element);
		select.selectByValue(Attribute);
	}

	public void selectByIndex(WebElement element, int Index) {
		Select select = new Select(element);
		select.selectByIndex(Index);
	}

	public void selectByMultiple(WebElement element, boolean data) {
		Select select = new Select(element);
		select.isMultiple();
	}

	public void deselectByIndex(WebElement element, int Index) {
		Select select = new Select(element);
		select.deselectByIndex(Index);
	}

	public void deselectByAttribute(WebElement element, String Attribute) {
		Select select = new Select(element);
		select.deselectByValue(Attribute);

	}

	public void deselectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);

	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void closeWindow(WebElement element) {
		driver.close();

	}

	public void Quit(WebElement element) {
		driver.quit();

	}

	public static void Wait(WebElement element) throws InterruptedException {
		driver.wait();
	}

	public static String getData(String sheetName, int rowNum, int cellNum) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\FrameWorkFirstday\\Excel\\new.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int type = cell.getCellType();
		if (type == 1) {
			data = cell.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yy");
				data = format.format(date);
			} else {
				double cellValue = cell.getNumericCellValue();
				long l = (long) cellValue;
				data = String.valueOf(l);
			}
		}
		System.out.println(data);
		return data;

	}

	public static void updateData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		String data = null;
		File file = new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\FrameWorkFirstday\\\\Excel\\\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		data = cell.getStringCellValue();
		if (data.equals(oldData)) {
			cell.setCellValue(newData);
			FileOutputStream output = new FileOutputStream(file);
			workbook.write(output);
		}

	}

	public static void writeData(String sheetName, int rowNum, int cellNum, String Data) throws IOException {
		File file = new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\FrameWorkFirstday\\\\Excel\\\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(Data);
		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);
	}

}
