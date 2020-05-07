public class Concat {
  public static void main(String[] args) {
    String concat = "";
    for(String arg : args) {
      concat = concat + arg;
    }
    System.out.println(concat);
  }
}