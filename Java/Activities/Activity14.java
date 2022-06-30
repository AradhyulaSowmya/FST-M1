package activities;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Activity14
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            //this is to tell path where file should be created and name
            File file = new File("src/main/resources/file.txt");

            //check if file is created or nit
            boolean fStatus = file.createNewFile();

            if (fStatus)
            {
                System.out.println("file is created");
            }
            else
            {
                System.out.println("file is not created");
            }

            //get the file Object - this will give the path where file is created
            File fileUtil = FileUtils.getFile("src/main/resources/file.txt");

            //Read file- this will print the data in the file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            //Create directory
            File destDir = new File("resources1");

            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "file.txt");

            //Read data from new file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");

            //Print it
            System.out.println("Data in new file: " + newFileData);
        }
        catch (IOException errMessage)
        {
            System.out.println(errMessage);
        }
    }
}


