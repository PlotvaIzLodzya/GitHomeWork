package Lesson07.online.test.parts;

import Lesson07.online.test.Robot;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.08.2021
 */

public class Leg extends RobotPart {

    private int speed;

    public Leg(Robot robot, String name, int levelValue) {
        super(robot, name);
        this.robotLevel = levelValue;
        this.speed = calculateSpeed();
    }

    private int calculateSpeed(){
        return robotLevel + generateRandomBorder(robotLevel, nameParts.length());
    }

    public int getSpeed() {
        return speed;
    }
}
