package Lesson02.online;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.07.2021
 */

public class Lesson02 {

    public static int valueClass = 6;

    public static void main(String[] args) {
//        int valueMethod1 = 10;
//        System.out.println(valueClass);
//        System.out.println(valueMethod1);
//
//        {
//            System.out.println(valueClass);
//            System.out.println(valueMethod1);
//            int valueCodeBlock = 15;
//            System.out.println(valueCodeBlock);
//        }

//        System.out.println(valueCodeBlock);

//        studySwitch();

//        int a = 10;
//        int b = 20;
//        int result;
//
//        if (a > b) {
//            result = a;
//        } else {
//            result = b;
//        }
//
//        result = (a > b) ? a : b; //тернарный оператор
//        result = (a > b) ? doSomething1() : doSomething2();
//
//        System.out.println(result);

//        for (int i = 0; i < 10; i += 5) {
//            System.out.println("Hello world" + i);
//        }

//        System.out.println("Result myMath = " + myMath(2, 10));
//        System.out.println("Count go: " + goShop(1000));
//        goShop(1000);

//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//            if (i == 5) break;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 7) continue;
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                //do something
//            }
//        }

//        table(10, 10);

        int abc = 10;

//        while (abc < 10) {
//            abc++;
//            if (abc == 4) continue;
//            System.out.print(abc + " ");
//        }

        do {
            abc++;
            System.out.print(abc + " ");
        } while (abc < 10);

    }

//    public static int doSomething1() {
//        //.....
//        return 45;
//    }
//
//    public static int doSomething2() {
//        //.....
//        return 69;
//    }

//    public static void method2() {
//        System.out.println(valueClass);
//        System.out.println(valueMethod1);
//        System.out.println(valueCodeBlock);
//    }

//    public static void method3() {
//        if (10 > 0) {
//            int valueInIfTrue = 15;
//            System.out.println(valueClass);
//            System.out.println(valueMethod1);
//        } else {
//            System.out.println(valueInIfTrue);
//            System.out.println(valueClass);
//            System.out.println(valueMethod1);
//        }
//    }

    public static void goShop(int cash) {
        int price = 40;
        int count = 1;

        for (int i = 0; ; i++) {
            System.out.println("Go to shop > number " + i);
            cash -= price;
            count++;
            if (cash < price) {
                break;
            }
        }
        System.out.println("cashBack = " + cash);
        System.out.println("Count go: " + count);
    }

    public static int myMath(int base, int signature) {
        int result = base;

        for (int i = 1; i < signature; i++) {
            result *= base;
        }
        return result;
    }

    public static void studySwitch() {
        String nameLetter = "Maria";

        if (nameLetter == "Olga") {
            System.out.println("Give letter to Olga");
        } else if (nameLetter == "Maria") {
            System.out.println("Give letter to Maria");
        } else if (nameLetter == "Alex") {
            System.out.println("Give letter to Alex");
        } else {
            System.out.println("Go out office");
        }

        System.out.println("*********");

        switch (nameLetter) {
            case "Olga":
                System.out.println("Give letter to Olga");
                break;
            case "Maria":
                System.out.println("Give letter to Maria");
                break;
            case "Qwerty":
                System.out.println("123456");
                break;
            case "Alex":
                System.out.println("Give letter to Alex");
                break;
            default:
                System.out.println("Go out office");
                break;
        }

        System.out.println("*********");
    }

    public static void table(int width, int height) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }
}
