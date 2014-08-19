/*
 * Matthew G. Mershon         3/27/14
 * CSIS 293-9240              Mr. Giron
 * Project 3
 * Description: Write a class named Month.
 */
public class Month {

	public static int monthNumber;
   /* Tried to get enum to work. Couldn't figure out how to grab
    * the value if give the ordinal.
    * enum Months
    *{
    *     January, February, March, April, May,
    *     June, July, August, September, October,
    *     November, December;
    * public static final Months values[] = values();}
    */
	static String months[] =
		{
		null, "January" , "February" , "March" , "April", "May",
		"June", "July", "August", "September", "October",
		"November", "December"
		};
	public Month(){ // No argument constructor.
		monthNumber = 1;
	}
	
	public Month(int numberOfMonth){ //Constructor with argument to set monthNumber.
		if( numberOfMonth <1 | numberOfMonth >12){
			monthNumber = 1;
		} else {
			monthNumber = numberOfMonth;
		}
			
	}
	public Month(String name){ //Constructor with string argument to compare it to month names.
		if (name.equalsIgnoreCase(months[1])) monthNumber = 1; 
		 else if (name.equalsIgnoreCase(months[2])) monthNumber = 2; 
		 else if (name.equalsIgnoreCase(months[3])) monthNumber = 3; 
		 else if (name.equalsIgnoreCase(months[4])) monthNumber = 4; 
		 else if (name.equalsIgnoreCase(months[5])) monthNumber = 5; 
		 else if (name.equalsIgnoreCase(months[6])) monthNumber = 6; 
		 else if (name.equalsIgnoreCase(months[7])) monthNumber = 7; 
		 else if (name.equalsIgnoreCase(months[8])) monthNumber = 8; 
		 else if (name.equalsIgnoreCase(months[9])) monthNumber = 9; 
		 else if (name.equalsIgnoreCase(months[10])) monthNumber = 10; 
		 else if (name.equalsIgnoreCase(months[11])) monthNumber = 11; 
		 else if (name.equalsIgnoreCase(months[12])) monthNumber = 12; 
		 else monthNumber = 1; //If the string given doesn't equal any of the 12 values of array months.
	}
	//@arg user given string
	public void setMonthNumber(int monthN) { //Sets monthNumber to user value, unless it's out of bounds. Then defaults to 1.
	 if (monthN < 1 || monthN > 12) 
		 monthNumber = 1; 
	 else monthNumber = monthN; 
	 }
	//@return monthNumber
	public int getMonthNumber(){ //Returns the monthNumber
		return monthNumber;
	}
	//@return String associated with current monthNumber
	public String getMonthName(){ //Returns the month name with current monthNumber.
		return months[monthNumber];
	}
	//@return String associated with current MonthNumber
	public String toString(){ //Same as getMonthName.
		return getMonthName();
	}
	//@return true/false
	public boolean equals(Month month2){ //passes true/false if user input equals current monthNumber
	 boolean status; 
	 if( month2.getMonthNumber( )==monthNumber ) 
	 status = true; 
	 else 
	 status = false; 

	 return status; 
	 } 
	//@return true/false
	 public boolean greaterThan(Month month2){ //passes true if calling is greater than argument
	 boolean status; 

	 if (monthNumber > month2.getMonthNumber()) 
	 status = true; 

	 else 
	 status = false; 

	 return status; 

	 } 
	//@return true/false
	 public boolean lessThan(Month month2){ //passes true if calling is less than argument
	 boolean status; 
	 if (monthNumber < month2.getMonthNumber()) 
	 status = true; 

	 else 
	 status = false; 

	 return status; 
	 } 
}
