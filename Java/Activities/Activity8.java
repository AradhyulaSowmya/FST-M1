package activities;

public class Activity8
{
    public static void main(String[] args)
    {
        try
        {
            //passing a string
            Activity8.exceptionTest("Hello Sowmya");

            //passing a null vale
            Activity8.exceptionTest(null);
        }
        catch (CustomException nullMessage)
        {
            System.out.println("Inside catch block: " + nullMessage.getMessage());
        }
    }

    String str;

    static void exceptionTest(String str) throws CustomException
    {
        if (str == null)
        {
            throw new CustomException("String value is null");
        }
        else
        {
            System.out.println("Message is " + str);
        }
    }
}


