import java.util.Arrays;

public class Sort {
  public static void main(String[] args) {
    int[] array = new int[args.length];
    for(int i = 0; i < args.length; i++) {
      array[i] = Integer.parseInt(args[i]);
    }
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
  }
}

