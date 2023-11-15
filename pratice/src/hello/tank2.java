package hello;

import java.util.*;
public class tank2 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
	
	int myTankPos = 10;
	int enTankPos = 20;
	System.out.println("적탱크가 공격하겠습니다.");
	int choice = random.nextInt(2)+1;//랜덤으로 이동(1) or 공격(2)을 선택
	System.out.println(); //이렇게 ()안에 없는 println은 줄바꿈으로 쓰임, 결과 보기 편할려고 쓰는 경우
	
	if (choice == 1) {
		System.out.println("이동 선택");
		System.out.println();
		int entankRandomMove = random.nextInt(3)-1;//왼쪽 한칸 이동은 -1, 오른쪽 한칸이동은 1
		while(entankRandomMove==0) {//entankRandomMove이 0이 나오지 않도록 while문을 쓰기 0이 안나올때까지 돌리는 것이기 때문에 반복하는 횟수가 정해져있지 않음 즉 for문이 아니라 while문 사용
			entankRandomMove = random.nextInt(3)-1;
		}
		enTankPos +=entankRandomMove; 
		System.out.println("내 탱크의 위치는 :"+myTankPos+"입니다");
		System.out.println("적 탱크의 위치는 :"+enTankPos+"입니다");
		}
	else{ 
		
		System.out.println("공격 선택");
		System.out.println();
		int enAttackArange= random.nextInt(5)-2; // -2~2 중 랜덤한 값 하나 정하기
		enAttackArange+=myTankPos; // 내 탱크의 현재 위치 기준이므로 적의 공격범위+내위치
		System.out.println("적 포탄이 위치: "+enAttackArange+"에 떨어졌습니다");
		
		}

	
	
	
	
	
	
	}
	
}
