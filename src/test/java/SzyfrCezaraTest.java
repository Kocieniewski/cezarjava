import org.example.SzyfrCezara;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SzyfrCezaraTest {

   private final SzyfrCezara szyfr = new SzyfrCezara();

   @Test
   void prostyTest() {
      assertEquals("def", szyfr.zaszyfruj("abc", 3));
   }

   @Test
   void zawijanieAlfabetu() {
      assertEquals("abc", szyfr.zaszyfruj("xyz", 3));
   }

   @Test
   void ujemnyKlucz() {
      assertEquals("abc", szyfr.zaszyfruj("def", -3));
   }

   @Test
   void duzyKlucz() {
      assertEquals("def", szyfr.zaszyfruj("abc", 29));
   }

   @Test
   void tekstZeSpacjami() {
      assertEquals("cd ef", szyfr.zaszyfruj("ab cd", 2));
   }

}

