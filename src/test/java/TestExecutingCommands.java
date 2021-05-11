import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestExecutingCommands {

    @Test
    public void testDecoding1() { assertEquals(Arrays.asList(8, 64), ExecutingСommands.getResult("iiisdoso")); }

    @Test
    public void testDecoding2() { assertEquals(Arrays.asList(16, 14, 65536), ExecutingСommands.getResult("iissoddoiisso")); }

    @Test
    public void testDecoding3() {
        assertEquals(Arrays.asList(-3, 9, 10), ExecutingСommands.getResult("dddosoio"));
    }

    @Test
    public void testDecoding4() {
        assertEquals(null, ExecutingСommands.getResult("DDDoSOIo"));
    }


    @Test
    public void testDecoding5() {
        assertEquals(Arrays.asList(0), ExecutingСommands.getResult("o"));
    }

    @Test
    public void testDecoding6() {
        assertEquals(Arrays.asList(3), ExecutingСommands.getResult("iiio"));
    }

    @Test
    public void testDecoding7() {
        assertEquals(null, ExecutingСommands.getResult("gdsfgdfsgf"));
    }

    @Test
    public void testDecoding8() {
        assertEquals(null, ExecutingСommands.getResult(""));
    }

    @Test
    public void testDecoding9() {
        assertEquals(null, ExecutingСommands.getResult("1"));
    }

    @Test
    public void testDecoding10() {
        assertEquals(null, ExecutingСommands.getResult(null));
    }

}
