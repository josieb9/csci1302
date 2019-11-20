package lab4;
//Programmer: Jossalyn Byrd
//Date: 10/13/2019
//Lab 4 - Searching and Sorting
import java.util.Scanner;

public class MyTestClass {

	public static void main(String[] args) {
		String[] userVals = new String[5];
		String key = "";
		int i = 0;
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter five string values: ");
		
		for (i = 0; i < userVals.length; i++) {
			userVals[i] = scnr.next();
		}
		
		System.out.println("\nEnter search key: ");
		key = scnr.next();
		
		//selection sort in ascending order
		System.out.println("Using selection sort to sort string in ascending order: ");
		Sorting<String> sorts = new Sorting<String>();
		sorts.selectionSort(userVals);
		for (String vals : userVals)
            System.out.print(vals + " ");
		
		//selection sort in descending order
		System.out.println("\nUsing reverse selection sort to sort string in descending order: ");
		sorts.reverseSelectionSort(userVals);
		for (String vals : userVals)
            System.out.print(vals + " ");
		
		//insertion sort in ascending order
		System.out.println("\nUsing insertion sort to sort string in ascending order: ");
		sorts.insertionSort(userVals);
		for (String vals : userVals)
            System.out.print(vals + " ");
		
		//insertion sort descending order
		System.out.println("\nUsing reverse insertion sort to sort string in descending order: ");
		sorts.reverseInsertionSort(userVals);
		for (String vals : userVals)
            System.out.print(vals + " ");
		
		sorts.selectionSort(userVals); //sorting userVals in ascending order to make the search easier.
		
		//linear search
		Searching<String> search = new Searching<String>();
		System.out.println("\nUsing Linear search to search for " + key + " key:\n" + search.linearSearch(userVals, key));
		
		
		//binary search
		//binary search assumes a list in ascending order
		System.out.println("Using Binary search to search for " + key + " key:\n" + search.binarySearch(userVals, key));
		
		
		
    }
}
