package interfejs;

import org.testng.annotations.Test;

public class interfejsTest {

    @Test
    public void interfejsTest(){
        PodstawoweAuto auto = new PodstawoweAuto();
        auto.jedź();
        auto.zmieńbieg();
        auto.toJestMetodaSpecyficzna();
    }
}
