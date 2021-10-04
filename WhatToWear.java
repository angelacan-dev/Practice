import java.util.Scanner;

//this program takes user input about what temperature it is outside and tells the user what to wear based on input
public class WhatToWear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); /* Scanner class takes input from user. we create new object of type Scanner
		System.in is passed as a parameter in Scanner class. It tells the java compiler that system input will be provided through console(keyboard).*/
		int currentWeather; //variable for currentWeather declared
		
		System.out.println("What temperature is it?: ");
		currentWeather = sc.nextInt(); //what kind of input you expect.  if datatype of currentWeather were String it would be myObj.nextLine();
		
		
		if (currentWeather >= 0 && currentWeather <= 50) {
		    	System.out.println("Wear heavy coat, pants and thick shoes");
		    }
		
		else if (currentWeather >= 70 && currentWeather < 90) {
	    	System.out.println("Sun shiny days, wear pants or shorts and short sleeve shirt");
	    }
		
	    else if (currentWeather >= 90) {
	    	System.out.println("Very hot, wear shorts and light tshirt");
	    }
	    
	    else {
	    	System.out.println("Weather is mild, maybe pants and  light jacket");
	    }
		
	}

}


// this program takes user input asking what temp it is outside and tells the user the current weather
/*import java.util.Scanner;

public class WhatToWear {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String currentWeather;
		
		System.out.println("What temperature is it?: ");
		currentWeather = myObj.nextLine(); // 
	       
	    System.out.println("Your current weather is: " + currentWeather);    
		
		
	}

}*/