package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;
import pages.RegPage;
import pages.RegPage2;

public class TestBase {
    String webSite = "http://students-aid.org:9222/";
    protected HomePage homePage;
    protected RegPage regPage;
    protected RegPage2 regPage2;

    protected WebDriver wd;
    Logger logger = LoggerFactory.getLogger(HomePage.class);

    @BeforeSuite
    public void init() {
        wd = new ChromeDriver();
//        wd.manage().window().maximize();
        homePage = PageFactory.initElements(wd, HomePage.class);
        regPage = PageFactory.initElements(wd, RegPage.class);
        regPage2 = PageFactory.initElements(wd,RegPage2.class);

//        logger.info("Start method -->   ");
    }

    @AfterSuite
    public void tearDown() {
//        logger.info("wd.quit!");
//        wd.quit();
    }


}
