package pom;

import java.awt.AWTException;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import baseclasses.BaseClass;
import baseclasses.CommonUtils;

public class BeneficiaryCreation extends BaseClass {

	String accNumber = "";
	@FindBy(xpath = "//input[@id='txtUser']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='txtPass']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Master']")
	public WebElement Mastermenu;

	@FindBy(xpath = "/html/body/form/div[5]/div[3]/div/div/ul/li[3]/ul/li[1]/a")
	public WebElement vendorcreation;

	@FindBy(xpath = "//input[@id='body_txtPartyName']")
	public WebElement vendorname;

	@FindBy(xpath = "//input[@id='body_txtMobile']")
	public WebElement mobile;

	@FindBy(xpath = "//input[@id='body_txtEmail']")
	public WebElement vendoremail;

	@FindBy(xpath = "//textarea[@id='body_txtAddress']")
	public WebElement vendoraddress;

	@FindBy(xpath = "//input[@id='body_txtPinCode']")
	public WebElement pincode;

	@FindBy(xpath = "//input[@id='body_txtCity']")
	public WebElement city;

	@FindBy(xpath = "//input[@id='body_txtPANNO']")
	public WebElement vendorpan;

	@FindBy(xpath = "//input[@id='body_txtTANNO']")
	public WebElement vendortan;

	@FindBy(xpath = "//input[@id='body_txtGSTNO']")
	public WebElement vendorgst;

	@FindBy(xpath = "//input[@id='body_txtAdhar']")
	public WebElement vendoradhar;

	@FindBy(xpath = "//input[@id='body_txtIFSC']")
	public WebElement vendorIFSC;

	@FindBy(xpath = "//input[@id='body_txtMICR']")
	public WebElement vendorMICR;

	@FindBy(xpath = "//input[@id='body_txtBankName']")
	public WebElement vendorBank;

	@FindBy(xpath = "//input[@id='body_txtBranchName']")
	public WebElement vendorBranch;

	@FindBy(xpath = "//input[@id='body_txtAccountNo']")
	public WebElement vendoracc;

	@FindBy(xpath = "//input[@id='body_txtConfirmAccount']")
	public WebElement vendoraccconfirm;

	@FindBy(xpath = "//input[@id='FileUploadPassbook']")
	public WebElement fileuploadpassboook;

	@FindBy(xpath = "//input[@id='FileUploadCheck']")
	public WebElement fileuploadcheque;

	@FindBy(xpath = "//input[@id='FileUploadPan']")
	public WebElement fileuploadpan;

	@FindBy(xpath = "//input[@id='FileUploadTan']")
	public WebElement fileuploadtan;

	@FindBy(xpath = "//input[@id='FileUploadGST']")
	public WebElement fileuploadgst;

	@FindBy(xpath = "//input[@id='FileUploadAadhar']")
	public WebElement fileuploadadhar;

	@FindBy(xpath = "//input[@id='body_btnHide']")
	public WebElement fileuploadok;

	@FindBy(xpath = "//span[@id='body_lblFileUploadPassbook']")
	public WebElement fileuploadclick;

	@FindBy(xpath = "//input[@id='body_btnSubmit']")
	public WebElement vendorsave;

	@FindBy(id = "body_btnModalOK")
	public WebElement vendorsaveyes;

	@FindBy(xpath = "//input[@id='body_btnRedirect']")
	public WebElement vendorsaveok;

	@FindBy(xpath = "//input[@id='body_btnPrint']")
	public WebElement printbutton;

	@FindBy(className = "cancel-button")
	public WebElement cancelbutton;

	@FindBy(xpath = "//input[@id='body_btnBack']")
	public WebElement backbutton;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;

	@FindBy(xpath = "//a[normalize-space()='Management']")
	public WebElement Management;

	@FindBy(xpath = "//a[normalize-space()='Beneficiary Approval']")
	public WebElement vendorapproval;

	@FindBy(xpath = "	//input[@id='body_grdApprovalPending_chkApproval_0']")
	public WebElement selectcheckbox;

	@FindBy(id = "body_btnApprove")
	public WebElement approvebutton;

	@FindBy(xpath = "//input[@id='body_btnOK']")
	public WebElement approveyesbutton;

	@FindBy(xpath = "//input[@id='body_btnDeductionApprovalOk']")
	public WebElement approveokbutton;

	public BeneficiaryCreation() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserName() throws EncryptedDocumentException, IOException {
		username.sendKeys(CommonUtils.getExcelData(1, 1));
	}

	public void enterPassword() throws EncryptedDocumentException, IOException {
		password.sendKeys(CommonUtils.getExcelData(1, 2));
	}

	public void clickOnLogin() {
		login.click();
	}

	public void clickOnMasterMenu() {
		Mastermenu.click();
	}

	public void clickOnvendorcreationMenu() {
		vendorcreation.click();
	}

	public void enterPartyDetails() throws EncryptedDocumentException, IOException, InterruptedException {
		vendorname.sendKeys(CommonUtils.getExcelData(2, 1));
		// vendorname.sendKeys(Keys.TAB);
		// Thread.sleep(1000);
	}

	public void entermobilenumberdetails()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		Thread.sleep(1500);

		mobile.sendKeys(CommonUtils.getExcelData(3, 1));
		mobile.sendKeys(Keys.TAB);

	}

	public void enterEMailID() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(vendoremail));
		emailField.sendKeys(CommonUtils.getExcelData(4, 1));
		emailField.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendoraddress()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		vendoraddress.sendKeys(CommonUtils.getExcelData(5, 1));
		vendoraddress.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendorpincode()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		pincode.sendKeys(CommonUtils.getExcelData(6, 1));
		pincode.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void entervendorcity() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		city.sendKeys(CommonUtils.getExcelData(7, 1));
		city.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}
	public void enterpannumber() throws EncryptedDocumentException, IOException, InterruptedException {
		vendorpan.sendKeys(CommonUtils.getExcelData(8, 1));
		vendorpan.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
	}	
	public void entertannumber() throws EncryptedDocumentException, IOException, InterruptedException {
		vendortan.sendKeys(CommonUtils.getExcelData(9, 1));
		vendortan.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}
}