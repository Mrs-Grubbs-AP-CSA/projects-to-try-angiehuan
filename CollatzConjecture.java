import java.util.*;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Test Collatz's Conjecture by inputting a number: ");
        int n = console.nextInt();
        System.out.println("Steps: " + findNumSteps(n));
    }

    public int findNumSteps(int num) {
        if (num == 1) {
            return 0;
        } else if (num % 2 == 0) {         
            return 1 + findNumSteps(n/2);
        } else {
            return 1 + findNumSteps(3n+1);
        }
    }
  
}
