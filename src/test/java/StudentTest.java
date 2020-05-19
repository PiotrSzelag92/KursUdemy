import org.testng.annotations.Test;

public class StudentTest {

@Test
public void testStudent() {
  Student naszPierwszyStudent = new Student();
  naszPierwszyStudent.nazwisko = "Reksio";
  naszPierwszyStudent.imie = "Tomasz";
  naszPierwszyStudent.grupa = "I";

  naszPierwszyStudent.przedstawSie();

  Student drugiStudent = new Student();
  drugiStudent.imie = "Karol";
  drugiStudent.nazwisko = "Kowalski";
  drugiStudent.grupa = "I";
  drugiStudent.przedstawSie();
}


}
