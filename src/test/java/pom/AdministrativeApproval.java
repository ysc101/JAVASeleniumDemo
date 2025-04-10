package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;

public class AdministrativeApproval extends BaseClass{
	
	
	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;
	
	@FindBy(xpath = "//a[normalize-space()='Administrative Work']")
	public WebElement AdministrativeWork;
	
	@FindBy(xpath = "//*[@id=\"ctl01\"]/div[5]/div[3]/div/div[1]/ul/li[1]/ul/li[1]/a/text()")
	public WebElement AADeatils; 
	
	@FindBy(xpath="//a[@href='adminapprovalno.ASPX']")
	public WebElement AdminApprovalCreation;

	public AdministrativeApproval() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(1, 1));
		
	}
	public void enterPassword() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(1, 2));	}
	public void clickOnLogin() {
		login.click();
	}
	public void ClickonAdministrtiveWork() {
	AdministrativeWork.click();
	}
	
	public void HoverfromAdministrativeDeatils() throws InterruptedException {
		Actions hover=new Actions(driver);
		hover.moveToElement(AADeatils).perform();
		Thread.sleep(2000);
	}
	public void AACreation() {
		AdminApprovalCreation.click();
		
	}
}
