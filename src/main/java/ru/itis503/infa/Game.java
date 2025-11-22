package ru.itis503.infa;

import java.util.Random;

public class Game {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;

    public static final int SQ_WIDTH = 200;
    public static final int SQ_HEIGHT = 200;

    public static final int SQ_X = 400;
    public static final int SQ_Y = 400;
    public void run() {
        Random random = new Random();
        int position = random.nextInt(1,WIDTH);
        Ant ant = new Ant("муравьишка");
        ant.setStartPosition(position, 0);

        for(int i = 0; i < 100; i++){
            ant.move();
            System.out.println("x = " + ant.getX() + ", y = " + ant.getY());
        }
    }
}
