package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<String>();

        //add names to array list
        myList.add("Sowmya");
        myList.add("Prasanth");
        myList.add("Dhruv");
        myList.add("Aryan");
        myList.add("Aradhyula");

        //print all names in array list
        for(String name : myList)
        {
            System.out.println(name);
        }

        //get() method to retrieve the 3rd name in the ArrayList
        System.out.println("Third name in the Array List is " + myList.get(2));

        //Use contains() method to check if a name exists in the ArrayList.
        System.out.println("Is Dhruv in the list is " + myList.contains("Dhruv"));

        //Use size() method to print the number of names in the ArrayList.
        System.out.println("Number of names in the Array List are " + myList.size());

        //Use remove() method to remove a name from the list and print the size() of the list again
        myList.remove("Aradhyula");
        System.out.println("Now the size of Array List is " + myList.size());

    }
}
