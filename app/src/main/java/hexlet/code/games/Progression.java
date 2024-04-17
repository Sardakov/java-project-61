package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {

    public static int getNum(int x) {
        int a = 1;
        return  a + (int) (Math.random() * x);
    }

    public static void startGame() {
        String task = "What number is missing in the progression?";
        String[][] firstData = new String[Engine.MAXRAUND][2];
        int longProgression = 10;
        int maxNumber = 40;
        int stepProgression = 5;
        int indexArray = 9;
        String[] litllarray = new String[longProgression]; //magic number
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int first = getNum(maxNumber); //magic number
            int second = getNum(stepProgression); //magic number
            for (int x = 0; x < litllarray.length; x++) {
                litllarray[x] = String.valueOf(first);
                first += second;
            }
            int point = getNum(indexArray); //magic number
            firstData[i][1] = litllarray[point];
            litllarray[point] = "..";
            firstData[i][0] = String.join(" ", litllarray);
        }
        Engine.newGame(task, firstData);
    }
}
