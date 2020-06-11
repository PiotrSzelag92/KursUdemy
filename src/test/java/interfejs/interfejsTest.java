package interfejs;

import org.testng.annotations.Test;

public class interfejsTest {

    @Test
    public void interfejsTest() {
        /*PodstawoweAuto auto = new PodstawoweAuto();
auto.jedź();
auto.zmieńbieg();
auto.toJestMetodaSpecyficzna();

AutoPremium autoPremium = new AutoPremium();
autoPremium.jedź();
autoPremium.zmieńbieg();
autoPremium.otwórzszybę();
autoPremium.specyficznaMetodaPremium();

         */
        Auto autoPremium = new AutoPremium();
        zaprezentujAuto(autoPremium);

        Auto auto = new PodstawoweAuto();
        zaprezentujAuto(auto);

    }

    public void zaprezentujAuto(Auto auto) {
        auto.jedź();
        auto.otwórzszybę();
        auto.zmieńbieg();

    }

    public void zaprezentujAuto(PodstawoweAuto auto) {
        auto.zmieńbieg();
        auto.jedź();
        auto.otwórzszybę();
    }

}

