import java.util.Stack;

public class Solution {

    public static void main(String[] args)
    {
        String[] binaryNumbers = {"11000101", "10101010", "11111111", "10000000", "1111100000"};

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("%-16s%-16s%-25s%d\n","Binary number: ", binaryNumbers[i], " ----------> Decimal number: ", binToDec(binaryNumbers[i]));
        }

    }

    public static int binToDec(String bin_num)
    {
        Stack<Integer> number = new Stack<Integer>();
        //1 0 1 0 1 0 1 0

        for(int i = 0; i < bin_num.length(); i++)
        {
            number.push(Character.getNumericValue(bin_num.charAt(i)));
        }

        int result = 0;
        int exp = 0;
        //int count = number.size();

        //System.out.println(number.toString());
        // - number Stack Variable
        while(!number.isEmpty())
        {
            result += Math.pow(2, exp) * number.pop().intValue();
            exp++;
        }
        /*
        for(int i = 0; i < count; i++)
        {
            result += Math.pow(2, exp) * number.pop().intValue();
            exp++;
        }*/

        return result;
    }

}
