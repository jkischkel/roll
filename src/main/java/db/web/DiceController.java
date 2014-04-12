package db.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import db.core.Dice;

@RestController
@EnableAutoConfiguration
public class DiceController {

    @RequestMapping("/roll")
    public String roll() {
        int result = Dice.create(6).roll();

        return String.format("rolled: %d", result);
    }
}
