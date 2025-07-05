package utils;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "LoginData")
    public Object[][] getLoginData(){
        return new Object[][]{
                {"student", "Password123"},
                {"sdf","sdfsd"},
                {"sdfsd","sdfsdf"}
        };
    }
}
