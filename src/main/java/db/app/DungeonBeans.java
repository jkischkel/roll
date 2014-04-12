package db.app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import db.web.DiceController;

public final class DungeonBeans {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiceController.class, args);

        System.out.printf("Started context [%s]\n", ctx);
    }
}
