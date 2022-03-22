import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacci {

   @Test
   public void testNegativ() {
      int n = -1;
      int expected = 0;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatorzta meg!");
   }

   @Test
   public void testNulla() {
      int n = 0;
      int expected = 0;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatarozta meg!");
   }
   @Test
   public void testEgy() {
      int n = 1;
      int expected = 1;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatarozta meg!");
   }

   @Test
   public void testKetto() {
      int n = 2;
      int expected = 1;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatarozta meg!");
   }
   @Test
   public void testHarom() {
      int n = 3;
      int expected = 2;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatarozta meg!");
   }
   @Test
   public void testOt() {
      int n = 5;
      int expected = 5;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatarozta meg!");
   }
   @Test
   public void testNyolc() {
      int n = 8;
      int expected = 21;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatarozta meg!");
   }
   @Test
   public void testTizenketto() {
      int n = 12;
      int expected = 144;
      int actaul = MyLoop.fibonacci(n);
      Assertions.assertEquals(expected, actaul, "fib("+n+") erteket rosszul hatarozta meg!");
   }
}
