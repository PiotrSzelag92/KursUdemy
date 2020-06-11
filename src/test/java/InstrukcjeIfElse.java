import org.testng.annotations.Test;

public class InstrukcjeIfElse {
    // Instrukcja warunkowa

    @Test
    public void testInstrukcji(){
        sprawdzWiek(17);
        sprawdzWiek(20);
        sprawdzWiek(18);

        idzDoPracy(16);
        idzDoPracy(22);
        idzDoPracy(67);

    }
    public void sprawdzWiek(int wiek){
        if (wiek < 18){
            System.out.println("Młodzieży alkoholu nie sprzedajemy.");
        } else {
            System.out.println("Masz wystarczająco dużo lat, aby kupić alkohol");
        }

    }
    public void idzDoPracy(int wiek){
        if (wiek <= 18) {
            System.out.println("Jestem za młody na pracę.");
        } else if (wiek <= 65){
            System.out.println("Zapraszamy do pracy.");
        } else if (wiek > 65){
            System.out.println("Jesteś już na emeryturze.");
        }
    }
}
