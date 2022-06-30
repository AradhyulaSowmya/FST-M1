package activities;

public class Activity2
{
    public static void main(String[] args) {
        int[] array = {10, 77, 10, 54, -11, 10};
        int reqNum = 10;
        int reqTotal = 30;
        System.out.println(result(array,reqNum,reqTotal));
    }

        public static boolean result(int[] array, int reqNum, int reqTotal)
        {
            int sum = 0;
            for (int i=0; i< array.length; i++)
            {
                if(array[i] == reqNum)
                {
                    sum = sum + array[i];
                }
            }
            return sum == reqTotal;
        }

    }

