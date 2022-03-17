import java.util.*;
public class stringpermutation{
	
	static final int MAX_CHAR = 26;
	
	static int factorial(int n)
	{
		int fact = 1;
		for (int i = 2; i <= n; i++)
			fact = fact * i;
		return fact;
	}
	
	static int countDistinctPermutations(String str)
	{
		int length = str.length();
		int[] freq = new int[MAX_CHAR];
		char string[] = str.toCharArray(); 
		 
		 for(int i = 0; i <str.length(); i++)
		 {
			 	freq[i] = 1;  
	            for(int j = i+1; j <str.length(); j++)
	            {  
	                if(string[i] == string[j])
	                {  
	                    freq[i]++;  
	                }
	            }
		 }
		 
		int fact = 1;
		
		for (int k = 0; k < MAX_CHAR; k++)
		{
			fact = fact * factorial(freq[k]);
		}
		return factorial(length) / fact;
	}
	
	                
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(countDistinctPermutations(str));
		
		sc.close();
	}
}

