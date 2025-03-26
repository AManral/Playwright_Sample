package oe.base;

import com.microsoft.playwright.Page;
import oe.pages.HomePage;
import org.example.PlaywrightFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseTest {

    PlaywrightFactory pf;
    Page page;
    protected HomePage homePage;


    @BeforeTest
    public void setup() throws IOException {
        pf  = new PlaywrightFactory();
        page = pf.initBrowser("chrome");
        homePage = new HomePage(page);
    }

    @AfterTest
    public void tearDown(){
        page.context().browser().close();
    }

}

