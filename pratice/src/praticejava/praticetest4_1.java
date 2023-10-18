package praticejava;

public class praticetest4_1 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1; i<= 20; i++) {
			if(i%2 == 0 || i%3 == 0 ) { // 2와 3 배수일때는 sum에 i값을 더하지 않는다.
				continue;
				
			}
			sum += i;
			System.out.println(sum);	
		}
	}
}
	

/*
 if(i%2 != 0 || i%3 !=0){
	sum += i;
 }
i를 2와 3으로 나눴을때 나머지가 존재하면 더하는 방식을 함
여기서 or이 아닌 and를 써줬어야 함(||이 아니라 &&)
 
 */
 