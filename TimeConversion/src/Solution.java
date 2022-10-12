public class Solution {

    public static void main(String[] args){
        String time1 = "07:05:45PM";
        String time2 = "12:01:34AM";
        String time3 = "12:45:59PM";
        String time4 = "08:12:33AM";

        System.out.println(time1 + " -----------> " + timeConversion(time1));
        System.out.println(time2 + " -----------> " + timeConversion(time2));
        System.out.println(time3 + " -----------> " + timeConversion(time3));
        System.out.println(time4 + " -----------> " + timeConversion(time4));
    }

    public static String timeConversion(String s){
        int hour = Integer.parseInt(s.substring(0,2));
        String dayNight = s.substring(8);
        String result = "";

        if(dayNight.equalsIgnoreCase("AM"))
        {
            if(hour == 12)
            {
                result = "00" + s.substring(2,8);
            }
            else
            {
                result = s.substring(0,8);
            }
        }
        else
        {
            if(hour == 12)
            {
                result = s.substring(0,8);
            }
            else
            {
                int newHour = 12 + hour;
                result = newHour + s.substring(2,8);
            }
        }

        return result;


    }
}
