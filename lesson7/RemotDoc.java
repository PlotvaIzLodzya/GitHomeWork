package HomeWorkApp7;
import java.util.Random;
//import HomeWorkApp7.Robot;

public class RemotDoc {

    private int minRepairAmount = 1;
    private int maxRepairAmount = 5;
    private int repairAmount;
    private Random random = new Random();


public int getRepairAmount(){
    repairAmount = randomRange(minRepairAmount, maxRepairAmount);
    return repairAmount;

}

     int randomRange(int min, int max){
        return random.nextInt(max-min +1) + min;
    }




}
