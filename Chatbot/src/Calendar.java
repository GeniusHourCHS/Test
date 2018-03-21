import java.util.GregorianCalendar;
//https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html
public class Calendar {
	/*public int year = 2017;
	public int month = 3;
	public int dayOfMonth = 21;*/
	
	public void setDate(int year, int month, int dayOfMonth) {
		year = year;
		month = month;
		dayOfMonth = dayOfMonth;
	    }
	GregorianCalendar calender = new GregorianCalendar(year, month, dayOfMonth);
	
}
