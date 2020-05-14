package jp.co.aivick.homework3;

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

  
// public class Pair<F, S>
// {
//     final private F first;
//     final private S second;

//     public Pair(F first, S second) {
//         this.first = first;
//         this.second = second;
//     }

//     public F first() {
//         return this.first;
//     }

//     public S second() {
//         return this.second;
//     }

//     @Override
//     public String toString() {
//         return String.format("<%s,%s>", first, second);
//     }
// }