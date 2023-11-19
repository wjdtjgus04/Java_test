package pratice;

import java.util.*;

public class zombie7 {
	public static void main(String[] args) {

		char[] showMap = new char[20];
		int myPosition = 1;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("������ ���� �Է��ϼ���: ");
		int zombieCount = scanner.nextInt();
		int[] zombiePosArray = new int[zombieCount];

		for (int i = 0; i < zombieCount; i++) {
			zombiePosArray[i] = random.nextInt(19) + 2; // 2���� 20 ������ ���� ��ġ
		}

		while (true) {
			// ���� ��ġ ���
			System.out.println();
			for (int i = 0; i < zombieCount; i++) {
				System.out.println("���� " + (i + 1) + ": " + zombiePosArray[i]);
			}
			System.out.println();
			System.out.println("�� ��ġ: " + myPosition);

			// showMap �ʱ�ȭ
			for (int i = 0; i < showMap.length; i++) {
				showMap[i] = '-';
			}

			// showMap�� ���� ��ġ ǥ��
			for (int i = 0; i < zombieCount; i++) {
				int zombiePos = zombiePosArray[i];
				showMap[zombiePos - 1] = 'Z';

				// ���� �̵� -1, 0, �Ǵ� 1
				int move = random.nextInt(3) - 1;
				while (move == 0) {
					move = random.nextInt(3) - 1;
				}

				// ���� ���� ���� ��ġ�� ���� �� �� ��ġ�� ó������ ��������
				if (zombiePosArray[i] == myPosition) {
					System.out.println();
					System.out.println("�������ϴ�, ó������");
					myPosition = 1;
				}

				// ���� ��ġ ����
				zombiePosArray[i] += move;

				// ���� ��ġ�� �� ������ ����� �ʵ��� ��
				zombiePosArray[i] = Math.min(20, Math.max(2, zombiePosArray[i]));
			}

			// showMap ���
			System.out.println();
			showMap[myPosition - 1] = 'M';
			System.out.print("��>> ");
			for (char cell : showMap) {
				System.out.print(cell);
			}

			// ���� ���� ���� �߰�
			if (myPosition >= 20) {
				System.out.println("\n����! �̵� �Ϸ�!");
				break;
			}

			// ����� �Է� �ޱ�
			System.out.println("\n��� ������ �̵��Ͻðڽ��ϱ�? (1. ����, 2. ������, 3. ����)");
			int choice = scanner.nextInt();

			// �̵� ó��
			if (choice == 1 || choice == 2) {
				System.out.print("�󸶳� �̵��Ͻðڽ��ϱ�? ");
				int moveAmount = scanner.nextInt();
				if (choice == 1) {
					myPosition = Math.max(1, myPosition - moveAmount);
				} else if (choice == 2) {
					myPosition = Math.min(20, myPosition + moveAmount);
				}
			} else if (choice == 3) {
				int randomMove = random.nextInt(3) + 1; // 1���� 3������ ���� �̵�
				myPosition = Math.min(20, myPosition + randomMove);
			}
		}
	}

}
