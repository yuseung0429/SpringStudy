package di.xml.constructor.subtag;

import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("deprecation")
abstract class Person {
	String name;
	Calendar birth;
	
	public Person(String name, Calendar birth) {
		this.name = name;
		this.birth = birth;
	}

	abstract String getGender();
	
	@Override
	public String toString() {
		Date date = birth.getTime();
		String dateStr = String.format("%d-%02d-%02d", date.getYear(), date.getMonth(), date.getDate()); 
		return String.format("name : %s, gender : %s, birth : %s, Object Address : %s", name, getGender(), dateStr, super.toString());
	}
}
