import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOsztokOsszege {

   @Test
   public void testNulla() {
      int a=-0;
      int expected=-1;
      int actaul = MyLoop.meghatarozOsztokOsszege(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg az osztok osszeget!");
   }

   @Test
   public void testEgy() {
      int a=1;
      int expected=1;
      int actaul = MyLoop.meghatarozOsztokOsszege(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg az osztok osszeget!");
   }

   @Test
   public void testHat() {
      int a=6;
      int expected=12;
      int actaul = MyLoop.meghatarozOsztokOsszege(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg az osztok osszeget!");
   }

   @Test
   public void testH41() {
      int a=41;
      int expected=42;
      int actaul = MyLoop.meghatarozOsztokOsszege(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg az osztok osszeget!");
   }

   @Test
   public void test100() {
      int a=100;
      int expected=217;
      int actaul = MyLoop.meghatarozOsztokOsszege(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg az osztok osszeget!");
   }

}
