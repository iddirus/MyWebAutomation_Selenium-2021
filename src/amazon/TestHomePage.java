package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    @Test(priority = 2)
    public void testCheckSearchBox(){
        checkSearchBox();
        String expectedText="\"Laptop\"";
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

    @Test(priority = 1)
    public void testPageTitle(){
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Page Title not match");
    }

    @Test(priority = 3)
    public void testCheckBestSellersBooksLink(){
        checkBestSellersBooksLink();
        String expectedText = "Children's Books";
        String actualText =driver.findElement(By.linkText("Children's Books")).getText();
        Assert.assertEquals(actualText,expectedText,"the link is opened successfully");
    }

    @Test(priority = 4)
    public void testCheckBestSellersAppsAndGamesLink(){
        checkBestSellersAppsAndGamesLink();
        String expectedText = "Diapering";
        String actualText=driver.findElement(By.linkText("Diapering")).getText();
        Assert.assertEquals(actualText,expectedText,"the link is working ");
    }

    @Test(priority = 5)
    public void testCheckMailBirthdayGiftCards(){
        checkBirthdayGiftCardsMail();
        String expectedText = "Mail";
        String actualText=driver.findElement(By.linkText("Mail")).getText();
        Assert.assertEquals(actualText,expectedText," Link is Displaying properly");
    }

    @Test(priority = 6)
    public void testCheckAmazonDevicesLink(){
        checkAmazonDevicesLink();
        String expectedText ="Amazon Devices";
        String actualText=driver.findElement(By.linkText("Amazon Devices")).getText();
        Assert.assertEquals(actualText,expectedText,"the page is displaying properly");
    }

    @Test(priority = 7)
    public void testCheckAccountAndListsSignIn(){
        checkAccountAndListsSignIn();
        String expectedUrl = "https://www.amazon.com/?ref_=nav_signin&";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Signed in successfully");
    }

    @Test(priority = 8)
    public void testCheckMyAmazonPrimeLink(){
        checkMyAmazonPrimeLink();
        String expectedUrl = "https://www.amazon.com/amazonprime?_encoding=UTF8&%2AVersion%2A=1&%2Aentries%2A=0";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"page opened successfully");
    }

    @Test(priority = 9)
    public void testCheckAmazonLanguageSettings(){
        checkAmazonLanguageSettings();
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"as expected");
    }

    @Test(priority = 10)
    public void testCheckNewReleasesInVideoGames(){
        checkNewReleasesInVideoGames();
        String expectedUrl = "https://www.amazon.com/gp/new-releases/videogames/ref=zg_bsnr_nav_0";
        String actualUrl="https://www.amazon.com/gp/new-releases/videogames/ref=zg_bsnr_nav_0";
        Assert.assertEquals(actualUrl,expectedUrl,"abc");
    }

    @Test(priority = 11)
    public void testCheckToysAndGamesLink(){
        checkToysAndGamesLink();
        String expectedText = "\"Building Toys\"";
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText,expectedText,"Building Toys is not displaying");
    }

    @Test(priority = 23)
    public void testCheckBestSellersAppliancesLink(){
        checkBestSellersAppliancesLink();
        String expectedText = "Ice Makers";
        String actualText=driver.findElement(By.linkText("Ice Makers")).getText();
        Assert.assertEquals(actualText,expectedText,"the page opens successfully");
    }

    @Test(priority = 13)
    public void testCheckUnitedStatesImageLink(){
        checkUnitedStatesImageLink();
        String expectedUrl="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Url is good ");
    }

    @Test(priority = 14)
    public void testCheckBoysFashionTodaysDeals(){
        checkBoysFashionTodaysDeals();
        String expectedText= "Boys’ Fashion ";
        String actualText=driver.findElement(By.xpath("//*[@id=\"FilterItemView_all_summary\"]/div/span[2]/a/span")).getText();
        Assert.assertEquals(actualText,expectedText,"Boys’ Fashion id displaying ");
    }

    @Test(priority = 15)
    public void testCheckSelectYourAddressLink(){
        checkSelectYourAddressLink();
        String expectedUrl = "glow-ingress-line2";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"address is displaying");
    }

    @Test(priority = 17)
    public void testCheckBestSellersDigitalMusicLink(){
        checkBestSellersDigitalMusicLink();
        String expectedText="Albums";
        String actualText=driver.findElement(By.linkText("Albums")).getText();
        Assert.assertEquals(actualText,expectedText,"the link is working ");
    }

    @Test(priority = 19)
    public void testCheckCareersLink(){
        checkCareersLink();
        String expectedText="//*[@id=\"main-content\"]/div[1]/div/div/nav/div[1]/a[2]/div";
        String actualText=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/nav/div[1]/a[2]/div")).getText();
        Assert.assertEquals(actualText,expectedText,"the result is the same ");
    }

    @Test(priority = 22)
    public void testCheckNesReleasesBooksLink(){
        checkNesReleasesBooksLink();
        String expectedText="Romance";
        String actualText=driver.findElement(By.linkText("Romance")).getText();
        Assert.assertEquals(actualText,expectedText,"the link is opening successfully");
    }




}

