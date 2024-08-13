package com.crm.FinalMockA6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsGiftCardTaskCase{
		public DwsGiftCardTaskCase(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[1]/input")
		WebElement RecipientName;
		public void rName(String rName)
		{
			RecipientName.sendKeys(rName);
		}
		
		private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[2]/input")
		WebElement recipientEmail;
		public void rEmail(String rEmail)
		{
			
			recipientEmail.sendKeys(rEmail);
		}
		
		private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[3]/input")
		WebElement SenderName;
		
		public WebElement getSName()
		{
			return SenderName;
		}
		public void sName(String sName)
		{
			SenderName.clear();
			SenderName.sendKeys(sName);
		}
		
		private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[4]/input")
		WebElement senderEmail;
		
		public WebElement getSEmail()
		{
			return senderEmail;
		}
		public void sEmail(String sEmail)
		{
			senderEmail.clear();
			senderEmail.sendKeys(sEmail);
		}
		
		private @FindBy(xpath ="//div[@class=\"giftcard\"]/div[5]/textarea")
		WebElement GiftMsg;
		public void giftMsg(String msg)
		{
			GiftMsg.sendKeys(msg);
		}
		
		private @FindBy(xpath ="//input[@class=\"qty-input\"]")
		WebElement GiftQty;
		public void giftQty(String qty)
		{
			GiftQty.clear();
			GiftQty.sendKeys(qty);
		}
		
		private @FindBy(xpath = "//input[@id='add-to-cart-button-1']")
		WebElement AddGiftToCart;
		public void addGift()
		{
			AddGiftToCart.click();
		}
		
		private @FindBy(className = "cart-label")
		WebElement cart_icon;
		
		public void cart()
		{
			cart_icon.click();
		}
		
		private @FindBy(xpath = "//input[@name='removefromcart']")
		WebElement RemoveFromCart;
		public void remove()
		{
			RemoveFromCart.click();
		}
		
		private @FindBy(xpath = "//input[@value='Update shopping cart']")
		WebElement UpdateCart;
		public void updateCart()
		{
			UpdateCart.click();
		}
		
		private @FindBy(id="termsofservice")
		WebElement AcceptTerms;
		public void accept()
		{
			AcceptTerms.click();
		}
		
		private @FindBy(id="checkout")
		WebElement ChekoutBtn;
		public void checkout()
		{
			ChekoutBtn.click();
		}

		private @FindBy(xpath = "(//div[@class='picture'])[2]")
		WebElement giftcard25;
		
		public void giftCard25()
		{
			giftcard25.click();
		}

		private @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
		WebElement addtocart;
		
		public void addToCart()
		{
			addtocart.click();
		}
		
		private @FindBy(xpath = "(//a[text()='$25 Virtual Gift Card'])[2]")
		WebElement verifyText;
		
		public void verifyText()
		{
			verifyText.click();
		}
		public WebElement getVerifyText()
		{
			return verifyText;
		}
		
		
		private @FindBy(id="add-to-cart-button-2")
		WebElement addtocart2;
		
		public void addToCart2()
		{
			addtocart2.click();
		}
}