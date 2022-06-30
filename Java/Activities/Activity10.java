package activities;

import java.util.HashSet;

public class Activity10
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Sowmya");
        hs.add("Dhruv");
        hs.add("Prasanth");
        hs.add("Ruthvick");
        hs.add("Dhrithi");
        hs.add("Arjun");

        //Then print the size of the HashSet using the size() method.
        System.out.println("Size of the hash set is " + hs.size());

        //Remove an element using the remove() method.
        hs.remove("Sowmya");

        //Also try to remove an element that is not present in the Set.
        if(hs.remove("Viraj"))
        {
            System.out.println("Viraj is there in the set");
        }
        else
        {
            System.out.println("Viraj is not there in the set");
        }

        //Use the contains() method to check if an item is in the Set or not.
        System.out.println("Is dhruv name there in the list is " + hs.contains("Dhruv"));

        //Print the updated set
        System.out.println("Now the Hash set is " + hs);

    }
}
