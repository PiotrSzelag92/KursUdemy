package interfejs;

public class AutoPremium implements Auto {
    @Override
    public void jedź() {
        System.out.println("Jedziesz autem ze złotymi felgami");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Twoja droga hamowania jest krótsza, dzięki lepszym tarczom");

    }

    @Override
    public void otwórzszybę() {
        System.out.println("Otwierasz szybę jednym palcem.");

    }

    @Override
    public void zmieńbieg() {
        System.out.println("Nie zmieniam biegów, bo mam automat.");
    }

    public void specyficznaMetodaPremium() {
        System.out.println("Jako posiadacz auta premium masz 30% zniżki na paliwo.");
    }

}

