package HomeWorkApp6;

public class AnimalsAction {
    public static void main(String[] args){


        Animals[] allAnimals = {new Cat("Мурзик"),
                                new Cat("Шишкин"),
                                new Dog("Шашлык"),
                                new Dog("Воланчик"),
                                new Dog("Вантуз")};



        System.out.println("Всего животных: " + Animals.animalCounter + ". Среди них котов " + Cat.catCounter + ", собак " + Dog.dogCounter + ". ");
        System.out.println("===Забег животных===");
        animalsRun(allAnimals, 600);
        System.out.println("===Заплыв животных===");
        animalsSwim(allAnimals, 11);


    }

    public static void animalsSwim(Animals[] animals, int swimDistance){
        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Cat){
                System.out.println("Кот " + animals[i].name +  " утонул(");
                continue;
            }
            animals[i].swimDistance(swimDistance);
        }
    }

    public static void animalsRun(Animals[] animals, int runDistance){
        for(int i = 0; i < animals.length; i++){
            animals[i].runDistance(runDistance);
        }
    }



//    public static void countAnimals(Animals[] animals){
//        int catCounter = 0;
//        int dogCounter = 0;
//        int animalCounter;
//        for (animalCounter = 0; animalCounter < animals.length; animalCounter++){
//            if(animals[animalCounter] instanceof Cat){
//                catCounter++;
//            }
//            if(animals[animalCounter] instanceof Dog){
//                dogCounter++;
//            }
//        }
//        System.out.println("Всего участвует " + animalCounter + " животных." +
//                " Кошек " + catCounter +
//                " и собак " + dogCounter);
//    }
}
