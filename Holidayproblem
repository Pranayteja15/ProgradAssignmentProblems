class Holiday{
    private String name;
    private int day;
    private String month;
    Holiday(){}
    Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public String getmonth(){
        return this.month;
    }
    public int getday(){
        return this.day;
    }
    public void set(String name, int day, String month){
        this.name=name;
        this.day = day;
        this.month =month;
    }
    public void show(){
        System.out.println(name+" is in "+day+" of "+month);
    }
}
public class MainHoliday
{
    public static boolean inSameMonth(String m1, String m2){
        if (m1==m2){
            return true;
        }
        return false;
    }
    public static void avgDate(Holiday[] arr){
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getday();
        }
        float average = sum / length;
        System.out.println("Average of dates : "+average);
    }
	public static void main(String[] args) {
		Holiday h1 = new Holiday("Deepavali",25,"November");
		Holiday h2 = new Holiday("valantine",14,"February");
		
		if (inSameMonth(h1.getmonth(),h2.getmonth())){
		    System.out.println("Both are in Same months");
		}
		else{
		System.out.println("Both are different months");
		}
		        Holiday h3 = new Holiday();
        h3.set("Bhogi", 15, "January");
        h3.show();
		
		Holiday[] arr = {h1,h2,h3};
        avgDate(arr);
	}
}
