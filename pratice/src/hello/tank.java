package hello;

import java.util.*;
public class tank {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
	
	int myTankPos = 10;
	int enTankPos = 20; // 문제 1에서는 정확한 설명X 임의로 지정합니다.
	System.out.println("왼쪽이동, 오른쪽 이동, 공격을 선택하세요");
	int choice = sc.nextInt();
	System.out.println();
	
	if (choice == 1) {
		System.out.println("왼쪽이동 선택");
		myTankPos --;
		System.out.println(" 내 탱크가 :"+myTankPos+"로 이동했습니다.");
		}
	else if (choice == 2) {
		System.out.println("오른쪽 이동 선택");
		myTankPos ++;
		System.out.println(" 내 탱크가 :"+myTankPos+"로 이동했습니다.");
		}
	else if (choice == 3) {
		System.out.println("공격 선택");
		int myAttackArange= random.nextInt(5)-2; // -2~2 중 랜덤한 값 하나 정하기
		myAttackArange+=enTankPos; // 적탱크의 현재 위치 기준이므로 내 공격범위+적위치
		System.out.println("내 포탄이 위치: "+myAttackArange+"에 떨어졌습니다");
		}
	
	
	
	
	
	
	}
	
}
