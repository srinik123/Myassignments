package week1day4;

public class ChangedOddIndextoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String test = "changeme";
		 char[] charArray = test.toCharArray();
		 for(int i=1; i < charArray.length ; i+=2)
		 {
			 charArray[i] = Character.toUpperCase(charArray[i]);
		 }
		 String result = new String(charArray);
		 System.out.println(result);
	}
	
	}


