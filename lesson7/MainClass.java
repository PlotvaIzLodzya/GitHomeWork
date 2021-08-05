package Lesson07.online.test;

import Lesson05.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.08.2021
 */

public class MainClass {

    public static void main(String[] args) {
        Robot robot1 = new Robot("T1000");
        Robot robot2 = new Robot("T2000");

        robot1.attackLeft(robot2);
        robot1.attackRight(robot2);
        robot1.speak();

        Hero hero = new Hero("Hello");

    }
}
