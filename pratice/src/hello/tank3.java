package hello;

import java.util.*;
public class tank3 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
	int myTankPos = 10;
	int enTankPos = 20;
	
	System.out.println("�� ��ġ: "+myTankPos);
	System.out.println("�� ��ġ: "+enTankPos);
	System.out.println();
	
	System.out.println("������ �����ϰڽ��ϴ�.");
	
	
	while(true) {//��ź�� ���� �°ų� ���� ���߸� ������ �������� �ϰ� �׷��� ������ �ݺ��ؼ� ����, �ݺ�Ƚ�� ���������� ������ while �������� �ݺ��ϴ� ��ź�� ���߰ų� ������ break;�� �Ἥ ���������� 
		//break;���� (�Ҹ� ������=true)�ؼ� ���������� ������ (������ = false)�� �ص� ��
		System.out.println();
		System.out.println("�� �����Դϴ� ");
		System.out.println("�����̵�, ������ �̵�, ������ �����ϼ���");
		int choice = sc.nextInt();
		System.out.println();
		
		if (choice == 1) {
			System.out.println("�����̵� ����");
			myTankPos --;
			if (enTankPos <= 1) {//��ũ�� ��ġ�� 1�����̸� �����̵��� �����ϴ��� �� ��ũ ��ġ�� 1�̿��� ��
				myTankPos = 1;
			}
			System.out.println(" �� ��ũ�� :"+myTankPos+"�� �̵��߽��ϴ�.");
			}
		else if (choice == 2) {
			System.out.println("������ �̵� ����");
			myTankPos ++;
			if (enTankPos >= 30) {//��ũ�� ��ġ�� 30 �̻��̸� �������̵��� �����ϴ��� �� ��ũ ��ġ�� 30�̿��� ��
				myTankPos = 30;
			}
			System.out.println(" �� ��ũ�� :"+myTankPos+"�� �̵��߽��ϴ�.");
			}
		else if (choice == 3) {
			System.out.println("���� ����");
			int myAttackArange= random.nextInt(5)-2; 
			myAttackArange+=enTankPos; 
			System.out.println("�� ��ź�� ��ġ: "+myAttackArange+"�� ���������ϴ�");
			if(myAttackArange == enTankPos) { //�� ��ź�� ������ ������ �� ��ġ�϶� ��������
				System.out.println("���� �����߽��ϴ�. ���� �̰���ϴ�.");
				System.out.println();
				System.out.println("��������");
				break;//break�� �ݺ��� �ϳ��� ���������� �ž� ���� �ݺ����� �������� ��ø�� �Ǿ��ִٸ� ������ true�� �����ؼ� ���� ���� �򰥸��� �ʰ� ����
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
			//�� ���ʿʹ� �޸� ��ǻ�ʹ� �������� �����̱� ������ �Ѵ� ����
			//���� �� ��ũ�� ������ ���������� ���ھ �̷������� ���������� ���� �ִ� ������ó�� �� ��ġ�� 1�̸� �����̵��� ���͵� 1, ����ġ�� 30�̸� ������ �̵��� ���͵� 30�̶�� �����ص� �� �̰� �ڱ� ����� ����(������ ������)
			//���⼭ ���� �߿��Ѱ� ���� 1~30���� ũ���� �� �̰� ������ ���Ѿ���
			if (enTankPos == 1) {//��ũ�� ��ġ�� 1�ϰ�� ���������θ� ����
				entankRandomMove = 1;
			}
			if (enTankPos == 30) {//��ũ�� ��ġ�� 30�ϰ�� �������θ� ����
				//if-elseif-else�� if�� �ƴϸ� else if�� ���� else if�� �ƴϸ� else�� ���ǽ��� �����ϴµ�
				// if�� �ִ� ���� ���ǽ��� �����غ��� ������ �������� ������ �������� �����̾� if-else if( ���⼭�� else�� ���� �ȵ�)�� ����� �ᵵ ��
				entankRandomMove = -1;
			}
			enTankPos +=entankRandomMove; 
			System.out.println("�� ��ũ�� ��ġ�� :"+myTankPos+"�Դϴ�");
			System.out.println("�� ��ũ�� ��ġ�� :"+enTankPos+"�Դϴ�");
			}
		else{ 
			
			System.out.println("���� ����");
			int enAttackArange= random.nextInt(5)-2;
			enAttackArange+=myTankPos; 
			System.out.println("�� ��ź�� ��ġ: "+enAttackArange+"�� ���������ϴ�");
			if(enAttackArange == myTankPos) { //�� ��ź�� ������ ������ �� ��ġ�϶� ��������
				System.out.println("���� �����߽��ϴ�. ��ǻ�Ͱ� �̰���ϴ�.");
				System.out.println();
				System.out.println("��������");
				break;
				}
			else {
				System.out.println("���������ϴ�.");
			
			}
			
			}
		

		
		
	}
	

	
	}
	
}
