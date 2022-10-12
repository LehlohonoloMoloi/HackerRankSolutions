import java.util.*;

public class MinMaxSum {

    public static void main(String[] args)
    {
        Random rand = new Random();
        List<Integer> array = new ArrayList<>();
        int number = 0;

        for(int i = 0; i < 5; i++)
        {
            number = rand.nextInt(9999999) + 1;
            array.add((number));
        }

        System.out.println(array.toString());
        miniMaxSum(array);
    }

    public static void miniMaxSum(List<Integer> arr) {

        long min = 0;
        long max = 0;

        Collections.sort(arr);


        for(int i = 0; i < arr.size() - 1; i++)
        {
            min += arr.get(i).intValue();
        }
        for(int i = 1; i < arr.size(); i++)
        {
            max += arr.get(i).intValue();
        }

        System.out.println(arr.toString());
        System.out.println("Min sum: " + min + "\nMax sum: " + max);

    }

}


