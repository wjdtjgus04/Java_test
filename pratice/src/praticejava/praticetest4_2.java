package praticejava;

public class praticetest4_2 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1; i<= 10; i++) {
			sum += (i*(11-i));
			
		}
		System.out.println(sum);	
	}
}
	

/*
 if(i%2 != 0 || i%3 !=0){
	sum += i;
 }
i�� 2�� 3���� �������� �������� �����ϸ� ���ϴ� ����� ��
���⼭ or�� �ƴ� and�� ������ ��(||�� �ƴ϶� &&)
 
 */
 