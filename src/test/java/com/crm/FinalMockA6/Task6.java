package com.crm.FinalMockA6;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import BaseClass.VtigerBaseClass;
import PomDwsVtiger.Home;
import PomDwsVtiger.Organization;
import utility.ExcelUtility;
import utility.JavaUtility;

public class Task6  extends VtigerBaseClass{
	ExcelUtility eUtil = new ExcelUtility();
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException
	{
		Home h = new Home(driver);
		h.organizations();
		
		int row = 0;
		Organization org = new Organization(driver);
		org.plusIcon();
		String orgName= eUtil.getData("Org", row++, 0);
		org.organizationName(orgName+JavaUtility.generateRandomNumber(1000));
				
		org.assignedto(eUtil.getData("Org", row++, 0));
		org.saveBtn();
		
		assertTrue((org.getCreatedOrgText().getText()).contains(orgName));
	}
}



