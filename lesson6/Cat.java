package HomeWorkApp6;

public class Cat extends Animals{

    protected static int catCounter = 0;

        public Cat(String name){
            super(name, 200);
            catCounter++;
        }



}
