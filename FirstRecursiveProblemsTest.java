import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveProblemsTest {

    @Test
    public void testCount8() {
        assertEquals(1, RecursiveProblems.count8(8));
        assertEquals(2, RecursiveProblems.count8(818));
        assertEquals(4, RecursiveProblems.count8(8818));
    }

    @Test
    public void testCountHi() {
        assertEquals(1, RecursiveProblems.countHi("xxhixx"));
        assertEquals(2, RecursiveProblems.countHi("xhixhix"));
        assertEquals(1, RecursiveProblems.countHi("hi"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(1, RecursiveProblems.countHi2("ahixhi"));
        assertEquals(2, RecursiveProblems.countHi2("ahibhi"));
        assertEquals(0, RecursiveProblems.countHi2("xhixhi"));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, RecursiveProblems.strCount("catcowcat", "cat"));
        assertEquals(1, RecursiveProblems.strCount("catcowcat", "cow"));
        assertEquals(0, RecursiveProblems.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza", RecursiveProblems.stringClean("yyzzza"));
        assertEquals("abcd", RecursiveProblems.stringClean("abbbcdd"));
        assertEquals("Helo", RecursiveProblems.stringClean("Hello"));
    }
}
