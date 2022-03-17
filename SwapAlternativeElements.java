import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class swapalternative {

	public static void main(String args[])
	{

		ArrayList<Integer> ArrList = new ArrayList<Integer>();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of arraylist");
		int size=input.nextInt();
		
		for(int i=0;i<size;i++)
		ArrList.add(input.nextInt());
		

		for(int i=0;i<ArrList.size()-1;i=i+2)
		Collections.swap(ArrList, i, i+1);

		System.out.println("After Swaping the ArrayList");
		System.out.println(ArrList);
		input.close();
	}
}
