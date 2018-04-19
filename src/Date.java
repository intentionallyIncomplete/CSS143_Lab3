
public class Date {

	private int month;
	private int day;
	private int year;
	
	//no arg cTor
	public Date(){
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}
	
	//set arguments from cTor to values
	//of variables of this class.
	public Date(int m, int d, int y){
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	//copy cTor
	public Date(Date other){
		this.month = other.month;
		this.day = other.day;
		this.year = other.year;
	}
	
	
	public boolean equals(Date other){
		if(this.month == other.month && this.day == other.day && this.year == other.year){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return this.getMonth()+"."+this.getDay()+"."+this.getYear();
	}
	
	public int getMonth() {
		if(this.month > 12 || this.month < 1){
			System.out.println("Invalid month number '"+this.month+"'");
		}
		return month;
	}

	public int getDay() {
		if(this.day > 31 || this.day < 1){
			System.out.println("Invalid day number '"+this.day+"'");
		}
		return day;
	}

	public int getYear() {
		if(this.year < 0){
			System.out.println("Invalid year number '" + this.year+"'");
		}
		return year;
	}

	public int setMonth(int month) {
		
		return month;
		
//		switch(month){
//			
//		case 1 : return "January";
//		case 2 : return "February";
//		case 3 : return "March";
//		case 4 : return "April";
//		case 5 : return "May";
//		case 6 : return "June";
//		case 7 : return "July";
//		case 8 : return "August";
//		case 9 : return "September";
//		case 10 : return "October";
//		case 11 : return "November";
//		case 12 : return "December";
//		default : return "Bad Month Number";
//		
//		}
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
