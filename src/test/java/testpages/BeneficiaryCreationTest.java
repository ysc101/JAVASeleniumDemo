package testpages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom.BeneficiaryCreation;

public class BeneficiaryCreationTest extends BaseClass {

	BeneficiaryCreation objBeneficiaryCreationpage;

	@BeforeClass
	public void openBrowser() throws IOException {
		initializeBrowser();
		objBeneficiaryCreationpage = new BeneficiaryCreation();

	}

	@Test(priority = 0)
	public void loginWithMaker() throws EncryptedDocumentException, IOException {

		objBeneficiaryCreationpage.enterUserName();
		objBeneficiaryCreationpage.enterPassword();
		objBeneficiaryCreationpage.clickOnLogin();

	}

	@Test(priority = 1)
	public void MasterMenuisClickable() throws EncryptedDocumentException, IOException {
		objBeneficiaryCreationpage.clickOnMasterMenu();
	}

	@Test(priority = 2)
	public void vendorcreationMenuisclickable() throws EncryptedDocumentException, IOException, InterruptedException {

		objBeneficiaryCreationpage.clickOnvendorcreationMenu();
	}

	@Test(priority = 3)
	public void BenefiicaryNamecanbeenter() throws EncryptedDocumentException, IOException, InterruptedException {
		objBeneficiaryCreationpage.enterPartyDetails();
	}

	@Test(priority = 4)
	public void MobileNumbercanbeenter()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		Thread.sleep(2000);
		objBeneficiaryCreationpage.entermobilenumberdetails();
	}

	@Test(priority = 5)
	public void emailIDcanbeenter() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.enterEMailID();
	}

	@Test(priority = 6)
	public void Addresscanbeenter() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendoraddress();
	}

	@Test(priority = 7)
	public void vendorpincodecanbeenter()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendorpincode();
	}
	@Test(priority=8)
	public void vendorcitycanbeenter() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.entervendorcity();
	}
	@Test(priority=9)
	public void vendorpancanbeenter() throws EncryptedDocumentException, IOException, InterruptedException {
		objBeneficiaryCreationpage.enterpannumber();
	}
	@Test(priority=10)
	public void vendorcanentertanno() throws EncryptedDocumentException, IOException, InterruptedException {
		objBeneficiaryCreationpage.entertannumber();
	}
	@Test(priority=11)
	public void vendorcanentergstno() throws EncryptedDocumentException, IOException, InterruptedException {
		
	objBeneficiaryCreationpage.entergstnumber();
	}
	@Test(priority=12)
	public void enteraddharno() throws EncryptedDocumentException, IOException, InterruptedException {
		objBeneficiaryCreationpage.enteradhaarnumber();
	}
	@Test(priority=13)
	public void enterifscode() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.enterIFSCCode();
	}
	@Test(priority=14)
	public void usercanenteraccountnumber() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.enterVendorAccountnumber();
	}
	@Test(priority=15)
	public void usercanenterConfirmVendorAccountnumber() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.ConfirmVendorAccountnumber();
	}
	@Test(priority=16)
	public void usercanuploadpassbookcopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.fileuploadforpassboookcopy();
	}
//	@Test(priority = 32) 
//	public void uploadPNGFileAndHandelPopUpPassbook() throws EncryptedDocumentException, IOException, InterruptedException {
//		objBeneficiaryCreationpage.verifyUploadPNGFileAndPopupIsDisplayedPassbook(); 
//	}
	@Test(priority=17)
	public void Okbuttonisclickable()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}
	@Test(priority=18)
	public void usercanuploadChequecopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.fileuploadforchequecopy();
	}
	@Test(priority=19)
	public void Okbuttonisclickableforcheque()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}
	@Test(priority=20)
	public void usercanuploadpancopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.fileuploadforpancopy();
	}
	@Test(priority=21)
	public void Okbuttonisclickableforpan()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}
	@Test(priority=22)
	public void usercanuploadtancopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.fileuploadfortancopy();
	}
	@Test(priority=23)
	public void Okbuttonisclickablefortan()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}
	@Test(priority=24)
	public void usercanuploadgstcopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.fileuploadforgstcopy();
	}
	@Test(priority=25)
	public void Okbuttonisclickableforgst()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}
	@Test(priority=26)
	public void usercanuploadadhaarcopy() throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.fileuploadforadhaarcopy();
	}
	@Test(priority=27)
	public void Okbuttonisclickableforadhaar()
			throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		objBeneficiaryCreationpage.clickokafterfileupload();
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
