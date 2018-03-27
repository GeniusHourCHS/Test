//https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html
import java.util.Calendar;
public class mainCalendar {
	Calendar calendarOne = Calendar.getInstance();
	int date = calendarOne.get(Calendar.DATE);
	int month = calendarOne.get(Calendar.MONTH);
	int year = calendarOne.get(Calendar.YEAR);
	int week = calendarOne.get(Calendar.WEEK_OF_YEAR);
	int weekMonth = calendarOne.get(Calendar.WEEK_OF_MONTH);
	int dayYear = calendarOne.get(Calendar.DAY_OF_YEAR);

	//retrieve values
	public int getDate() {
		return date;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int getWeekYear() {
		return week;
	}
	public int getWeekMonth() {
		return weekMonth;
	}
	public int getDateYear() {
		return dayYear;    
	}
}