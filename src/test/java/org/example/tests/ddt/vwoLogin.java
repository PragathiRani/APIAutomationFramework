package org.example.tests.ddt;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.utils.UtilsExcel;
import org.testng.annotations.Test;

public class vwoLogin {
    RequestSpecification r2;
    ValidatableResponse vR2;
    Integer ID;
    Response res2;

    @Test(dataProvider = "getData",dataProviderClass = UtilsExcel.class)
    public void testVWOLogin(String email, String password) {
        System.out.println(" -- Login API Testing");
        System.out.println(email);
        System.out.println(password);

    }
}