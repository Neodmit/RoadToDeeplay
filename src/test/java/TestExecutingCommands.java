import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestExecutingCommands {

    @Test
    public void testDecoding1() {
        assertEquals(Arrays.asList(8, 64), ExecutingСommands.getResult("iiisdoso"));
    }

    @Test
    public void testDecoding2() {
        assertEquals(Arrays.asList(16, 14, 65536), ExecutingСommands.getResult("iissoddoiisso"));
    }

    @Test
    public void testDecoding3() {
        assertEquals(Arrays.asList(-3, 9, 10), ExecutingСommands.getResult("dddosoio"));
    }

    @Test
    public void testDecoding4() {
        assertEquals(Arrays.asList(0), ExecutingСommands.getResult("o"));
    }

    @Test
    public void testDecoding5() {
        assertEquals(Arrays.asList(), ExecutingСommands.getResult(""));
    }

    @Test
    public void testDecoding6() {
        assertEquals(Arrays.asList(), ExecutingСommands.getResult("1"));
    }
}
