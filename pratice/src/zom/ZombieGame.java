package zom;

import java.util.Scanner;

public class ZombieGame {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("좀비1", 7);
        Zombie zombie2 = new Zombie("좀비2", 15);
        Hero hero = new Hero("자기이름", 1, 3);

        Scanner scanner = new Scanner(System.in);

        while (hero.currentPosition < 20 && hero.life > 0) {
            hero.displayLife();
            System.out.println("1. 왼쪽으로 이동 | 2. 오른쪽으로 이동 | 3. 점프");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hero.leftMove();
                    break;
                case 2:
                    hero.rightMove();
                    break;
                case 3:
                    hero.jump();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    continue;
            }

            zombie1.move();
            zombie2.move();

            if (hero.currentPosition == zombie1.currentPosition || hero.currentPosition == zombie2.currentPosition) {
                hero.life--;
                if (hero.life > 0) {
                    System.out.println("좀비에게 잡혔습니다. 현재 나의 생명은 " + hero.life + "개 남았습니다. 처음 위치에서 다시 시작합니다.");
                    hero.currentPosition = 1;
                } else {
                    System.out.println("생명이 0입니다. 게임을 종료합니다.");
                }
            } else if (hero.currentPosition >= 20) {
                System.out.println("미션 클리어!!! 목적지에 도착했습니다.");
            }
        }

        scanner.close();
    }
}
