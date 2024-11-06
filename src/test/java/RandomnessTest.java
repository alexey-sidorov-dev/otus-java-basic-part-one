import org.junit.jupiter.api.*;

import static ru.otus.java.basic.Randomness.*;

public class RandomnessTest {
    @Test
    void testRandomGenerations() {
        Assertions.assertInstanceOf(Integer.class, generateRandomInteger());

        Assertions.assertInstanceOf(Integer.class, generateRandomInteger(generateRandomInteger()));
        Assertions.assertTrue(generateRandomInteger(generateRandomInteger()) >= 0);

        Assertions.assertInstanceOf(Boolean.class, generateRandomBoolean());
    }
}
