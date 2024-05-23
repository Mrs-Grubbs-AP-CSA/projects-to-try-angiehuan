public class CollatzConjecture {
    public static int numSteps;

    public CollatzConjecture() {
      numSteps = 0;
    }

    public int findNumSteps(int num) {
        if (num == 0) {
          return numSteps;
        } else if (num % 2 == 0) {         
          numSteps++;
          int newNum = n/2;
          findNumSteps(newNum);
        } else {
          numSteps++;
          int newNum = 3n+1;
          findNumSteps(newNum);
        }
      return numSteps;
    }
  
}
