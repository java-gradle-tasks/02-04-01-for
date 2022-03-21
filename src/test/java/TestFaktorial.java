import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class TestFaktorial {

      @Test
      public void testNegativ() {
         int n=-1;
         int expected=-1;
         int actaul = MyLoop.faktorial(n);
         Assertions.assertEquals(expected,actaul,n+"! erteket rosszul hatarozta meg!");
      }

      @Test
      public void testNulla() {
         int n=0;
         int expected=1;
         int actaul = MyLoop.faktorial(n);
         Assertions.assertEquals(expected,actaul,n+"! erteket rosszul hatarozta meg!");
      }
      @Test
      public void testEgy() {
         int n=1;
         int expected=1;
         int actaul = MyLoop.faktorial(n);
         Assertions.assertEquals(expected,actaul,n+"! erteket rosszul hatarozta meg!");
      }
      @Test
      public void testOt() {
         int n=5;
         int expected=120;
         int actaul = MyLoop.faktorial(n);
         Assertions.assertEquals(expected,actaul,n+"! erteket rosszul hatarozta meg!");
      }
      @Test
      public void testTiz() {
         int n=10;
         int expected=3628800;
         int actaul = MyLoop.faktorial(n);
         Assertions.assertEquals(expected,actaul,n+"! erteket rosszul hatarozta meg!");
      }
   }
