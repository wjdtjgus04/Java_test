package hello;

import java.util.*;
public class tank {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
	
	int myTankPos = 10;
	int enTankPos = 20; // ���� 1������ ��Ȯ�� ����X ���Ƿ� �����մϴ�.
	System.out.println("�����̵�, ������ �̵�, ������ �����ϼ���");
	int choice = sc.nextInt();
	System.out.println();
	
	if (choice == 1) {
		System.out.println("�����̵� ����");
		myTankPos --;
		System.out.println(" �� ��ũ�� :"+myTankPos+"�� �̵��߽��ϴ�.");
		}
	else if (choice == 2) {
		System.out.println("������ �̵� ����");
		myTankPos ++;
		System.out.println(" �� ��ũ�� :"+myTankPos+"�� �̵��߽��ϴ�.");
		}
	else if (choice == 3) {
		System.out.println("���� ����");
		int myAttackArange= random.nextInt(5)-2; // -2~2 �� ������ �� �ϳ� ���ϱ�
		myAttackArange+=enTankPos; // ����ũ�� ���� ��ġ �����̹Ƿ� �� ���ݹ���+����ġ
		System.out.println("�� ��ź�� ��ġ: "+myAttackArange+"�� ���������ϴ�");
		}
	
	
	
	
	
	
	}
	
}
