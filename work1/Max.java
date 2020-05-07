public class Max {
  public static void main(String[] args) {
    int max = 0;

    for(String num : args) {
      if (Integer.parseInt(num) > max) {
        max = Integer.parseInt(num);
      }
    }
    System.out.println(max);
  }
}