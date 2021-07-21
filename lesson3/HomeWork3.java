package HomeWorkApp3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] oneHundredArray = new int[100];
        int[] someArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] someArray2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] someArray3 = {5, 1, 1, 2, 4, 3, 2};
        int[][] squareArray = new int[7][7];

        System.out.println("\n Меняем 0 на 1 и 1 на 0");
        printArray(switchArray1(zeroOne));
        System.out.println("\n Заполняем массив длинной в 100");
        printArray(fillArray2(oneHundredArray));
        System.out.println("\n Умножаем значения меньше 6 на 2");
        printArray(multiply3(someArray));
        System.out.println("\n Заполняем диагонали единицами");
        printArray2(diagonalsFill4(squareArray));
        System.out.println("\n Создаем массив указанной длинны");
        printArray(arrayCreation(5, 10));
        System.out.println("\n Находим минимальное и максимальное значение");
        minMax(someArray2);
        System.out.println("\n Упоротый способ нахождения равных половин в массиве");
        System.out.println(hardWayIsBalancedArray(someArray3));
        System.out.println("\n Просто способ нахождения делится ли массив на 2");
        System.out.println(easyWayIsBalancedArray2(someArray3));
        System.out.println("\n Крутим-вертим массив без дополнительного массива");
        printArray(arraySpinNoExtraArray(someArray3, -7));


    }

    // Выводим в консоль одномерный массив
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

// Меняем 0 на 1 и 1 на 0
    public static int[] switchArray1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

//Заполняем массив цифрами 1, 2, 3, 4, ....
    public static int[] fillArray2(int[] emptyArray) {
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i + 1;
        }
        return emptyArray;
    }

//Умномжаем на 2 значение массива если оно <6
    public static int[] multiply3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

//Заполняем диагонали единицами
    public static int[][] diagonalsFill4(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

//Выводим в консоль двумерный массив
    public static void printArray2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
        }
    }

//Создаем одномерный массив указанной длинны и заполняем указанынм значением
    public static int[] arrayCreation(int len, int initialValue) {
        int[] tmpArray = new int[len];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = initialValue;
        }
        return tmpArray;
    }

//Находим минимальное и максимально значения массива
    public static void minMax(int[] array) {
        int maxValue = array[0];
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            } else if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("Maximum: " + maxValue + "; " + "Minimum: " + minValue);
    }

//Суммируем все значения массива для сложного и простого способов
    public static int arraySum(int[] array) {
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }

//Сложный способ нахождения есть ли в массиве место в котором левая и правая части равны
    public static boolean hardWayIsBalancedArray(int[] array) {
        int arraySum = arraySum(array);
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((arraySum - currentSum) == currentSum) {
                return true;
            } else {
                currentSum += array[i];
            }

        }
        return false;
    }

//Простой способ нахождения делится ли целочисленный массив на 2
    public static boolean easyWayIsBalancedArray2(int[] array) {
        return (arraySum(array) % 2 == 0);
    }

//Крутим массив вправо без доплнительного массива
    public static int[] rightArraySpin2(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int tmpVariable = array[array.length - 1];
            for (int j = 0; j < array.length - 1; j++) {
                array[array.length - 1 - j] = array[array.length - 2 - j];
            }
            array[0] = tmpVariable;
        }
        return array;
    }

//Крутим массив влево без дополнительного массива
    public static int[] leftArraySpin2(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int tmpVariable = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = tmpVariable;
        }
        return array;
    }

//Крутим массив без дополнительного массива туда сюда
    public static int[] arraySpinNoExtraArray(int[] array, int n) {
        n = nDivided(array.length, n);
        if (n >= 0) {
            return rightArraySpin2(array, n);
        } else {
            return leftArraySpin2(array, n);
        }
    }

//Если n > array.length
    public static int nDivided(int length, int n) {
        if (n > length) {
            int nRemainder = n % length;
            return nRemainder;
        } else {
            return n;
        }
    }




}
