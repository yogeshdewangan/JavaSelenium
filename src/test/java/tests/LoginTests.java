package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Log;
import pages.HomePage;
import utils.TestData;

import java.util.Properties;

public class LoginTests extends BaseTest {

    @Test(description = "Login Test")
    public void loginTest(){
        Log.startTest("Login Test");
        Properties prop = ConfigReader.getProp();
        driver.get(prop.getProperty("baseUrl"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
        HomePage homePage = loginPage.clickLogin();

        String title = homePage.getTitle();
        Assert.assertEquals(title, "Logged In Successfully | Practice Test Automation");
        Log.endTest("Login Test");
    }

    @Test(description = "Login Test", dataProvider= "LoginData", dataProviderClass = TestData.class)
    public void loginTestDataProvider(String username, String password){
        Log.startTest("Login Test");
        Properties prop = ConfigReader.getProp();
        driver.get(prop.getProperty("baseUrl"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        HomePage homePage = loginPage.clickLogin();

        String title = homePage.getTitle();
        Assert.assertEquals(title, "Logged In Successfully | Practice Test Automation");
        Log.endTest("Login Test");
    }
}
