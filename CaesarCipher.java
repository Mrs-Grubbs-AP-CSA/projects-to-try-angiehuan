import java.util.*;

public class CaesarCipher {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Encrypt the following message: ");
        String message = console.nextString();
        System.out.print("Shifting number: ");
        int number = console.nextInt();
        System.out.println("Encrypted message: " + shift(message, number));
    }

  public String shift(String msg, int num) {
        String result;
        String[] array = new String[msg.length()];
        int[] array2 = new int[msg.length()];
        for (int i = 0; i < msg.length(); i++) {
            array[i] = msg.substring(i, i+1);
        }
        for (int i = 0; i < msg.length(); i++) {
            int n = convert(array[i]);
            if (n == -1) {
              result += array[i];
            } else if ((n+num)%26 == 0) {
              array2[i] = 26;
              array[i] = convert2(array2[i]);
              result += array[i];
            } else {
              array2[i] = (n+num)%26;
              array[i] = convert2(array2[i]);
              result += array[i];
            }
        }
    return result;
  }

  public int convert(String l) {
    if (l == "") {
      return -1;
    } else if (l == "a") {
      return 1;
    } else if (l == "b") {
      return 2;
    } else if (l == "c") {
      return 3;
    } else if (l == "d") {
      return 4;
    } else if (l == "e") {
      return 5;
    } else if (l == "f") {
      return 6;
    } else if (l == "g") {
      return 7;
    } else if (l == "h") {
      return 8;
    } else if (l == "i") {
      return 9;
    } else if (l == "j") {
      return 10;
    } else if (l == "k") {
      return 11;
    } else if (l == "l") {
      return 12;
    } else if (l == "m") {
      return 13;
    } else if (l == "n") {
      return 14;
    } else if (l == "o") {
      return 15;
    } else if (l == "p") {
      return 16;
    } else if (l == "q") {
      return 17;
    } else if (l == "r") {
      return 18;
    } else if (l == "s") {
      return 19;
    } else if (l == "t") {
      return 20;
    } else if (l == "u") {
      return 21;
    } else if (l == "v") {
      return 22;
    } else if (l == "w") {
      return 23;
    } else if (l == "x") {
      return 24;
    } else if (l == "y") {
      return 25;
    } else (l == "z") {
      return 26;
    }
  }

  public String convert2(int n) {
    
  }
  
}
