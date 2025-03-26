package oe.pages;

import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;

public class HomePage {

    private Page page;

    // String Locators - Page Object Repository
    private String pageHeader = "//h1[contains(text(),'Currency Converter')]";
    private String inputAmount = "//input[@data-testid='amount']";
    private String inputFromCurrency = "//select[name='fromCurrency']";
    private String inputToCurrency = "//select[name='toCurrency']";
    private String covertButton = "//button";


    //Initialize page using constructor
    public HomePage(Page page) {
        this.page = page;
    }

    //Page Methods
    public boolean isPageHeaderVisible() {
        return page.locator(pageHeader).isVisible();
    }

    public void setInputAmount(String amount) {
        page.click(inputAmount);
        page.fill(inputAmount,amount);
    }

    public void setInputFromCurrency(String fromCurrency) {
        page.click(inputToCurrency);
        page.selectOption(inputFromCurrency,fromCurrency);
        //page.locator(inputFromCurrency).selectOption(fromCurrency);
    }

    public void setInputToCurrency(String toCurrency) {
        page.click(inputToCurrency);
        page.selectOption(inputToCurrency,toCurrency);
       // page.locator(inputToCurrency).selectOption(toCurrency);
    }

    public void clickCovertButton() {
        page.locator(covertButton).click();
    }
}
