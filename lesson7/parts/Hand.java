package HomeWorkApp7.parts;


import HomeWorkApp7.Robot;

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
