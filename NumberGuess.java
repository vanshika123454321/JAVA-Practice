import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int count = 0;
        
        int target = r.nextInt(150);

        while(true){
            System.out.println("Guess the number from 1 to 150");
            int guess = sc.nextInt();
            count++;
            if(guess == target){
                System.out.println("Yay! you found the number");
                break;
            }
            else if (guess > target){
                System.out.println("Target is lower. Try again!");
            }
            else {
                System.out.println("Target is higher. Try again!");
            }
        }
        System.out.println("Total attempts taken:" + count);
    }
}
