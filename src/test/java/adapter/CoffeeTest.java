package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {

    @Test
    void shouldGetSizeName() {
        Coffee coffee = new Coffee();
        coffee.setSize("Large");

        assertEquals("Large", coffee.getSize());
    }

    @Test
    void shouldGetSizeMeasure() {
        Coffee coffee = new Coffee();
        coffee.setSize("Medium");

        assertEquals(400, coffee.getMeasure());
    }
}
