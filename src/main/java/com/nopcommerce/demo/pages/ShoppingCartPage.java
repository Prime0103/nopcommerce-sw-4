package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility
{
    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By priceText = By.xpath("//span[@class='value-summary']//strong");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By termsAndCondition = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By shoppingCart =By.xpath("//span[@class='cart-label']");
    By goToCart =By.xpath("//button[normalize-space()='Go to cart']");
    By quantityValue =By.xpath("//input[contains(@id,'itemquantity')]");

    /**
     * get Shopping CartText
     */
    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get PriceText
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(priceText);
    }

    public void clickOnUpdateCart()
    {
        clickOnElement(updateShoppingCart);
    }


    /**
     * select Terms And Condition
     */
    public void selectTermsAndCondition() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(termsAndCondition);
    }

    /**
     * click On CheckOut
     */
    public void clickOnCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(checkOut);
    }

    /**
     * mouse Hover To Shopping Card
     */
    public void mouseHoverToShoppingCard() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(shoppingCart);
    }

    /**
     * mouse Hover To GoTo Card And Click
     */
    public void mouseHoverToGoToCardAndClick() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(goToCart);
    }

    /**
     * get Number Of Quantity Value
     */
    public String getNumberOfQuantityValue() throws InterruptedException {
        Thread.sleep(1000);
        return getAttributeValueFromElement(quantityValue);
    }
}
