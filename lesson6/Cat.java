package HomeWorkApp6;

public class Cat extends Animals{

    protected static int catCounter = 0;
    private static int catRunDistance = 200;

        public Cat(String name){
            super(name, catRunDistance);
            catCounter++;
        }

        @Override
    public void swimDistance(int distance){
            System.out.println("Кот " + this.name +  " утонул(");
    }



}
