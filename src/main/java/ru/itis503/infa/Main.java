package ru.itis503.infa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int position = random.nextInt(1,1000);
        Ant ant = new Ant("муравьишка");
        ant.setStartPosition(position, 0);

        for(int i = 0; i < 100; i++){
            ant.move();
            System.out.println("x = " + ant.getX() + ", y = " + ant.getY());
        }
    }
}
