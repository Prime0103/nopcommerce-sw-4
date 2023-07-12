package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuiteTest extends BaseTest
{
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();




    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        homePage.clickOnComputerTab();
        computersPage.clickOnDesktop();
        String actualOrder = computersPage.sortDesktopByPositionZtoA().toString();
        String ExceptedOrder = computersPage.getAllProductNamesAfterShorting().toString();
        Assert.assertTrue(ExceptedOrder.contains(actualOrder));

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        String expectedMessage = "Build your own computer";
        homePage.clickOnComputerTab();
        computersPage.clickOnDesktop();
        computersPage.selectValueFromShortingDropDown("Name: A to Z");
        computersPage.clickAddToCartByProductName("Build your own computer");
        String actualMessage = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on add to card");

        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");
        buildYourOwnComputerPage.selectHDD("400 GB [+$100.00]");
        buildYourOwnComputerPage.selectOs("Vista Premium");
        buildYourOwnComputerPage.selectMicrosoftOfficeSoftwareOption();
        buildYourOwnComputerPage.selectTotalCommanderSoftwareOption();
        String expectedMessage1 = "$1,470.00";
        String actualMessage1 = buildYourOwnComputerPage.getTotalPriceText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Wrong Configuration");

        buildYourOwnComputerPage.clickOnAddtoCart();
        String expectedMess = "The product has been added to your shopping cart";
        String actualMess = buildYourOwnComputerPage.getSuccessfullyAddedToCartText();
        Assert.assertEquals(expectedMess, actualMess, "Not added in cart");

        buildYourOwnComputerPage.closeNotificationBar();
        buildYourOwnComputerPage.mouseHoverToShoppingCartAndClickOnCart();
        String expectedMesg = "Shopping cart";
        String actualMesg = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(expectedMesg, actualMesg, "Unable to click on cart");

        computersPage.changeQuantity();
        computersPage.clickOnUpdateCart();
        String expectedMessage2 = "$2,940.00";
        String actualMessage2 = shoppingCartPage.getPriceText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Price not Updated");

        shoppingCartPage.selectTermsAndCondition();
        shoppingCartPage.clickOnCheckOut();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText, "Unable to checkout");

        loginPage.clickOnGuestCheckout();
        checkOutPage.enterFirstname("Khushi");
        checkOutPage.enterLastname("patel");
        checkOutPage.enterEmail("abc123@gmail.com");
        checkOutPage.selectCountry("United Kingdom");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddress1("london");
        checkOutPage.enterZipCode("nw2 4er");
        checkOutPage.enterPhoneNumber("07980654734");
        checkOutPage.clickOnContinue();
        checkOutPage.selectNextDayAir();
        checkOutPage.clickOnShippingContinue();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinue();
        checkOutPage.selectCreditCardType("Master card");
        checkOutPage.enterCardHolderName("Prime testing");
        checkOutPage.enterCardNumber("5500665050331588");
        checkOutPage.selectExpirationDate("02", "2024");
        checkOutPage.enterCardCode("780");
        checkOutPage.clickOnPaymentInfoContinue();
        String expectedMessag = "Credit Card";
        String actualMessag = checkOutPage.getPaymentTypeText();
        Assert.assertEquals(expectedMessag, actualMessag, "Unable to checkout");

        String expectedMessage3 = "Next Day Air";
        String actualMessage3 = checkOutPage.getShippingMethodText();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Unable to checkout");

        String expectedMessage4 = "$2,940.00";
        String actualMessage4 = checkOutPage.getTotalPriceText();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Unable to checkout");

        checkOutPage.clickOnConfirm();
        String expectedtxt = "Thank you";
        String actualtxt = homePage.getThankYouText();
        Assert.assertEquals(expectedtxt, actualtxt, "Unable to checkout");

        String expectedMessage5 = "Your order has been successfully processed!";
        String actualMessage5 = homePage.getSuccessfulText();
        Assert.assertEquals(expectedMessage5, actualMessage5, "Unable to checkout");

        homePage.clickOnContinue();

        String expectedMessage6 = "Welcome to our store";
        String actualMessage6 = homePage.getWelcomeStoreText();
        Assert.assertEquals(expectedMessage6, actualMessage6, "Unable to checkout");

    }
}
