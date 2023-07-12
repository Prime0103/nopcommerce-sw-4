package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest
{
    ElectronicsPage electronicsPage =new ElectronicsPage();

    @Test
    public void verifyPageNavigation() {
        String menuName = "Electronics";
        String expectedMessage = "Electronics";
        // This method select Electronics tab on top menu
        electronicsPage.selectMenu(menuName);
        String actualMessage= electronicsPage.getElectronicsTabText();
        Assert.assertEquals(expectedMessage,actualMessage,"Unable to click on");
    }
}
