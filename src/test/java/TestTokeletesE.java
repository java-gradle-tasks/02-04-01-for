import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTokeletesE {

   @Test
   public void testNulla() {
      int a=0;
      boolean expected=false;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test1() {
      int a=1;
      boolean expected=false;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test2() {
      int a=2;
      boolean expected=false;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test6() {
      int a=6;
      boolean expected=true;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test10() {
      int a=10;
      boolean expected=false;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test28() {
      int a=28;
      boolean expected=true;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test496() {
      int a=496;
      boolean expected=true;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test500() {
      int a=500;
      boolean expected=false;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }

   @Test
   public void test8128() {
      int a=8128;
      boolean expected=true;
      boolean actaul = MyLoop.tokeletesE(a);
      Assertions.assertEquals(expected,actaul,a+" eseten rosszul hatarozta meg , hogy a szam tokeletes-e!");
   }


}
