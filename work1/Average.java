public class Average {
  public static void main(String[] args) {
    int total = 0;
    for(String arg : args) {
      total = total + Integer.parseInt(arg);
    }
    double average = (double)total/args.length;
    System.out.println(average);
  }
}

// public class Average
// {

//   public static void main(String[] args) {
//     if (args.length == 0) {
//       return;
//     }

//     int total = Total.total(args);
//     int average = total / args.length;
//     System.out.println(average);
//   }

//   public static void varSample() {
//     var str = "aiueo";
//     var num = 123;
//     var error; //error

//     var upperStr = str.toUpperCase();
//   }
// }