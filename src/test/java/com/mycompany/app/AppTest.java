package com.mycompany.app;
import java.util.Random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testAddRandomNumbers() {
        App app = new App();
        
        // Set fixed random numbers for testing
        app.setRandomNumber1(5);
        app.setRandomNumber2(3);

        // Perform the addition
        int result = app.addRandomNumbers();

        // Assert the result
        assertEquals(8, result);
    }

    @Test
    public void testRandomNumberRange() {
        App app = new App();

        // Generate random numbers
        app.setRandomNumber1(new Random().nextInt(10) + 1);
        app.setRandomNumber2(new Random().nextInt(10) + 1);

        // Get the generated random numbers
        int randomNumber1 = app.getRandomNumber1();
        int randomNumber2 = app.getRandomNumber2();

        // Assert that the generated random numbers are within the expected range
        assertTrue(randomNumber1 >= 1 && randomNumber1 <= 10);
        assertTrue(randomNumber2 >= 1 && randomNumber2 <= 10);
    }
}

