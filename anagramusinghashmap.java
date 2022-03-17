import java.util.HashMap;
import java.util.Scanner;

public class anagramusinghashmap{
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    String st1=sc.next();
    String st2=sc.next();
     Boolean result=anagram(st1,st2);
     if(result==true)
       System.out.println("true");
     else
       System.out.println("false");
  }
  static boolean anagram(String st1, String st2)
  {
    HashMap<Character ,Integer> map1= new HashMap<Character ,Integer>();
    HashMap<Character ,Integer> map2= new HashMap<Character ,Integer>();
    int len1=st1.length();
    int len2=st2.length();
    char[] arr1=st1.toCharArray();
    char[] arr2=st2.toCharArray();
    if(len1!=len2)
    {
      return false;
    }
    else {
    for(int i=0;i<len1;i++) {
      if(map1.get(arr1[i])==null)
        map1.put(arr1[i], 1);
      else {
     int count1= (int)map1.get(arr1[i]);
     map1.put(arr1[i], ++count1);
      }
    }
    for(int j=0;j<len2;j++) {
      if(map2.get(arr2[j])==null)
        map2.put(arr2[j], 1);
      else {
      int count2=(int)map2.get(arr2[j]);
      map2.put(arr2[j], ++count2);
      }
    }
    if(map1.equals(map2))
      return true;
    else
      return false;
  }
  }
}
