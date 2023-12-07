package tests.Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01 {

    @Test(priority = -10) @Ignore
    public void Ugurcan(){
        System.out.println("Ugurcan Methodu Calisti");
    }
    @Test
    public void Aybar() {
        System.out.println("Aybar Methodu Calisti");
    }
    @Test(priority = -1)
    public void Enes() {
        System.out.println("Enes Methodu Calisti");
    }
    @Test(dependsOnMethods = "Aybar")
    public void Sibel() {
        System.out.println("Sibel Methodu Calisti");
    }
}
