import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLnko {

   @Test
   public void testNegativ() {
      int a=-1;
      int b= 1;
      int expected=-1;
      int actaul = MyLoop.lnko(a,b);
      Assertions.assertEquals(expected,actaul,a+" "+b+"  szamok eseten rosszul hatarozta meg az lnko-t");
   }

   @Test
   public void testNulla() {
      int a= 1;
      int b= 0;
      int expected=-1;
      int actaul = MyLoop.lnko(a,b);
      Assertions.assertEquals(expected,actaul,a+" "+b+"  szamok eseten rosszul hatarozta meg az lnko-t");
   }

   @Test
   public void testEgyEgy() {
      int a= 1;
      int b= 1;
      int expected=1;
      int actaul = MyLoop.lnko(a,b);
      Assertions.assertEquals(expected,actaul,a+" "+b+"  szamok eseten rosszul hatarozta meg az lnko-t");
   }

   @Test
   public void testHaromOt() {
      int a= 3;
      int b= 5;
      int expected=1;
      int actaul = MyLoop.lnko(a,b);
      Assertions.assertEquals(expected,actaul,a+" "+b+"  szamok eseten rosszul hatarozta meg az lnko-t");
   }

   @Test
   public void test16_24() {
      int a= 16;
      int b= 24;
      int expected=8;
      int actaul = MyLoop.lnko(a,b);
      Assertions.assertEquals(expected,actaul,a+" "+b+"  szamok eseten rosszul hatarozta meg az lnko-t");
   }

   @Test
   public void test144_120() {
      int a= 144;
      int b= 120;
      int expected=24;
      int actaul = MyLoop.lnko(a,b);
      Assertions.assertEquals(expected,actaul,a+" "+b+"  szamok eseten rosszul hatarozta meg az lnko-t");
   }


}
