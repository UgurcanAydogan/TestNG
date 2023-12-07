package tests.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P02_Before_After {

    @BeforeClass // tum testlerden once bir kere calisir.
    public void setUP(){
        System.out.println("Testler Calistirilmaya baslaniyor");
    }

    @Test
    public void wise(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }


    @AfterClass
    public void tearDown(){
        System.out.println("Calistirilabilecek tüm testler calistirildi");
    }
}
