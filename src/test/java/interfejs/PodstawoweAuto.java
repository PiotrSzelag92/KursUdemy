package interfejs;

public class PodstawoweAuto implements Auto {

    private String model = "Tipo";
    private String marka = "Fiat";

    public void toJestMetodaSpecyficzna(){
        System.out.println("To jest metoda dla posiadaczy auta w wersji podstawowej. - " + model);
    }

    @Override
    public void jedź() {
        System.out.println("Jedziesz podstawowym modelem auta.");

    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz auto używając hamulców bębnowych.");

    }

    @Override
    public void otwórzszybę() {
        System.out.println("Kręcisz korbą, aby otoworzyć szybę.");

    }

    @Override
    public void zmieńbieg() {
        System.out.println("Zmieniasz bieg manualną skrzynią biegów.");

    }
}
