package ru.itis503.infa;

import java.util.Random;

public class Ant extends Animal{

    public Ant(String name) {
        //вызов конструктора предка
        super(name);
    }

    public void move() {
        Random random = new Random();
        //получаем псевдо число 0...3
        int direction = random.nextInt(4);
        //0 - back, 1 - right, 2 - forward, 3 -left
        switch (direction) {
            case(0): if (x >0) x--;
        }
    }
}
