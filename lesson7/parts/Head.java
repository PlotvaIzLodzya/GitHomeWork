package HomeWorkApp7.parts;


import HomeWorkApp7.Robot;

public class Head extends RobotPart {

    private final int maxString = 5;

    public Head(Robot robot, String name) {
        super(robot, name);
    }

    public String randomString() {
        String tmpString = "";

        for (int i = 0; i < maxString; i++) {
            int valueAscii = generateRandomBorder(70, 90);
            char tmpChar = (char) valueAscii;
            tmpString += tmpChar;
        }
        return tmpString;
    }
}
