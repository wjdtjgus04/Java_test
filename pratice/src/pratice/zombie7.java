package pratice;

import java.util.*;

public class zombie7 {
	public static void main(String[] args) {

		char[] showMap = new char[20];
		int myPosition = 1;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("좀비의 수를 입력하세요: ");
		int zombieCount = scanner.nextInt();
		int[] zombiePosArray = new int[zombieCount];

		for (int i = 0; i < zombieCount; i++) {
			zombiePosArray[i] = random.nextInt(19) + 2; // 2부터 20 사이의 랜덤 위치
		}

		while (true) {
			// 좀비 위치 출력
			System.out.println();
			for (int i = 0; i < zombieCount; i++) {
				System.out.println("좀비 " + (i + 1) + ": " + zombiePosArray[i]);
			}
			System.out.println();
			System.out.println("내 위치: " + myPosition);

			// showMap 초기화
			for (int i = 0; i < showMap.length; i++) {
				showMap[i] = '-';
			}

			// showMap에 좀비 위치 표시
			for (int i = 0; i < zombieCount; i++) {
				int zombiePos = zombiePosArray[i];
				showMap[zombiePos - 1] = 'Z';

				// 좀비 이동 -1, 0, 또는 1
				int move = random.nextInt(3) - 1;
				while (move == 0) {
					move = random.nextInt(3) - 1;
				}

				// 좀비가 나와 같은 위치에 있을 때 내 위치를 처음으로 돌려놓음
				if (zombiePosArray[i] == myPosition) {
					System.out.println();
					System.out.println("잡혔습니다, 처음으로");
					myPosition = 1;
				}

				// 좀비 위치 갱신
				zombiePosArray[i] += move;

				// 좀비 위치가 맵 밖으로 벗어나지 않도록 함
				zombiePosArray[i] = Math.min(20, Math.max(2, zombiePosArray[i]));
			}

			// showMap 출력
			System.out.println();
			showMap[myPosition - 1] = 'M';
			System.out.print("맵>> ");
			for (char cell : showMap) {
				System.out.print(cell);
			}

			// 게임 종료 조건 추가
			if (myPosition >= 20) {
				System.out.println("\n도착! 이동 완료!");
				break;
			}

			// 사용자 입력 받기
			System.out.println("\n어느 쪽으로 이동하시겠습니까? (1. 왼쪽, 2. 오른쪽, 3. 점프)");
			int choice = scanner.nextInt();

			// 이동 처리
			if (choice == 1 || choice == 2) {
				System.out.print("얼마나 이동하시겠습니까? ");
				int moveAmount = scanner.nextInt();
				if (choice == 1) {
					myPosition = Math.max(1, myPosition - moveAmount);
				} else if (choice == 2) {
					myPosition = Math.min(20, myPosition + moveAmount);
				}
			} else if (choice == 3) {
				int randomMove = random.nextInt(3) + 1; // 1에서 3까지의 랜덤 이동
				myPosition = Math.min(20, myPosition + randomMove);
			}
		}
	}

}
