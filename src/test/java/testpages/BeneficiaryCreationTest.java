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

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
