package hello;

import java.util.*;
public class tank4 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
	int myTankPos = 10;
	int enTankPos = 20;
	int myHp =3;
	
	System.out.println("�� ��ġ: "+myTankPos);
	System.out.println("�� ��ġ: "+enTankPos);
	System.out.println();
	
	System.out.println("������ �����ϰڽ��ϴ�.");
	
	
	while(true) {
		System.out.println();
		System.out.println("�� �����Դϴ� ");
		System.out.println("�����̵�, ������ �̵�, ������ �����ϼ���");
		int choice = sc.nextInt();
		System.out.println();
		
		if (choice == 1) {
			System.out.println("�����̵� ����");
			myTankPos --;
			if (enTankPos <= 1) {
				myTankPos = 1;
			}
			System.out.println(" �� ��ũ�� :"+myTankPos+"�� �̵��߽��ϴ�.");
			if(myTankPos == enTankPos) { // ����ũ�� �� ��ġ�� ������ ���� �̱�(��������)
				System.out.println("���� ��ũ�� �ε��ƽ��ϴ�. ���� �̰���ϴ�.");
				break;
			}
			}
		else if (choice == 2) {
			System.out.println("������ �̵� ����");
			myTankPos ++;
			if (enTankPos >= 30) {
				myTankPos = 30;
			}
			System.out.println("�� ��ũ�� :"+myTankPos+"�� �̵��߽��ϴ�.");
			System.out.println();
			if(myTankPos == enTankPos) { // ����ũ�� �� ��ġ�� ������ ���� �̱�(��������)
				System.out.println("���� ��ũ�� �ε��ƽ��ϴ�. ���� �̰���ϴ�.");
				break;
			}
			}
		else if (choice == 3) {
			System.out.println("���� ����");
			int myAttackArange= random.nextInt(5)-2; 
			myAttackArange+=enTankPos; 
			System.out.println("�� ��ź�� ��ġ: "+myAttackArange+"�� ���������ϴ�");
			if(myAttackArange == enTankPos) {
				System.out.println("���� �����߽��ϴ�. ���� �̰���ϴ�.");
				System.out.println();
				System.out.println("��������");
				break;
				}
			else {
				System.out.println("���������ϴ�. ");
			}
			}
		System.out.println("��ǻ�� �����Դϴ� ");
		int enchoice = random.nextInt(2)+1;
		System.out.println(); 
		
		if (enchoice == 1) {
			System.out.println("�̵� ����");
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
			System.out.println("�� ��ũ�� ��ġ�� :"+myTankPos+"�Դϴ�");
			System.out.println("�� ��ũ�� ��ġ�� :"+enTankPos+"�Դϴ�");
			
			if(myTankPos == enTankPos) { // ����ũ�� �� ��ġ�� ������ ���� �̱�(��������)
				System.out.println("���� ��ũ�� �ε��ƽ��ϴ�. ���� �̰���ϴ�.");
				break;
			}
			}
		else{ 
			
			System.out.println("���� ����");
			int enAttackArange= random.nextInt(5)-2;
			enAttackArange+=myTankPos; 
			System.out.println("�� ��ź�� ��ġ: "+enAttackArange+"�� ���������ϴ�");
			if(enAttackArange == myTankPos) { 
				System.out.println("���� �����߽��ϴ�. �� hp�� ���Դϴ�.");
				myHp --;
				if(myHp == 0) {//���ǹ��� ���Ǹ������� ������ ���ǹ��� �����ϰ� �����ϱ� ������ if���� ���� �� 
				System.out.println("�� hp�� 0�Դϴ�. ��������");
				break;
				}
				System.out.println("���� �� hp: "+myHp);
			
				
				
				}
			else {
				System.out.println("���������ϴ�.");
			
			}
			
			}
		

		
		
	}
	

	
	}
	
}
