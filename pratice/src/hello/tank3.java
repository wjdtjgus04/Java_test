package hello;

import java.util.*;
public class tank3 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
	int myTankPos = 10;
	int enTankPos = 20;
	
	System.out.println("내 위치: "+myTankPos);
	System.out.println("적 위치: "+enTankPos);
	System.out.println();
	
	System.out.println("게임을 시작하겠습니다.");
	
	
	while(true) {//포탄에 내가 맞거나 적을 맞추면 게임이 끝나도록 하고 그렇지 않으면 반복해서 진행, 반복횟수 안정해졌기 때문에 while 무한으로 반복하다 포탄을 맞추거나 맞으면 break;를 써서 빠져나오기 
		//break;말고도 (불린 변수명=true)해서 빠져나오고 싶으면 (변수명 = false)로 해두 됨
		System.out.println();
		System.out.println("내 차례입니다 ");
		System.out.println("왼쪽이동, 오른쪽 이동, 공격을 선택하세요");
		int choice = sc.nextInt();
		System.out.println();
		
		if (choice == 1) {
			System.out.println("왼쪽이동 선택");
			myTankPos --;
			if (enTankPos <= 1) {//탱크의 위치가 1이하이면 왼쪽이동을 선택하더라도 내 탱크 위치는 1이여야 함
				myTankPos = 1;
			}
			System.out.println(" 내 탱크가 :"+myTankPos+"로 이동했습니다.");
			}
		else if (choice == 2) {
			System.out.println("오른쪽 이동 선택");
			myTankPos ++;
			if (enTankPos >= 30) {//탱크의 위치가 30 이상이면 오른쪽이동을 선택하더라도 내 탱크 위치는 30이여야 함
				myTankPos = 30;
			}
			System.out.println(" 내 탱크가 :"+myTankPos+"로 이동했습니다.");
			}
		else if (choice == 3) {
			System.out.println("공격 선택");
			int myAttackArange= random.nextInt(5)-2; 
			myAttackArange+=enTankPos; 
			System.out.println("내 포탄이 위치: "+myAttackArange+"에 떨어졌습니다");
			if(myAttackArange == enTankPos) { //내 포탄이 공격한 지점이 적 위치일때 게임종료
				System.out.println("적을 명중했습니다. 내가 이겼습니다.");
				System.out.println();
				System.out.println("게임종료");
				break;//break는 반복문 하나를 빠져나오는 거야 만약 반복문이 이중으로 중첩이 되어있다면 변수에 true를 저장해서 쓰는 편이 헷갈리지 않고 좋음
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
			//내 차례와는 달리 컴퓨터는 랜덤으로 움직이기 때문에 둘다 지정
			//나는 적 탱크가 무조건 움직였으면 좋겠어서 이런식으로 지정했지만 위에 있는 내차례처럼 내 위치가 1이면 왼쪽이동이 나와도 1, 내위치가 30이면 오른쪽 이동이 나와도 30이라고 지정해도 됨 이건 자기 맘대로 지정(문제에 없었음)
			//여기서 제일 중요한건 맵이 1~30정도 크기라는 거 이건 무조건 지켜야함
			if (enTankPos == 1) {//탱크의 위치가 1일경우 오른쪽으로만 가게
				entankRandomMove = 1;
			}
			if (enTankPos == 30) {//탱크의 위치가 30일경우 왼쪽으로만 가게
				//if-elseif-else는 if가 아니면 else if를 보고 else if도 아니면 else의 조건식을 수행하는데
				// if만 있는 경우는 조건식을 대입해보고 조건을 만족하지 않으면 실행하지 않음이야 if-else if( 여기서는 else는 쓰면 안됨)로 만들어 써도 됨
				entankRandomMove = -1;
			}
			enTankPos +=entankRandomMove; 
			System.out.println("내 탱크의 위치는 :"+myTankPos+"입니다");
			System.out.println("적 탱크의 위치는 :"+enTankPos+"입니다");
			}
		else{ 
			
			System.out.println("공격 선택");
			int enAttackArange= random.nextInt(5)-2;
			enAttackArange+=myTankPos; 
			System.out.println("적 포탄이 위치: "+enAttackArange+"에 떨어졌습니다");
			if(enAttackArange == myTankPos) { //적 포탄이 공격한 지점이 내 위치일때 게임종료
				System.out.println("나를 명중했습니다. 컴퓨터가 이겼습니다.");
				System.out.println();
				System.out.println("게임종료");
				break;
				}
			else {
				System.out.println("빗나갔습니다.");
			
			}
			
			}
		

		
		
	}
	

	
	}
	
}
