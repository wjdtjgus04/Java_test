package hello;

import java.util.*;
public class tank4 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
	int myTankPos = 10;
	int enTankPos = 20;
	int myHp =3;
	
	System.out.println("내 위치: "+myTankPos);
	System.out.println("적 위치: "+enTankPos);
	System.out.println();
	
	System.out.println("게임을 시작하겠습니다.");
	
	
	while(true) {
		System.out.println();
		System.out.println("내 차례입니다 ");
		System.out.println("왼쪽이동, 오른쪽 이동, 공격을 선택하세요");
		int choice = sc.nextInt();
		System.out.println();
		
		if (choice == 1) {
			System.out.println("왼쪽이동 선택");
			myTankPos --;
			if (enTankPos <= 1) {
				myTankPos = 1;
			}
			System.out.println(" 내 탱크가 :"+myTankPos+"로 이동했습니다.");
			if(myTankPos == enTankPos) { // 적탱크와 내 위치가 같을때 내가 이김(게임종료)
				System.out.println("적의 탱크와 부딪쳤습니다. 내가 이겼습니다.");
				break;
			}
			}
		else if (choice == 2) {
			System.out.println("오른쪽 이동 선택");
			myTankPos ++;
			if (enTankPos >= 30) {
				myTankPos = 30;
			}
			System.out.println("내 탱크가 :"+myTankPos+"로 이동했습니다.");
			System.out.println();
			if(myTankPos == enTankPos) { // 적탱크와 내 위치가 같을때 내가 이김(게임종료)
				System.out.println("적의 탱크와 부딪쳤습니다. 내가 이겼습니다.");
				break;
			}
			}
		else if (choice == 3) {
			System.out.println("공격 선택");
			int myAttackArange= random.nextInt(5)-2; 
			myAttackArange+=enTankPos; 
			System.out.println("내 포탄이 위치: "+myAttackArange+"에 떨어졌습니다");
			if(myAttackArange == enTankPos) {
				System.out.println("적을 명중했습니다. 내가 이겼습니다.");
				System.out.println();
				System.out.println("게임종료");
				break;
				}
			else {
				System.out.println("빗나갔습니다. ");
			}
			}
		System.out.println("컴퓨터 차례입니다 ");
		int enchoice = random.nextInt(2)+1;
		System.out.println(); 
		
		if (enchoice == 1) {
			System.out.println("이동 선택");
			System.out.println();
		
			int entankRandomMove = random.nextInt(3)-1;
			while(entankRandomMove==0) {
				entankRandomMove = random.nextInt(3)-1;
			}
		
			if (enTankPos == 1) {
				entankRandomMove = 1;
			}
			if (enTankPos == 30) {
				
				entankRandomMove = -1;
			}
			enTankPos +=entankRandomMove; 
			System.out.println("내 탱크의 위치는 :"+myTankPos+"입니다");
			System.out.println("적 탱크의 위치는 :"+enTankPos+"입니다");
			
			if(myTankPos == enTankPos) { // 적탱크와 내 위치가 같을때 내가 이김(게임종료)
				System.out.println("적의 탱크와 부딪쳤습니다. 내가 이겼습니다.");
				break;
			}
			}
		else{ 
			
			System.out.println("공격 선택");
			int enAttackArange= random.nextInt(5)-2;
			enAttackArange+=myTankPos; 
			System.out.println("적 포탄이 위치: "+enAttackArange+"에 떨어졌습니다");
			if(enAttackArange == myTankPos) { 
				System.out.println("나를 명중했습니다. 내 hp가 깍입니다.");
				myHp --;
				if(myHp == 0) {//조건문은 조건만족하지 않으면 조건문을 무시하고 진행하기 때문에 if문을 먼저 씀 
				System.out.println("내 hp가 0입니다. 게임종료");
				break;
				}
				System.out.println("현재 내 hp: "+myHp);
			
				
				
				}
			else {
				System.out.println("빗나갔습니다.");
			
			}
			
			}
		

		
		
	}
	

	
	}
	
}
