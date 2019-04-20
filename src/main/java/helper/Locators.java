package helper;

public class Locators {
    //Locators for the main page
    public static String interestItButtonCssSelector = ".icn-innovation";

    //Locators for sandwich menu
    public static String sandwichMenuCssSelector = ".u02hamenu";
    public static String solutionsButtonXPath = "//*[@class='u02tlink' and contains(text(),'Solutions')]";
    public static String bigDataButtonXPath = "//div[@data-lbl=\"solutions\"]//a[@href=\"/big-data/\"]";
    public static String closeButtonOnLanguageWindow = "//a[@data-lbl=\"close\"]";

    //Locators for Big Data menu item
    public static String bigDataHeadingXPath = "//div[@class='cw22-heading' and contains(text(),'Oracle Data Management Platforms')]";
}