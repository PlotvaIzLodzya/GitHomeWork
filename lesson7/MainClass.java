package HomeWorkApp7;

public class MainClass {

    public static void main(String[] args) {
        RemotDoc remontDoc = new RemotDoc();
        Robot robot1 = new Robot("T1000");
        Robot robot2 = new Robot("T2000");

        robot1.attackLeft(robot2);
        robot1.attackRight(robot2);
        robot1.speak();
        
        //Чиним робота
        robot1.repair(remontDoc.getRepairAmount());
        robot2.repair(remontDoc.getRepairAmount());

        //Второй вариант, чтобы именно в ДОКЕ чинить
        remontDoc.getRepaired(robot1);



    }
}
