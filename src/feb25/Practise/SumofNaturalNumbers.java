package feb25.Practise;

public class SumofNaturalNumbers {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            System.out.println(x);
            sum= sum + x;
            // sum +=x;
            x ++;
        }
        System.out.println("--------------------------------");
        System.out.println("Sum of 10 natural numbers " + sum);
    }
}