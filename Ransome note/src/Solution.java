public class Solution {

    public static void main(String[] args)
    {
        String randsomNote = "aaa";
        String magazine = "aab";

        String indeces = "";

        //a a
        //a a b

        for(int i = 0; i < randsomNote.length(); i++)
        {
            for(int j = 0; j < magazine.length(); j++)
            {
                if(randsomNote.charAt(i) == magazine.charAt(j))
                {
                    if(!indeces.contains(String.valueOf(j)))
                    {
                        indeces += j;
                        break;
                    }
                }
            }
        }

        if(randsomNote.length() == indeces.length())
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


    }

}
