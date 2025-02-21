package week1day4;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args){ 
		// TODO Auto-generated method stub
		{
			String text1 = "spots";
			String text2 = "stips";
			//first to check if the length of the strings are equal
			if(text1.length() != text2.length()) 
			{
				System.out.println("This is not an Anagram");
			}
			// converting the given strings to character array
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			// TODO Auto-generated method stub
			//sorting in ascending order
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//check if it anagaram using Arrays.equals() method
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The given string is anagram");
				}
			else {
				System.out.println("The given string is not anagram");
			}
		}
		
	}

}
