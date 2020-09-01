
public class Squares {

	public static void main(String[] args) {
		getSquares(10);
		getSquare2(1,10);

	}
	static void getSquares(int n) {
		for(int i=0;i<n||i==n;i++) {
			System.out.println("The square of "+ i +" is "+ i*i);
		}
	}
	
	static void getSquare2(int i, int n) {
		
		if(i<n||i==n) {
			System.out.println(i+"," + i*i);
			getSquare2(i + 1,  n);
		}
		
		else {
			return;
		}
	}
	
	
}
