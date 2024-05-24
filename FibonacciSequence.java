import java.util.*;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("List the Fibonacci Sequence up to your desired number of terms: ");
        int n = console.nextInt();
        System.out.println("Fibonnaci Sequence up to the " + n + "th term: " + printSequence(n));
    }

    // precondition: num is a positive integer
    public String printSequence(int num) {
        if (num = 1) {
            return "1";
        } else if (num = 2) {
            return "1, 1";
        } else {
        String result = "1, 1, ";
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i < num - 2; i++) {
            if (i % 2 = 0) {
                num1 = num1 + num2;
                result = result + num1 + ", ";
            } else {
                num2 = num1 + num2;
                result = result + num2 + ", ";
            }
        }
        }
        return result;
    }

}
