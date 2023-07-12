package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MobilePage extends Utility
{
    By cellPhone = By.xpath("//h1[normalize-space()='Cell phones']");
    By ProductName = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By PriceName = By.xpath("//div[@class='product-price']//span[normalize-space()='$349.00']");
    By listView = By.xpath("//a[normalize-space()='List']");
    By clearQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By updateShoppingCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By successfullyText = By.xpath("//div[@id='bar-notification']");
    By closeNotificationBar = By.xpath("//span[@title='Close']");

    /**
     * get Mobile Text
     */
    public String getMobileText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(cellPhone);
    }

    /**
     * click On List ViewIcon
     */
    public void clickOnListViewIcon(){
        clickOnElement(listView);
    }

    /**
     * select Phone FromList
     */
    public void selectPhoneFromList(String phone) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'"+ phone +"')]"));
    }

    /**
     * get Product NameText
     */
    public String getProductNameText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(ProductName);
    }

    public void changeQuantity() {
        driver.findElement(clearQuantity).clear();
        sendTextToElement(addQuantity,"2");
    }
    public void clickOnUpdateCart() {
        clickOnElement(updateShoppingCart);
    }

    /**
     * get PriceText
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(PriceName);
    }


    /**
     * click On Add ToCart
     */
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCart);
    }

    /**
     * get Added To CartText Successfully
     */
    public String getAddedToCartTextSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(successfullyText);
    }

    /**
     * close Notification Bar
     */
    public void closeNotificationBar() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(closeNotificationBar);
    }

}
