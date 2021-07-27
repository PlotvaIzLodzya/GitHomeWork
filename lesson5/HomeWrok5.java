package HomeWorkApp5;

public class HomeWrok5 {

    public static void main(String[] args){
        Employee[] employArray = new Employee[5];
        employArray[0] = new Employee("Ivanov Ivan41", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        employArray[1] = new Employee("Ivanov Ivan30", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employArray[2] = new Employee("Ivanov Ivan40", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        employArray[3] = new Employee("Ivanov Ivan25", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 25);
        employArray[4] = new Employee("Ivanov Ivan60", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 60);

        ageHigher40(employArray);

    }

    public static void ageHigher40(Employee[] employArr) {
        for (int i = 0; i < 5; i++) {
            if(employArr[i].age>40)
            employArr[i].giveInfo();
        }
    }


}
