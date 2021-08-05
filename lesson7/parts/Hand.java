package Lesson07.online.test.parts;

import Lesson07.online.test.Robot;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.08.2021
 */

public class Hand extends RobotPart {

    private int damage;

    public Hand(Robot robot, String name, int valueLevel) {
        super(robot, name);
        this.robotLevel = valueLevel;
        this.damage = calculateHandDamage();
    }

    public void giveDamage(RobotPart robotPart) {
        robotPart.getDamage(damage);
        System.out.println(robot.getName() + " > " + nameParts + " give damage to " + robotPart.getNameParts() + " " + damage + " points");
    }

    private int calculateHandDamage() {
        return robotLevel * 2 + generateRandomValue(10);
    }
}
