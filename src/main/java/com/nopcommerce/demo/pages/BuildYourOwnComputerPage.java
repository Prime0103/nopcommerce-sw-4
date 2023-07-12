package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility
{
    By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By totalPrice = By.xpath("//div[@class='product-price']//span");
    By microsoftOfficeSoftwareOption = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommanderSoftwareOption = By.xpath("//input[@id='product_attribute_5_12']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By successfullyText = By.xpath("//div[@id='bar-notification']");
    By closeNotificationBar = By.xpath("//span[@title='Close']");
    By shopingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");

    /**
     * get Build Your Own Computer Text
     */
    public String getBuildYourOwnComputerText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(buildYourOwnComputerText);
    }

    /**
     * select Processor
     */
    public void selectProcessor(String name) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }

    /**
     * select Ram
     */
    public void selectRam(String name) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectRam, name);
    }

    /**
     * select HDD
     */
    public void selectHDD(String value) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    /**
     * select Os
     */
    public void selectOs(String value) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }

    /**
     * select Microsoft Office SoftwareOption
     */
    public void selectMicrosoftOfficeSoftwareOption() throws InterruptedException {
        Thread.sleep(1000);
        selectCheckBox();
    }

    private void selectCheckBox() {
    }


    /**
     * select Total Commander Software Option
     */
    public void selectTotalCommanderSoftwareOption() throws InterruptedException {
        Thread.sleep(1000);
        selectCheckBox();
    }

    /**
     * get Total Price Text
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(totalPrice);
    }

    /**
     * click On Add to Cart
     */
    public void clickOnAddtoCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addToCart);
    }

    /**
     * get Successfully Added To CartText
     */
    public String getSuccessfullyAddedToCartText() throws InterruptedException {
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

    /**
     * mouse Hover To ShoppingCart And ClickOnCart
     */
    public void mouseHoverToShoppingCartAndClickOnCart() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(shopingCart);
        mouseHoverToElementAndClick(goToCart);
    }
}
