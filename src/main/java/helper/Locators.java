package helper;

public class Locators {
    //Locators for the main page
    public static String interestItButtonCssSelector = ".icn-innovation";
    public static String signInButtonMainPageCssSelector = ".u02toolsloggedout";
    public static String signInToMyAccountButtonXPath = "//a[@id=\"u02pfile-regs\" and contains(text(),'Sign in to my Account')]";
    public static String jobsAtOracleLinkXPath = "//a[@href=\"/corporate/careers/\"]//span";
    public static String progressIndicatorId = "progressIndicator";
    public static String eventsButtonXPath = "//a[@data-lbl=\"news-events:events\"]";
    //public static String acceptCookiesButtonXPath = "//a[@class=\"call\" and contains(text(),'Я принимаю все файлы cookie')]";
    public static String acceptCookiesButtonXPath = "/html/body/div[8]/div[1]/div/div[2]/div[2]/a[1]";

    //Locators for sandwich menu
    public static String sandwichMenuCssSelector = ".u02hamenu";
    public static String solutionsButtonXPath = "//*[@class='u02tlink' and contains(text(),'Solutions')]";
    public static String bigDataButtonXPath = "//div[@data-lbl=\"solutions\"]//a[@href=\"/big-data/\"]";
    public static String closeButtonOnLanguageWindowXPath = "//a[@data-lbl=\"close\"]";

    //Locators for Big Data menu item
    public static String bigDataHeadingXPath = "//div[@class='cw22-heading' and contains(text(),'Oracle Data Management Platforms')]";

    //Locators for IT interest page
    public static String learnMoreAutonomousDatabaseXPath = "//a[@data-lbl=\"cb27-learn-more\"]";
    public static String machineLearningButtonXPath = "//a[@data-lbl=\"machine-learning\"]";
    public static String machineLearningFormTextXPath ="//*[@id=\"machine-learning\"]//p";

    //Locators for Sign In page
    public static String userNameInputId = "userid";
    public static String userPasswordId = "pass";
    public static String signInButtonSignInPageId = "signin_button";
    public static String signInErrorMessageXPath = "//span[@id=\"errormsg\"]//div";

    //Locators for Careers page
    public static String searchForJobsButtonXPath = "//div[@class=\"obttn1\"]/a[@href=\"//oracle.taleo.net/careersection/2/jobsearch.ftl?lang=en\"]";
    public static String jobTitleSearchFieldId = "KEYWORD";
    public static String jobAreaSearchFieldId = "LOCATION";
    public static String searchForJobsApplyButtonId = "search";
    public static String applyForFirstJobXPath = "//ul[@id=\"jobList\"]/li[1]//a[contains(text(),'Apply')]";
    public static String applyForLastJobXPath = "//ul[@id=\"jobList\"]/li[25]//a[contains(text(),'Apply')]";

    //Locators for Careers login page
    public static String careersLoginUsernameId = "dialogTemplate-dialogForm-login-name1";
    public static String careersLoginPasswordId = "dialogTemplate-dialogForm-login-password";
    public static String careersLoginButtonId = "dialogTemplate-dialogForm-login-defaultCmd";
    public static String careersLoginErrorMessageId = "errorIAM";

}
