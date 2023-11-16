package ¿¹Á¦6;

public class pratice4 {
	public static void main(String[] args) {
		
	
		
		System.out.println(excer4.getDistance(1,1,2,2));
		
	}


}

class excer4 {

	static double getDistance(int x, int y, int x1, int y1) {
		double y2=(y1-y)*(y1-y);
		double x2= (x1-x)* (x1-x);
		double z =  y2 +x2;
		double result = Math.sqrt(z);
		
		return result;
		
	}

	
		
	}
	
