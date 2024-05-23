public class FibonacciSequence {

    // precondition: num > 0
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
