package feb26;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int points=0;
        System.out.println("You have 100 chances to win 100 millions \n Keep entering numbers till you win or use up 100 times");
        for(int i = 1; i <= 100; i++) {
            int x = sc.nextInt();
            if (x % 7 == 0) {
                System.out.println("You got 7 points");
                points = points + 7;
                continue;
            } else if (x % 5 == 0) {
                System.out.println("You got 5 points");
                points = points + 5;
                continue;
            } else if (x == 6)
            {
                System.out.println("you won 100m");
                break;
            }
        }
                System.out.println("Your total points" +points);
            }
        }









// Lottery System
// User input= use scanner
// Enter the number= 4,7
// 1. Whenever you encounter a multiple of 7: you got 7 points
// 2. Whenever you encounter multiple of 5: you got 5 points
// If you enter 6: You won 100 m lottery and exit.
