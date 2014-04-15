package db.web;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceControllerTest {

    DiceController controller = new DiceController();

    @Test
    public void itShouldRenderTheRollResult() {
        assertTrue(
                "response not matchting",
                controller.roll().matches("rolled: \\d"));
    }
}
