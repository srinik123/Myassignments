package week1day4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	    	String input = "srinivas";
	    	int count = 0;
	    	char[] charArray = input.toCharArray();
	    	for(int i = 0;i<=charArray.length-1 ;i++)
	    	{
	    		if(charArray[i] == 'i')
	    		{
	    			count++;
	    		}
	    			
	    			
	    	}
	    	
	        System.out.print(count);
	    }
	}

}
