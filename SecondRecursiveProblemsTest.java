import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// More test cases for each test

public class SecondRecursiveProblemsTest {

   public void testCount8() {
      assertEquals(1, RecursiveProblems.count8(8));
      assertEquals(2, RecursiveProblems.count8(818));
      assertEquals(4, RecursiveProblems.count8(8818));
      assertEquals(0, RecursiveProblems.count8(123));
      assertEquals(5, RecursiveProblems.count8(88818));
   }

 
   public void testCountHi() {
      assertEquals(1, RecursiveProblems.countHi("xxhixx"));
      assertEquals(2, RecursiveProblems.countHi("xhixhix"));
      assertEquals(1, RecursiveProblems.countHi("hi"));
      assertEquals(0, RecursiveProblems.countHi("hello"));
      assertEquals(3, RecursiveProblems.countHi("hihihix"));
   }

 
   public void testCountHi2() {
      assertEquals(1, RecursiveProblems.countHi2("ahixhi"));
      assertEquals(2, RecursiveProblems.countHi2("ahibhi"));
      assertEquals(0, RecursiveProblems.countHi2("xhixhi"));
      assertEquals(0, RecursiveProblems.countHi2("xhixxhi"));
      assertEquals(3, RecursiveProblems.countHi2("hihihi"));
   }

 
   public void testStrCount() {
      assertEquals(2, RecursiveProblems.strCount("catcowcat", "cat"));
      assertEquals(1, RecursiveProblems.strCount("catcowcat", "cow"));
      assertEquals(0, RecursiveProblems.strCount("catcowcat", "dog"));
      assertEquals(2, RecursiveProblems.strCount("hellohello", "hello"));
      assertEquals(3, RecursiveProblems.strCount("abcabcabc", "abc"));
   }

  
   public void testStringClean() {
      assertEquals("yza", RecursiveProblems.stringClean("yyzzza"));
      assertEquals("abcd", RecursiveProblems.stringClean("abbbcdd"));
      assertEquals("Helo", RecursiveProblems.stringClean("Hello"));
      assertEquals("abc", RecursiveProblems.stringClean("aabbcc"));
      assertEquals("a", RecursiveProblems.stringClean("aaaaaa"));
   }
}
