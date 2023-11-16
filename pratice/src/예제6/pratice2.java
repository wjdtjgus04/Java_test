package ¿¹Á¦6;

public class pratice2 {
	public static void main(String[] args) {
		Student s = new Student("È«±æµ¿",1,1,100,60,76);
		String str = s.info();
		System.out.println(str);

	}
}

class Student {

	String str;
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;

	Student(String str,int num1,int num2,int num3,int num4,int num5) {
		
		this.str= str;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
	}

	public String info() {
		String str1 ="";
		int num6= (num3+num4+num5);
		float num7=num6 /3;
		
		str1=""+str+","+num1+","+num2+","+num3+","+num4+","+num5+","+num6+","+num7;
		return str1;
		
	}
	
}