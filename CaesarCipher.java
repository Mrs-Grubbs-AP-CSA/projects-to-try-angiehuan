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
        String[] array = new String[msg.length()];
        int[] array2 = new int[msg.length()];
        for (int i = 0; i < msg.length(); i++) {
            array[i] = msg.substring(i, i+1);
        }
        for (int i = 0; i < msg.length(); i++) {
            int n = convert(array[i]);
            array2[i] = n;
        }
  }

  public int convert(String letter) {
    
  }

  public String convert2(int number) {
    
  }
  
}
