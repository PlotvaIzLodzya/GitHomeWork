package HomeWorkApp6;

public abstract class Animals {

    public static void main(String[] args){

    }

    protected int animalRunDistance;
    protected int animalSwimDistance;
    protected String name;
    protected static int animalCounter = 0;


    public Animals(String name, int animalRunDistance, int animalSwimDistance){
        this.name = name;
        this.animalRunDistance = animalRunDistance;
        this.animalSwimDistance = animalSwimDistance;
        animalCounter++;

}

    public Animals(String name, int animalRunDistance){
        this.name = name;
        this.animalRunDistance = animalRunDistance;
        animalCounter++;
    }



    public void swimDistance(int distance){
        if(this.animalSwimDistance >= distance){
            System.out.println(this.name + " проплыл " + distance + " м.");
        } else {
            System.out.println(this.name + " проплыл " + this.animalSwimDistance + " м.");
        }
    }

    public void runDistance(int distance){
        if(this.animalRunDistance >= distance){
            System.out.println(this.name + " пробежал " + distance + " м.");
        } else {
            System.out.println(this.name + " пробежал " + this.animalRunDistance + " м.");
        }
    }



}
