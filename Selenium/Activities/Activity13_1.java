package activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1
{
    public static void main(String[] args) throws IOException, CsvException
    {
        CSVReader reader = new CSVReader(new FileReader("src/resources/sample.csv"));

        //Use the readAll() method to read the contents of the CSV file.
        List<String[]> list = reader.readAll();

        //Use the size() method to count the number of rows in the CSV file
        System.out.println("total number of rows are " + list.size());

        //Create Iterator reference
        Iterator<String[]> itr = list.iterator();

        //Iterate all values
        while(itr.hasNext())
        {
            String[] str = itr.next();
            System.out.print("Values are: ");

            for(int i = 0; i < str.length; i++)
            {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");
        }
    }
}
