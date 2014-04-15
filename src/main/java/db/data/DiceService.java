package db.data;

import db.core.Dice;

import java.util.List;

public interface DiceService {

    void createDice(int sides);

    List<Dice> getAllDice();
}
