package tests.day18_pom;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_ConfigReader {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Driver.closeDriver();


    }

}