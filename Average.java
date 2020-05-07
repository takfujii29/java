public class Average {
  public static void main(String[] args) {
    int total = 0;
    for(String arg : args) {
      total = total + Integer.parseInt(arg);
    }
    double average = (double) total/args.length;
    System.out.println(average);
  }
}