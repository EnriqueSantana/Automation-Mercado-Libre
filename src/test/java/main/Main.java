package main;

import tests.Locators;
import tests.Methods;

public class Main {
    public static void main (String[]args) throws InterruptedException {
        Methods myMethods= new Methods();
        myMethods.getURL("https://www.google.com/");
        myMethods.type(Locators.GoogleSearchField,"Mercado libre");
        myMethods.click(Locators.selectOption);
        myMethods.click(Locators.selectLink);
        myMethods.click(Locators.offerTap);
        myMethods.click(Locators.noInterestMonthlyOption);
        myMethods.click(Locators.selectItem);
        myMethods.clickbyId(Locators.acceptCockiesButton);
        myMethods.click(Locators.buyOption);
        Thread.sleep(5000);
        myMethods.closeBrowser();
    }
}
