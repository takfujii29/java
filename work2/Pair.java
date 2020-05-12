public class Pair {
  
  public int first;
  public int second;

  Pair(int first, int second) {
    this.first = first;
    this.second = second;
  }
  public static void main(String[] args) {
    Pair p = new Pair(1, 2);
    int first = p.first();
    int second = p.second();
    System.out.println(first);
    System.out.println(second);

  }
  public int first() {
    return this.first;
  }

  public int second() {
    return this.second;
  }
}