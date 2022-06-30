package activities;

public class Activity5
{
    public static void main(String[] args)
    {
        MyBook newNovel = new MyBook();

        String title = "It's My Book";

        newNovel.setTitle(title);
        System.out.println("Title of the Book is " + newNovel.getTitle());
    }
}
