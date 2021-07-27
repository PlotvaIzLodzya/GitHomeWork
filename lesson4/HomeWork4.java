package HomeWorkApp4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static char player = '♝';
    public static int playerPosX;
    public static int playerPosY;
    public static int playerHP =15;
    public static int playerAttack = 10;
    public static int enemySlain = 0;
    public static int maxSteps = 40;

    public static char clearedPath = 'X';

    public static char[][] map;
    public static char[][] enemyMap;
    public static int mapWidth = 20;
    public static int mapHeight = 10;

    public static char obstacle = '█';
    public static int obstacleAmount =30;
    public static int obstaclePosX;
    public static int obstaclePosY;

    public static final int moveUp = 1;
    public static final int moveDown = 2;
    public static final int moveLeft = 4;
    public static final int moveRight = 3;

    public static char enemy = '☼';
    public static int enemyPosX;
    public static int enemyPosY;
    public static int enemyAttack;
    public static int minEnemyAttack;
    public static int maxEnemyAttack;
    public static int enemyAmount = 25;

    public static char heal = '♡';
    public static int healAmount = 2;
    public static int healPosX;
    public static int healPosY;
    public static char plusAttack ='✚';
    public static int plusAttackAmount = 1;
    public static int plusAttackPosX;
    public static int plusAttackPosY;

    public static int lvlCounter =1;


    public static char exit = '谷';
    public static int exitPosX;
    public static int exitPosY;




    public static void main(String[] args) {
        
// Играем пока персонаж не умрет или у него не закончатся шаги
        while(!isPlayerDead()) {
            System.out.println("Level = " + lvlCounter);
            gameCycle();
            lvlCounter++;
        }
            scanner.close();
            System.out.println("Game over. Level count = " + lvlCounter + ". " + "Enemy slain = " + enemySlain);
    }

//Игровой цикл
    public static void gameCycle(){
        System.out.println(player + "- It's you. " + exit + " - It's door to next level. " + heal + " - Healing buff. " + plusAttack + " - Atack buff.");
        initMap();
        createObstacles();
        createEnemies();
        createPowerUps();
        createPlayer();
        createExit();


//Играем на уровне пока персонаж жив или пока не дошел до перехода на следующий уровень
        while(true) {

            printMap(map);
            movePlayer();

            if(isExitReached()){
                System.out.println("================================");
                System.out.println("Congratulations. Level completed!");
                break;
            }

            if(isPlayerDead()){
                System.out.println("YOU ARE DEAD");
                break;
            }
        }

    }




//Создаем карту, отрисовываем нижнюю и верхнюю границы
    public static void initMap(){
        map = new char[mapHeight][mapWidth];
        enemyMap = new char [mapHeight][mapWidth];
        for(int y =0; y < mapHeight; y++){
            for(int x = 0; x < mapWidth; x++) {
                if(y == 0 || y == mapHeight - 1) {
                    map[y][x] = obstacle;
                } else {
                    map[y][x] = ' ';
                }
            }
        }
    }

//Рисуем карту
    public static void printMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.println();
            for (int j = 0; j < map[i].length; j++)
                System.out.print(map[i][j] + " ");
        }
        System.out.println();
    }

//Размещаем персонажа, выдаем ему шаги
    public static void createPlayer(){
        playerPosX= 1;
        playerPosY = 0;
        public static int maxSteps = 40;
        map[playerPosX][playerPosY] = player;
    }


//Движение персонажа
    public static void movePlayer(){
    int currentX = playerPosX;
    int currentY = playerPosY;
    int playerDestination;

    do {

        System.out.println(" Up >" + " " + moveUp + " down >" + " " + moveDown + " Left >" + " " + moveLeft + " Right >" + " " + moveRight );
        System.out.println("Attack = " + playerAttack + ". " + " HP = " + playerHP + ". " + "Steps left = " + maxSteps + "." + "Slain enemies = " + enemySlain + ". " + "Level = " + lvlCounter);
        System.out.print("Enter your move : ");
        playerDestination = scanner.nextInt();
        switch (playerDestination) {
            case moveUp:
                playerPosX -= 1;
                break;
            case moveDown:
                playerPosX += 1;
                break;
            case moveLeft:
                playerPosY -= 1;
                break;
            case moveRight:
                playerPosY += 1;
                break;
        }
    }while(!isValidNextStep(currentX,currentY,playerPosX, playerPosY));
        playerAction(currentY,currentX,playerPosX,playerPosY);
    }

//Проверка можно не является ли следующий ход препятсвием
    public static boolean isValidNextStep(int currentX, int currentY, int nextX, int nextY){
        if(nextY >= 0 && nextY < mapWidth  && map[nextX][nextY] != obstacle ){
            return true;
        }else{
            System.out.println("You can't go there");
            playerPosX = currentX;
            playerPosY = currentY;
            return false;
        }
    }

//Если встречаем врага - сражение затем убираем врага убираем врага с enemyMap, если бафф, то получаем бафф. 
    public static void playerAction(int currentY, int currentX, int nextX, int nextY) {
        if (enemyMap[nextX][nextY] == enemy) {
            fight();
        }
        if (map[nextX][nextY] == heal) {
            playerHP += healAmount;
        }
        if (map[nextX][nextY] == plusAttack) {
            playerAttack += plusAttackAmount;
        }
            map[playerPosX][playerPosY] = player;
            map[currentX][currentY] = clearedPath;
            enemyMap[[currentX][currentY] = clearedPath;
            maxSteps--;
        }


//Если наступили на сердечко, то получаем лечение, если на "+" то + к атаке
//    public static void poweringUp(int nextX, int nextY){
//       if(map[nextX][nextY] == heal){
//           playerHP+=healAmount;
//        } else if(map[nextX][nextY] == plusAttack)
//           playerAttack+=plusAttackAmount;
//    }

//Сражение - если атака больше атаки противника - побеждаем, получаем +1 к атаке,если атака меньше то получаем урон
    public static void fight(){
        minEnemyAttack = lvlCounter + 5 + playerAttack/4;
        maxEnemyAttack = lvlCounter*2 + 10 + playerAttack/2;
        enemyAttack = randomRange(minEnemyAttack, maxEnemyAttack);
        if(playerAttack>=enemyAttack){
            playerAttack+=1;
            enemySlain += 1;
        } else {
            playerHP -= enemyAttack-playerAttack;
        }

    }


//Создаем врагов
    public static void createEnemies(){
        System.out.println("There are: " + enemyAmount + " enemies");
        for(int i =0; i < enemyAmount; i++){
            do {
                enemyPosX = randomRange(1, mapHeight - 2);
                enemyPosY = randomRange(0, mapWidth - 1);
                enemyMap[enemyPosX][enemyPosY] = enemy;
            }while(enemyPosX == obstaclePosX && enemyPosY == obstaclePosY);
        }
    }

//Создаем баффы, располгаем их в радномное место в левой нижней и правой верхней четверти карты
    public static void createPowerUps(){
    plusAttackPosX = randomRange(1, mapHeight/2);
    plusAttackPosY = randomRange(mapWidth / 2, mapWidth-1);
    healPosX = randomRange(mapHeight / 2, mapHeight - 2);
    healPosY = randomRange(0, mapWidth / 2);

        map[plusAttackPosX][plusAttackPosY] = plusAttack;
        healAmount += lvlCounter/2;
        map[healPosX][healPosY] = heal;
    }


//Создаем препятсвия
    public static void createObstacles(){
        for(int i = 0; i< obstacleAmount; i++) {
                obstaclePosX = randomRange(1, mapHeight - 2);
                obstaclePosY = randomRange(1, mapWidth - 2);
                map[obstaclePosX][obstaclePosY] = obstacle;
        }
    }


//Создаем выход
    public static void createExit(){
        exitPosX = mapHeight-2;
        exitPosY = mapWidth-1;
        map[exitPosX][exitPosY] = exit;
    }

//Проверяем мертв ли персонаж, если хп опустилось до нуля или ниже или закочились шаги
    public static boolean isPlayerDead(){
        return playerHP<=0 || maxSteps<=0;

    }

//Проверяем дошел ли персонаж до выхода
    public static boolean isExitReached(){
        return map[exitPosX][exitPosY] != exit;
    }

//Рандомим
    public static int randomRange(int min, int max){
        return random.nextInt(max-min +1) + min;
    }
}
