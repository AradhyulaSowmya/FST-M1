package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> colours = new HashMap<Integer,String>();

        //Add 5 random colours to it and print the Map to the console.
        colours.put(1,"Red");
        colours.put(2,"Blue");
        colours.put(3,"Green");
        colours.put(4,"Pink");
        colours.put(5,"Black");

        System.out.println("Map details are " + colours);

        //Remove one colour using the remove() method.
        colours.remove(4);

        //Check if the colour green exists in the Map using the containsValue() method.
        if(colours.containsValue("Green"))
        {
            System.out.println("Green exists in the Map is true");
        }
        else
        {
            System.out.println("Green exists in the Map is false");
        }


        //Print the size of the Map using the size() method.
        System.out.println("Size of the Map is " + colours.size());

    }
}
