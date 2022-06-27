package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

//    Please browse:
//        http://students-aid.org:9222/
//        This is a qa environment, you can use it freely.
//
//        Write a short test script that will :
//        Click on "join us".
//        Fill in the forms, inc. some selections in the Check boxes .
//        fill in an email/pw
//        And submit
//
//
//        Scope: happy scenario
//        Time frame: 60-75 min     12:15 - Start

public class TestClass extends TestBase {

    User testUser = new User("Tomas", "Edison", "998877665",
            "0533229922", "male", "30121999");

    @Test
    public void phoneNumbNegativeTest() throws InterruptedException {
        wd.get(webSite);
        homePage.openJoinUsForm();
        Thread.sleep(1500);

        Integer pageNumb = regPage.getPageNumb();
        regPage.fillFirstname(testUser.getName())
                .fillLastname(testUser.getLastname())
                .fillPersonalId(testUser.getId())
                .fillPhone(testUser.getPhone())
                .fillGender(testUser.getGender())
                .fillDateOfBirth(testUser.getDateOfBirth())
                .clickAgreeTermsCheckbox()
                .clickButtonActive();

        Integer pageTwoNumb = regPage2.getPageNumb();

        System.out.println("pageOneNumb: " + pageNumb);
        System.out.println("pageTwoNumb: " + pageTwoNumb);

        Thread.sleep(1500);

        Assert.assertEquals(pageNumb,pageNumb++);
    }


}

