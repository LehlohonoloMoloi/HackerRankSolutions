public class Solution {
    public static void main(String[] args)
    {
        String num1 = "III";
        String num2 = "LVIII";
        String num3 = "MCMXCIV";

        System.out.println("Input: " + num1 + "\nOutput: " + romanToInt(num1));
        System.out.println("\nInput: " + num2 + "\nOutput: " + romanToInt(num2));
        System.out.println("\nInput: " + num3 + "\nOutput: " + romanToInt(num3));
    }

    public static int romanToInt(String s)
    {
        String[] romans = s.split("");
        int result = 0;

        for(int i = romans.length - 1; i >= 0; i--)
        {
            if(romans[i].equals("I"))
            {
                result += 1;
            }
            else if(romans[i].equals("V"))
            {
                if(i > 0 && romans[i - 1].equals("I"))
                {
                    result += 4;
                    i--;
                }
                else
                {
                    result += 5;
                }
            }
            else if(romans[i].equals("X"))
            {
                if(i > 0 && romans[i - 1].equals("I"))
                {
                    result += 9;
                    i--;
                }
                else
                {
                    result += 10;
                }
            }
            else if(romans[i].equals("L"))
            {
                if(i > 0 && romans[i - 1].equals("X"))
                {
                    result += 40;
                    i--;
                }
                else
                {
                    result += 50;
                }
            }
            else if(romans[i].equals("C"))
            {
                if(i > 0 && romans[i - 1].equals("X"))
                {
                    result += 90;
                    i--;
                }
                else
                {
                    result += 100;
                }
            }
            else if(romans[i].equals("D"))
            {
                if(i > 0 && romans[i - 1].equals("C"))
                {
                    result += 400;
                    i--;
                }
                else
                {
                    result += 500;
                }
            }
            else if(romans[i].equals("M"))
            {
                if(i > 0 && romans[i - 1].equals("C"))
                {
                    result += 900;
                    i--;
                }
                else
                {
                    result += 1000;
                }
            }
        }

        return result;
    }

}
