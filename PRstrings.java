import java.util.Scanner;
import java.lang.String;
import java.util.*;
public class prstring {

	public static void main(String[] args) {
		
		int count=0;
		List<Character> chars = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		 for (char ch : input.toCharArray()) {
  
            chars.add(ch);
        }
		 sc.close(); 
		 for(int i=0;i<chars.size()-2;i++)
		 {
			 if(chars.get(i)=='P' && chars.get(i+2)=='P')
			 {
				 
				 count=count+1;
			 }
			 else if(chars.get(i)=='R' && chars.get(i+2)=='R')
			 {
				 
				 count=count+1;
			 }
			 else
			 {
				
				 break;
			 }
		 }
			if(count%2==0)
			{
				if(count==chars.size()/2)
				{
					System.out.println("perfect");
				}
			}
			else
			{
				System.out.println("imperfect");
			}

		 }
	
	
	}

