package zom;

import java.util.Random;

class Zombie {
    String name;
    int currentPosition;

    public Zombie(String name, int currentPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
    }

    public void move() {
        Random rand = new Random();
        int moveDirection = rand.nextInt(3); // 0: stay, 1: left, 2: right

        if (moveDirection == 1 && currentPosition > 1) {
            currentPosition--;
        } else if (moveDirection == 2 && currentPosition < 20) {
            currentPosition++;
        }

        System.out.println(name + "의 현재 위치는 " + currentPosition + "입니다.");
    }
}
