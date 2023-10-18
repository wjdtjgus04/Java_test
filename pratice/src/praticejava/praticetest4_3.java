package praticejava;

public class praticetest4_3 {
	public static void main(String args[]) {
		int sum = 0, count = 0, i = 1;
		
		while(true) {
			if(i%2 == 1) {
				sum += i;
				count++;
				i++;
			}else {
				sum -= i;
				count++;
				i++;
			}
			
			if(sum >= 100) {
				System.out.println(count);
				break;
			}
		}
}
}

