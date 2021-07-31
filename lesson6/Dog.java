package HomeWorkApp6;

public class Dog extends Animals {

    protected static int dogCounter = 0;
    private static int dogRunDistance = 500;
    private static int dogSwimDistance = 10;

    public Dog(String name) {
        super(name, dogRunDistance, dogSwimDistance);
        dogCounter++;
    }
}


