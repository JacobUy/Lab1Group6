
public class SumofBalloons {

	public static void main(String[] args) {
		System.out.println(sumofBalloons(4));
		System.out.println(sumofBalloons2(4));

	}
	
	
	static int sumofBalloons(int n) {
		int sum;
		if(n==0) {
			sum=0;
		}else if(n % 2 == 0) {
			sum = 5;
		}else {
			sum =2;
		}
		for(int i=3; i <=n; i+=2) {
			sum += 5;
		}

		return sum;
	}
	
	static int sumofBalloons2(int n) {
		if(n==1) {
			return 2;
		}
		
		else if(n==2) {
			return 5;
		}
	 
			return sumofBalloons2(n-2)+5;
		
		
		
		
		
	}

}
