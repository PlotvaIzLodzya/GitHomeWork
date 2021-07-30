package HomeWorkApp6;

public class Dog extends Animals {

    protected static int dogCounter = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCounter++;
    }
}


