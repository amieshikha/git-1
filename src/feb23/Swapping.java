package feb23;

public class Swapping {
    public static void main(String[] args){
        int x = 20;
        int y = 10;
        System.out.println("Values of x and y");
        System.out.println("x : " +x);
        System.out.println("y : " +y);
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping the numbers are");
        System.out.println(x + " " + y);
    }
}
