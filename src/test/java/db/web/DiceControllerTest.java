package db.web;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceControllerTest {

    DiceController controller = new DiceController();

    @Test
    public void itShouldRenderTheRollResult() {
        int result = controller.roll().getResult();

        assertTrue(
                "response not matchting",
                result >= 1 && result <= 6);
    }
}
