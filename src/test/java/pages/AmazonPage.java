package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

        public class AmazonPage { //parametresiz conts. cagirilan constructurda Driver clasindaki driver bu driver dir.gecerli hale getirmek icin
            public AmazonPage(){
                PageFactory.initElements(Driver.getDriver(),this);
            }

            @FindBy(id="twotabsearchtextbox")
            public WebElement  aramaKutusu;

            @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
            public WebElement aramaSonucElementi;
        }