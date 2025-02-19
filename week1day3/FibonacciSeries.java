package week1day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range=8;
		int series[] = new int[range];
		for(int i=0;i<range;i++) {
			if(i==0 || i==1) {
				series[i]=i;
				System.out.print(series[i]+",");
			}
			else {
				series[i]=series[i-1]+series[i-2];
				System.out.print(series[i]+",");
			}
		}
		
		
	}

}
