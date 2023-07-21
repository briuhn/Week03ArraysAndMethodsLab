//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int numArray[] = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println(numArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(numArray[1+4]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(numArray[6]);
			// the programs crashes out since the index 6 doesn't exist.
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(numArray[-1]);
			// same thing as last one sine it doesn't exist it errors out. 
		
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("For loop");
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Enhanced for loop");
		for(int i : numArray) {
			System.out.println(i);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("---------");
		double sum = 0;
		for (int i : numArray) {
			sum += i;
		}
		System.out.println(sum);
		
			
		// 9. Create a new variable called average and assign the average value of the array to it
		double average;
		average = sum / numArray.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for(int i : numArray) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String nameArray[] = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int sumInArray = 0;
		for(String name : nameArray) {
			sumInArray += name.length();
		}
		System.out.println(sumInArray);
		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greeting("LeBron");
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(returnGreeting("Steph"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
			//  in method 13 we are just doing the print line and nothing else while in method 15 we are actually 
				//returning the input back into out main code. 
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(stringLongerThanNum("try" , 3));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(isStringInArray(nameArray, "Sam"));
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(smallestNumInArray(numArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] doubleArray= {37.7,45.4,86.5};
		System.out.println(returnAverage(doubleArray));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] nameLength = stringLengths(nameArray);
		for(int number : nameLength) {
			System.out.println(number);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(oddOrEvenCharacters(nameArray));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println(palindrome("racecar"));
		
		
	}
	

	
	// Method 13:
	public static void greeting(String name) {
		System.out.println("Hello "+name);
	}

	// Method 14:
	public static String returnGreeting(String name) {
		return "Hi " + name;
	}
	
	// Method 15:
	public static boolean stringLongerThanNum (String word, int num) {
		if (word.length() > num) {
			return true;
		}else {
			return false;
		}
	}
	
	// Method 16:
	public static boolean isStringInArray(String[] array, String word) {
		for(String words : array) {
			if (words.equals(word)) {
				return true;
			}
		}
		return false;
	}
		
	
	// Method 17:
	public static int smallestNumInArray(int[] numbers) {
		int smallestNum = numbers[0];
		for (int number : numbers) {
			if (number < smallestNum) {
				smallestNum = number;
			}
		}
		return smallestNum;
	}
	
	// Method 18:
	public static double returnAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	// Method 19:
	public static int[] stringLengths(String[] strings) {
		int[] results = new int[strings.length]; 
		for(int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	
	// Method 20:
	public static boolean oddOrEvenCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for(String string : array) {
			if(string.length() %2 == 0) {
				evenLetters += string.length();
			}else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
	// Method 21:
	public static boolean palindrome(String word) {
		for(int i = 0; i < word.length() /2 ; i++) {
			if (word.charAt(i) != word.charAt(word.length()-i -1)){
				return false;
			}
		}
		return true;
	}

}