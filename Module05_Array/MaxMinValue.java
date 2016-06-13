package Module05_Array;

/**
 * Created by Andrew on 13.06.2016.
 */
public class MaxMinValue {
    public static void main(String[] args) {
        int[] maxminArray = {5, -3, 4,-152, 8,480};
        int min = maxminArray[0];
        int max = maxminArray[0];
            {
            for (int i = 0; i < maxminArray.length; i++)
                if (maxminArray[i] < min)
                min = maxminArray[i];


            System.out.println(min);
            }

            {
            for (int i = 0; i < maxminArray.length; i++)
                if (maxminArray[i] > max)
                max = maxminArray[i];

            System.out.println(max);
        }
    }
}