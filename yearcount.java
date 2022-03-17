

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class yearcount {

	public static int distinct_year(String str) {
		String str2 = "";

		Set<String> uniqueDates = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				str2 += (str.charAt(i));
			}
			
			if (str.charAt(i) == '-') {
				str2 = "";
			}
			
			
		
			if (str2.length() == 4) 
				{
					uniqueDates.add(str2);
					str2 = "";
					}
				}
		
		return uniqueDates.size();
	}

	static public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		System.out.println(distinct_year(str));
		sc.close();
		
	}

	
	

	
}
