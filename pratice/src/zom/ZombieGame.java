package zom;

import java.util.Scanner;

public class ZombieGame {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("����1", 7);
        Zombie zombie2 = new Zombie("����2", 15);
        Hero hero = new Hero("�ڱ��̸�", 1, 3);

        Scanner scanner = new Scanner(System.in);

        while (hero.currentPosition < 20 && hero.life > 0) {
            hero.displayLife();
            System.out.println("1. �������� �̵� | 2. ���������� �̵� | 3. ����");
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
                    System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
                    continue;
            }

            zombie1.move();
            zombie2.move();

            if (hero.currentPosition == zombie1.currentPosition || hero.currentPosition == zombie2.currentPosition) {
                hero.life--;
                if (hero.life > 0) {
                    System.out.println("���񿡰� �������ϴ�. ���� ���� ������ " + hero.life + "�� ���ҽ��ϴ�. ó�� ��ġ���� �ٽ� �����մϴ�.");
                    hero.currentPosition = 1;
                } else {
                    System.out.println("������ 0�Դϴ�. ������ �����մϴ�.");
                }
            } else if (hero.currentPosition >= 20) {
                System.out.println("�̼� Ŭ����!!! �������� �����߽��ϴ�.");
            }
        }

        scanner.close();
    }
}
