package PageObjects;

import org.openqa.selenium.By;

import Commonfunctions.CommonFunctions;


public class EbayHomePage extends CommonFunctions {
	
	CommonFunctions cf=new CommonFunctions();
	String textbox_id="gh-ac";
	String searchBox_xpath ="//*[@id='gh-btn']";
	String ebay_button_xpath="//*[@id='gh-la']";
	String healthyAndbeauty_xpath="//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Health & Beauty')]";
	String vision_care_xpath="//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Vision Care')]";
	
	public void click_Logo() throws InterruptedException {
		cf.click(ebay_button_xpath);
	}
	
	public void enterText(String text) throws InterruptedException {
		
		cf.inputText(textbox_id,text);
		cf.click(searchBox_xpath);
	}
	
	public void hoverText() {
		cf.hoverOver(healthyAndbeauty_xpath);
	}
	public void click_link() throws InterruptedException {
		Thread.sleep(5000);
		cf.click(vision_care_xpath);
	}
	
	
}
	
