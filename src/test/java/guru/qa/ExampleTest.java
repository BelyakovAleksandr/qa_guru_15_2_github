package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest_0() {
        Assertions.assertTrue(2 > 1);
    }

    @Test
    void exampleTest_1() {
        Assertions.assertFalse(10 > 20);
    }
}
