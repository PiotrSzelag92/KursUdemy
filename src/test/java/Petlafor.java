import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Petlafor {

    //wypisz cyfry od 0 do 10

    @Test
    public void wypiszLiczby(){

        //i++ i=i+1
       for (int i=0; i <= 10; i++){
           System.out.println(i);
       }

       List<String> studenci = Arrays.asList("Tomek","Maciek", "Andrzej", "Kasia", "Marysia");

       for (String student : studenci){
           System.out.println(student);
       }
       for (int index = 0; index <studenci.size(); index = index +1){
           System.out.println("Student numer " + index + " to "  + studenci.get(index));
       }
    }
}
