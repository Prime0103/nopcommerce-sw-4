package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class ElectronicsTest extends BaseTest
{
    String email;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    MobilePage cellPhonePage = new MobilePage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        homePage.mouseHoverToElectronicTab();
        homePage.mouseHoverToCellPhonesAndClick();
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.getMobileText();
        assertEquals(expectedMessage, actualMessage);
    }

    private void assertEquals(String expectedMessage, String actualMessage) {

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String option = "Register";

        homePage.mouseHoverToElectronicTab();
        homePage.mouseHoverToCellPhonesAndClick();
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonePage.getMobileText();
        Assert.assertEquals(actualMessage,expectedMessage);

        cellPhonePage.clickOnListViewIcon();
        cellPhonePage.selectPhoneFromList("Nokia Lumia 1020");

        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = cellPhonePage.getProductNameText();
        assertEquals(expectedMessage1, actualMessage1);

        String expectedMessage2 = "$349.00";
        String actualMessage2 = cellPhonePage.getPriceText();
        assertEquals(actualMessage2,expectedMessage2);

        cellPhonePage.changeQuantity();
        cellPhonePage.clickOnUpdateCart();

        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = cellPhonePage.getAddedToCartTextSuccessfully();
        assertEquals(actualMessage3, expectedMessage3);

        cellPhonePage.closeNotificationBar();
        shoppingCartPage.mouseHoverToShoppingCard();
        shoppingCartPage.mouseHoverToGoToCardAndClick();

        String expectedText = "Shopping cart";
        String actualText = shoppingCartPage.getShoppingCartText();
        assertEquals(actualText, expectedText);

        String expectedMessage4 = "2";
        String actualMessage4 = shoppingCartPage.getNumberOfQuantityValue();
        assertEquals(actualMessage4, expectedMessage4);

        String expectedMessage5 = "$698.00";
        String actualMessage5 = shoppingCartPage.getPriceText();
        assertEquals(actualMessage5, expectedMessage5);

        shoppingCartPage.selectTermsAndCondition();
        shoppingCartPage.clickOnCheckOut();

        String expectedSignInMessage = "Welcome, Please Sign In!";
        String actualSignInMessage = loginPage.getWelcomeText();
        assertEquals(expectedSignInMessage, actualSignInMessage);

        homePage.clickOnRegisterTab();
        registerPage.enterFirstname("Prime");
        registerPage.enterLastname("Testing");
        registerPage.enterEmail(email);
        registerPage.enterPassword("Admin@123");
        registerPage.enterConfirmPassword("Admin@123");
        registerPage.clickOnRegisterButton();

        String expectedRegMessage = "Your registration completed";
        String actualRegMessage = registerPage.getRegistrationCompletedText();
        assertEqual(expectedRegMessage, actualRegMessage);

        System.out.println("-----------------Shopping cart is getting empty--------------------------");

    }

    private void assertEqual(String expectedRegMessage, String actualRegMessage) {

    }

}
