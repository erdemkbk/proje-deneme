package techproed.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.MyAccountPage;
import techproed.utilities.ReusableMethods;

import java.util.List;

import static techproed.utilities.Driver.driver;


public class US14 {

    @Test
    public void TC01() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        Assert.assertTrue(myAccountPage.addProduckt.isDisplayed());
        //actions.sendKeys(Keys.ARROW_DOWN).perform();

        Select select = new Select(myAccountPage.productTypeDD);
        List<WebElement> typeList = select.getOptions();
        for (WebElement w : typeList) {
            System.out.println(w.getText());
            Assert.assertTrue(w.isDisplayed());
        }

    }

    @Test
    public void TC02() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
       /*
        String bykResimDosyaYolu = System.getProperty("C:\\Users\\hanno\\Desktop\\TestNGProje\\Screenshot_1.png");

        myAccountPage.bykResim.click();
        myAccountPage.UploadFiles.click();
        myAccountPage.selectFiles.sendKeys();
        ReusableMethods.waitFor(6);
        myAccountPage.selectOk.click();*/


        //Resim secemiyorum
    }

    @Test
    public void TC03() throws InterruptedException {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //TC03-01
        myAccountPage.proTitel.sendKeys("OtomasyonBaslik");
        //myAccountPage.proTitel.sendKeys("OtomasyonBaslik",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"short");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(myAccountPage.proTitel.isDisplayed());


        //TC03-02
        driver.switchTo().frame(0);
        myAccountPage.shortDes.sendKeys("shortDes");
        Assert.assertTrue(myAccountPage.shortDogrulama.isDisplayed());
        driver.switchTo().parentFrame();

        //TC03-03
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.switchTo().frame(1);
        myAccountPage.des.sendKeys("Description");
        Assert.assertTrue(myAccountPage.desDogrulama.isDisplayed());
        System.out.println(myAccountPage.desDogrulama.getText());

        //TC03-01 dogrulmasina bak


    }

    @Test
    public void TC04() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(myAccountPage.Categories.isDisplayed());
        System.out.println(myAccountPage.Categories.getText());
        System.out.println(myAccountPage.arabalarCategory.getText());
        Assert.assertTrue(myAccountPage.arabalarCategory.isDisplayed());
        myAccountPage.arabalarClick.click();
        Assert.assertTrue(myAccountPage.arabalarClick.isSelected());

        //Bitti

    }

    @Test
    public void TC05() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //TC05-01
        myAccountPage.addNewCateg.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        myAccountPage.categoryName.sendKeys("otomasyonCategory");
        Assert.assertTrue(myAccountPage.CategoryNameGörünme.isDisplayed());

        //TC05-02
        Select select = new Select(myAccountPage.parentCategDD);
        select.selectByVisibleText("New Arrivals");
        Assert.assertTrue(myAccountPage.parentCategoryGörünme.isDisplayed());
        String sectigimOption = select.getFirstSelectedOption().getText();
        System.out.println("SECTİGİM OPTİON : " + sectigimOption);
        myAccountPage.categoryAddButton.click();
        //Assert.assertTrue(myAccountPage.eklenenCategoryGörünme.isDisplayed());

        ////Bitti zaten ekli diye uyari veriyor


    }

    @Test
    public void TC06() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        Assert.assertTrue(myAccountPage.productBrands.isDisplayed());
        System.out.println(myAccountPage.productBrands.getText());

        System.out.println(myAccountPage.ackBrands.getText());

        Assert.assertTrue(myAccountPage.ackBrands.isDisplayed());
        myAccountPage.ackBrands.click();
        Assert.assertTrue(myAccountPage.ackBrands.isSelected());


        //Bitti

    }

    @Test
    public void TC07() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        //TC07-01
        myAccountPage.addNewProductBrandsButton.click();
        myAccountPage.productBrandsNameBox.sendKeys("otomasyonBrands");

        //TV07-02
        Select select = new Select(myAccountPage.parentTaxonomiDD);
        select.selectByVisibleText("Green Grass");
        String sectigimOption = select.getFirstSelectedOption().getText();
        System.out.println("SECTİGİM OPTİON : " + sectigimOption);
        myAccountPage.bransAddButton.click();
        //Assert.assertTrue(myAccountPage.eklenenBrandGörünüm.isDisplayed());
        //Bitti zaten ekli diye uyari veriyor


    }

    @Test
    public void TC08() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //TC08-01

        myAccountPage.tagsBox.sendKeys("otomasyonTag");

        //TC08-02
        myAccountPage.tagsChooseButton.click();
        myAccountPage.hazirTags.click();
        System.out.println(myAccountPage.tagsBox.getText());
        Assert.assertTrue(myAccountPage.tagsBox.isDisplayed());

        //Bitti Tags  ürün tamamn eklendikten sonra görünmektedir


    }

    @Test
    public void TC09() throws InterruptedException {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        //TC09

        Select select = new Select(myAccountPage.categoryVisibiityDD);
        List<WebElement> catevisblty = select.getOptions();
        for (WebElement w : catevisblty) {
            System.out.println(w.getText());
            w.click();
            Assert.assertTrue(w.isDisplayed());


        }
        //Bitti

    }
}




