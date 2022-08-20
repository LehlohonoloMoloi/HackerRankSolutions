import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        int min = 0;
        int max = 0;

        Integer temp;


        for(int i = 0; i < arr.size() - 1; i++)
        {
            for(int j = 0; j < arr.size() - i - 1; j++)
            {
                if(((Comparable)(arr.get(j).intValue())).compareTo(arr.get(j+1).intValue()) > 0)
                {
                    temp = arr.get(j);
                    arr.add(j, arr.get(j+1));
                    arr.remove(j+2);
                    arr.add(j+1, temp);
                    arr.remove(j+2);
                }
            }
        }

        for(int i = 0; i < arr.size() - 1; i++)
        {
            min += arr.get(i).intValue();
        }
        for(int i = 1; i < arr.size(); i++)
        {
            max += arr.get(i).intValue();
        }

        System.out.println("Min sum: " + min + "\nMax sum: " + max);

    }

}


