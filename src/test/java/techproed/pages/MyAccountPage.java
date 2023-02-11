package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;




public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement singInButton;

    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement myAcc;

    @FindBy(partialLinkText = "Store Manager")
    public WebElement storeManager;

    @FindBy(xpath = "(//span[@class='wcfmfa fa-cube'])[1]")
    public WebElement products;
    @FindBy(partialLinkText = "Add New")
    public WebElement addNewButton;
    @FindBy(xpath = "(//div//h2)[2]")
    public WebElement addProduckt;

    @FindBy(xpath = "//select[@id='product_type']")
    public WebElement productTypeDD;
//TC02
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement bykResim;

    @FindBy(xpath = "(//button[@id='menu-item-upload'])[3]")
    public WebElement UploadFiles;

    @FindBy(xpath = "(//button[@id='__wp-uploader-id-7']")
    public WebElement selectFiles;
    @FindBy(xpath = "(//button[@class='button media-button button-primary button-large media-button-select'])[5]")
    public WebElement selectOk;

    //TC03
    //TC03-01
    @FindBy(xpath = "//input[@id='pro_title']")
    public WebElement proTitel;



    //TC03-02
    @FindBy(xpath = "//iframe[@id='excerpt_ifr']")
    public WebElement shortIframe;

    @FindBy(xpath = "//body[@data-id='excerpt']")
    public WebElement shortDes;
    @FindBy(xpath ="//body[@class='mce-content-body excerpt post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']//p")
     public  WebElement shortDogrulama;


    //TC03-03
    @FindBy(xpath = "//iframe[@id='description_ifr']")
    public WebElement desIframe;

    @FindBy(xpath = "//body[@class='mce-content-body description post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']")
    public WebElement des;
    @FindBy(xpath = "//body[@class='mce-content-body description post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']//p")
    public WebElement desDogrulama;

    //TC04
    @FindBy(xpath = "//p[@class='wcfm_title wcfm_full_ele']")
    public WebElement Categories;

    @FindBy(xpath = "//span[text()='Arabalar']")
    public WebElement arabalarCategory;

    @FindBy(xpath = "//input[@value='413']")
    public WebElement arabalarClick;

    //TC05-01
    @FindBy(xpath = "//p[text()='+Add new category']")
    public WebElement addNewCateg;

    @FindBy(xpath = "//input[@id='wcfm_new_cat']")
    public WebElement categoryName;



    //TC05-02
    @FindBy(id = "wcfm_new_parent_cat")
    public WebElement parentCategDD;

    @FindBy(id = "wcfm_new_cat")
    public WebElement CategoryNameGörünme;

    @FindBy(id = "wcfm_new_parent_cat")
    public WebElement parentCategoryGörünme;

    @FindBy(xpath = "(//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
    public WebElement categoryAddButton;

    @FindBy(xpath = "//span[text()='otomasyonCategory']")
    public WebElement eklenenCategoryGörünme;

    //TC06

    @FindBy(xpath = "//strong[text()='Product brands']")
    public WebElement productBrands;

    @FindBy(xpath = "//input[@value='335']")
    public WebElement ackBrands;

    //TC047-01
    @FindBy(xpath = "//p[text()='+Add new Product brands']")
    public WebElement addNewProductBrandsButton;

    @FindBy(xpath = "//input[@id='wcfm_new_product_brand']")
     public WebElement productBrandsNameBox;

    //TC07-02

    @FindBy(xpath = "//select[@id='wcfm_new_parent_product_brand']")
     public WebElement parentTaxonomiDD;

    @FindBy(xpath = "(//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[2]")
    public WebElement bransAddButton;
    @FindBy(xpath = "//li[@data-item='498']")
    public WebElement eklenenBrandGörünüm;

    //TC08-01

    @FindBy(xpath = "//textarea[@id='product_tags']")
    public WebElement tagsBox;

    //TC08-02
    @FindBy(xpath = "//p[text()='Choose from the most used tags']")
    public WebElement tagsChooseButton;

  @FindBy(xpath = "//a[@aria-label='A+ enerji (2 items)']")
    public WebElement hazirTags;


  //TC09
    @FindBy(xpath = "//select[@id='catalog_visibility']")
    public WebElement categoryVisibiityDD;



    //*******---------US15---------*****

    //TC01
    @FindBy(xpath = "//div[@class='page_collapsible_content_holder']")
    public WebElement menü1;







}












