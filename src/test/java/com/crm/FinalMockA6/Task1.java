package com.crm.FinalMockA6;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.DwsBaseClass;
import pom.DwsGiftCard;
import pom.DwsHomePage;
import utility.FileUtility;

@Listeners(com.crm.listener.Listeners_Dws.class)
	public class Task1 extends  DwsBaseClass{
		@Test
		public void task1() throws EncryptedDocumentException, IOException {
			DwsHomePage hp = new DwsHomePage(driver);
			DwsGiftCard card = new DwsGiftCard(driver);
			Actions actions = new Actions(driver);
			
			
			actions.keyDown(Keys.PAGE_DOWN).build().perform();
			card.giftCard25();
//			dwsHomepage.giftCard();
			card.rEmail(FileUtility.getData("GiftCard", 1, 3));
			card.rName(FileUtility.getData("GiftCard", 1, 2));
			card.sEmail(FileUtility.getData("GiftCard", 1, 5));
			card.sName(FileUtility.getData("GiftCard", 1, 4));
			card.giftQty("5");
			card.addToCart2();
			hp.cart();
			assertEquals(card.getVerifyText().isDisplayed(), true);
		}
	}


