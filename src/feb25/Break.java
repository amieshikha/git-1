package feb25;

public class Break {
    public static void main(String[] args)
    {
        for( int i =1; i <= 10; i++)
        {
            if(i % 5== 0) {
                break;
            }
            System.out.println(i);
        }
    }
}

// break: breaks the loop
