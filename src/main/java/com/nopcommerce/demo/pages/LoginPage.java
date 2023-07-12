package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility
{
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By guestCheckout = By.xpath("//button[normalize-space()='Checkout as Guest']");


    /**
     * get Welcome Text
     */
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    /**
     * click On Guest Checkout
     */
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }
}
