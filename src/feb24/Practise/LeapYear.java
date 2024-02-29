package feb24.Practise;

public class LeapYear {
    public static void main(String[] args)
    {
        int year=2024;
        if ( year % 4 == 0) {
            System.out.println(year + " is Leap Year");
        }
        else {
            System.out.println(year + " is not Leap Year");
        }

    }
}

