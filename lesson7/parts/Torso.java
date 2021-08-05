package Lesson07.online.test.parts;

import Lesson07.online.test.Robot;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.08.2021
 */

public class Torso extends RobotPart {

    private int defence;

    public Torso(Robot robot, String name, int valueLevel) {
        super(robot, name);
        this.robotLevel = valueLevel;
        this.defence = 5;
    }

    @Override
    public void getDamage(int value) {
        int tmp = value / defence;
        this.structureHealth -= tmp;
        System.out.println(this.nameParts + " get damage " + tmp + " point(s)");
    }

}
