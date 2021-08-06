package HomeWorkApp7.parts;

import HomeWorkApp7.Robot;

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
