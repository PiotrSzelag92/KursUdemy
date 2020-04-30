import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OurFirstTest {

    //Liczby stałoprzecinkowe

    byte aByte; // -128 do 127
    short aShort; // -32 768 do 32 767
    int anInt; // -2 147 483 648 do 2 147 483 647
    long aLong; // -2^63 do 2^63

    //Liczby zmiennoprzecinkowe

    float aFloat; // max ok 7 miejsc po przecinku
    double aDouble; // max ok 15 miejsc po przecinku

    //char

    char aChar;

    //boolean

    boolean aBoolean; // true/false

    //Znaki specjalne

    // t - tab
    // /n - nowa linia
    // \" - cudzysłów

    @Test
    public void sayHello() {
        System.out.println("Cześć! Witam Cię w kursie Selenium");
        WebDriver driver = new FirefoxDriver()
    }
}
