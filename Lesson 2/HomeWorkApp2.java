package HomeWorkApp2;

public class HomeWork2 {

    public static void main(String[] args){

        System.out.println(CheckSum(3,3));
        System.out.println("************");
        System.out.println(CheckPositve(-1));
        System.out.println("************");
        System.out.println(CheckNegative(4));
        System.out.println("************");
        WritingStrings("Asd",4);
        System.out.println("************");
        System.out.println(isBissextile(1800));


    }
        public static boolean CheckSum(int a, int b){
            return  (a+b>10 && a+b<20);


        }

        public static String CheckPositve(int a){
        if(a>=0){
            return "Positive";
        } else {
            return "Negative";
        }
        }

        public static boolean CheckNegative(int a){
        return a<0;
        }

        public static void WritingStrings(String text, int quantity){
        for(int i = 0; i< quantity; i++){
           System.out.println(text);
        }
        }
        public static boolean isBissextile(int year){
        if(year%400 == 0){
            return true;
        } else {
            if(year%100 == 0){
                return false;
            } else {
                if(year%4 == 0){
                    return true;
                } else {
                    return false;
                }
            }

        }
        }
}
