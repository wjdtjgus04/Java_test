package hello;

import java.util.*;
public class tank2 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
	
	int myTankPos = 10;
	int enTankPos = 20;
	System.out.println("����ũ�� �����ϰڽ��ϴ�.");
	int choice = random.nextInt(2)+1;//�������� �̵�(1) or ����(2)�� ����
	System.out.println(); //�̷��� ()�ȿ� ���� println�� �ٹٲ����� ����, ��� ���� ���ҷ��� ���� ���
	
	if (choice == 1) {
		System.out.println("�̵� ����");
		System.out.println();
		int entankRandomMove = random.nextInt(3)-1;//���� ��ĭ �̵��� -1, ������ ��ĭ�̵��� 1
		while(entankRandomMove==0) {//entankRandomMove�� 0�� ������ �ʵ��� while���� ���� 0�� �ȳ��ö����� ������ ���̱� ������ �ݺ��ϴ� Ƚ���� ���������� ���� �� for���� �ƴ϶� while�� ���
			entankRandomMove = random.nextInt(3)-1;
		}
		enTankPos +=entankRandomMove; 
		System.out.println("�� ��ũ�� ��ġ�� :"+myTankPos+"�Դϴ�");
		System.out.println("�� ��ũ�� ��ġ�� :"+enTankPos+"�Դϴ�");
		}
	else{ 
		
		System.out.println("���� ����");
		System.out.println();
		int enAttackArange= random.nextInt(5)-2; // -2~2 �� ������ �� �ϳ� ���ϱ�
		enAttackArange+=myTankPos; // �� ��ũ�� ���� ��ġ �����̹Ƿ� ���� ���ݹ���+����ġ
		System.out.println("�� ��ź�� ��ġ: "+enAttackArange+"�� ���������ϴ�");
		
		}

	
	
	
	
	
	
	}
	
}
