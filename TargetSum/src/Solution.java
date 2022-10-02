import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 8};
        int target = 12;

        int[] solution = getTargetIndexes(numbers, target);
        for(int i = 0; i < 2; i++){
            System.out.print(solution[i] + " ");
        }
    }

    public static int[] getTargetIndexes(int[] numbers, int target){
        HashMap<Integer,Integer> sum = new HashMap<Integer,Integer>();
        int[] returnArray = new int[2];

        for(int i = 0; i < numbers.length; i++){
            sum.put(target-numbers[i], i);
        }

        for(int i = 0; i < numbers.length; i++){
            if(sum.containsKey(target-numbers[i])){
                returnArray[0] = sum.get(target);
                returnArray[1] = i;
            }/**
            else {
                sum.put(target-numbers[i], i);
            }**/
        }
        /**
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = numbers.length - 1; j >= 0; j--)
            {
                if(numbers[i] == numbers[j]){
                    continue;}

                else
                {
                    if(numbers[i] + numbers[j] == target)
                    {
                        returnArray[0] = i;
                        returnArray [1] = j;
                    }
                }
            }
        }**/

        return returnArray;
    }
}
