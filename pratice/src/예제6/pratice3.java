package ����6;

public class pratice3 {
	public static void main(String[] args) {
		Student_2 s = new Student_2();
		
		s.name ="ȫ�浿";
		s.ban =1;
		s.no =1;
		s.kor =100;
		s.eng =60;
		s.math =76;
		
		System.out.println("�̸�: "+s.name);
		System.out.println("����: "+s.getTotal());
		System.out.println("�̸�: "+s.getAverage());

	}
}

class Student_2 {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student() {
		
	}

	public int getTotal() {
	
		int num6= (kor+eng+math);
		return num6;
		
	}
	public float getAverage() {
		
		float num7= (kor+eng+math)/3;
		return  num7;
		
	}
	
}