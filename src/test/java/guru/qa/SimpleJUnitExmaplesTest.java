package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleJUnitExmaplesTest {

    @Disabled("IRL-13069") //дизейблит тест
    @Test
    void simpleTest0 () {
        Assertions.assertEquals("Str", "Str");
        Assertions.assertTrue("Str".equals("Str"));
    }

    @DisplayName("Check that profile page will be open...") //отображет название теста
    @Test
    void simpleTest1 () {
        Assertions.assertEquals("Str", "Str");
        Assertions.assertTrue("Str".equals("Str"));
    }


    @Test
    void simpleTest2 () {

    }
}
