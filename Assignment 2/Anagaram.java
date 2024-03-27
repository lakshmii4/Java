package classworkdayfour;

public class Anagaram {
	
	public class Anagram {
		public static boolean isAnagram(String str1, String str2)   
		{  
		      
		char[] characters = str1.toCharArray();  
		StringBuilder sb = new StringBuilder(str2);  
		
		for (char ch : characters)   
		{  
		      
		int index = sb.indexOf("" + ch);  
		if (index != -1)   
		{  
		    
		sb.deleteCharAt(index);  
		}   
		else   
		{  
		return false;  
		}  
		}  
		
		return sb.length() == 0 ? true : false;  
		}  
		
		public static void main(String args[])   
		{    
		   
		System.out.println(isAnagram("TABLE", "BLEAT"));    
		System.out.println(isAnagram("TOSS", "SHOT"));   
		}    
		}    
	 
	 

}
