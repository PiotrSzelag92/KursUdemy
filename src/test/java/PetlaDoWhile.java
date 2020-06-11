import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaDoWhile {

    @Test
    public void testPetliDoWhile(){

        int index = 0;
/*
        do {
            System.out.println(index);
            index++;
        } while (index<5);

 */

        List<String> rzeczy = Arrays.asList("lampa", "stolik", "telewizor");
        do {
            System.out.println(rzeczy.get(index));
            index++;
        }while (index<rzeczy.size());
    }
}
