package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom.AdministrativeApproval;

public class AdministrativeApprovalTest extends BaseClass {
	
	AdministrativeApproval objAdministrativeApproval=new AdministrativeApproval();
	
	@BeforeClass
	public void OpenBrowser() throws IOException {
		initializeBrowser();
		objAdministrativeApproval=new AdministrativeApproval();
	}
	
	@Test(priority = 0)
	public void loginWithMaker() throws EncryptedDocumentException, IOException {

		objAdministrativeApproval.enterUserName();
		objAdministrativeApproval.enterPassword();
		objAdministrativeApproval.clickOnLogin();

	}
	@Test(priority=1)
	public void ClicktoAdministartiveMenu() {
		objAdministrativeApproval.ClickonAdministrtiveWork();
		
	}
	@Test(priority=2)
	public void HoverfromAdministrativeDeatils() {
		objAdministrativeApproval.ClickonAdministrtiveWork();
		
	}
	@Test(priority=3)
	public void AACreation() {
		objAdministrativeApproval.ClickonAdministrtiveWork();
		
	}
	

}
