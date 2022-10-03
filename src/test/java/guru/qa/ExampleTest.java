package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExampleTest {

    @Test
    void exampleTest_0() {
        Assertions.assertTrue(new Random().nextInt() > 1);
    }

    @Test
    void exampleTest_1() {
        Assertions.assertFalse(new Random().nextInt() > 2);
    }
}
