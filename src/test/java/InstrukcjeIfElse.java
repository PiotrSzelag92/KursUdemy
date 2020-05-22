import org.testng.annotations.Test;

public class InstrukcjeIfElse {
    // Instrukcja warunkowa

    @Test
    public void testInstrukcji(){
        sprawdzWiek(17);
        sprawdzWiek(20);
        sprawdzWiek(18);

    }
    public void sprawdzWiek(int wiek){
        if (wiek < 18){
            System.out.println("Młodzieży alkoholu nie sprzedajemy.");
        } else {
            System.out.println("Masz wystarczająco dużo lat, aby kupić alkohol");
        }

    }
}
