package db.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import db.core.Dice;

@RestController
@EnableAutoConfiguration
public class DiceController {

    @RequestMapping(
            value = "/roll",
            method = RequestMethod.GET)
    public @ResponseBody
    Dice.RollResult roll() {
        return Dice.create(6).roll();
    }
}
