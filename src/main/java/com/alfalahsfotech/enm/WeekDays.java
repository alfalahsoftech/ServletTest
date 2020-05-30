package com.alfalahsfotech.enm;



//Note: Java compiler internally adds values(), valueOf() and ordinal() methods within the enum at compile time. It internally creates a static and final class for the enum.
public enum WeekDays {

	MONDAY("Monday"){

	},TEUESDAY("Tuesday"),WEDNESDAY("Wednesday"),THURSDAY("Thursday"),FRIDAY("Friday"),SATURDAY("Saturday"),SUNDAY("Sunday");

	enum Season { WINTER, SPRING, SUMMER, FALL; }//semicolon(;) is optional here  

	private String day;

	/* We can see 7 times constructor called it means seven object created
	 * Constructory called for: Monday
Constructory called for: Tuesday
Constructory called for: Wednesday
Constructory called for: Thursday
Constructory called for: Friday
Constructory called for: Saturday
Constructory called for: Sunday
	 */

	private WeekDays(String day) {
		this.day =  day;
		System.out.println("Constructory called for: "+day);
	}


	public String getDay() {
		return day;
	}
	public static void main(String[] args) {  
		Season s=Season.WINTER;  
		System.out.println(s);  
		System.out.println("Animal:"+Animal.CAT.makeNoise());
	}  
}

enum OnlyConstructor{
	OnlyConstructor(){}	
}
enum Export{
	PDF,CSV
	//void print() {}  // semicolon is mandatory if any other member defined apart from constant
}
enum Printer{
	//void print() {}  //without constant no other member except constructor.Since first line must be constant so only semicolon is acceptable
}
/*enum y extends X{   //wrong declaration. because --> enum y extends java.lang.Enum{ }

}*/

//First line must be list of constants if other member is defined
enum Fish{
	/*void typeoffish() {
	}
	STAR,GOLD; */
}

//Can we have an abstract method in the Enum?
enum Animal {
	CAT {
		public String makeNoise() { return "MEOW!"; }  ///defined abstract method
	},
	DOG {
		public String makeNoise() { return "WOOF!"; }///defined abstract method
	};

	public abstract String makeNoise();  //----------> abstract method
}