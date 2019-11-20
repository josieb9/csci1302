package lab4;

//Programmer: Jossalyn Byrd
//Date: 10/13/2019
//Lab 4 - Searching and Sorting

//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting<T>
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
	public void selectionSort(Comparable<T>[] list)
    {
        int min;
        Comparable<T> temp;

        // One by one look at the elements of list
        for (int index = 0; index < list.length-1; index++)
        {
            // find the minimum element in the remaining part of list
        	min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo((T)list[min]) < 0)
                    min = scan;

            
            // Swap the minimum with the current value
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void insertionSort (String[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<String> key = list[index];
            int position = index;


            // Move elements of list, that are  larger than key, to one position ahead  of their current position 
            while (position > 0 && key.compareTo((String)list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }

            
            list[position] = (String) key;
        }
    }
    
    public void reverseSelectionSort(Comparable<T>[] list)
    {
        int max;
        Comparable<T> temp;

        // One by one look at the elements of list
        for (int index = 0; index < list.length-1; index++)
        {
            // find the maximum element in the remaining part of list
        	max = index;
            for (int scan = index; scan < list.length; scan++)
                if (list[scan].compareTo((T) list[max]) > 0)
                    max = scan;

            
            // Swap the max with the current value
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }
    
    public void reverseInsertionSort (Comparable<T>[] list)
    {
    	for (int index = 1; index < list.length; index++)
        {
            Comparable<T> key = list[index];
            int position = index;


            // Move elements of list, that are  larger than key, to one position ahead  of their current position 
            while (position > 0 && key.compareTo((T)list[position-1]) > 0)
            {
                list[position] = list[position-1];
                position--;
            }

            
            list[position] = key;
        }
    }
}
