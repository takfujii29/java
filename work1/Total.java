public class Total {
  public static void main(String[] args) {
    int total = 0;
    for(String arg : args) {
      total = total + Integer.parseInt(arg);
    }
    System.out.println(total);
  }
}

// public class Total
// {

//   public static void main(String[] args) {
//     int result = total(args);
//     System.out.println(result);
//   }

//   public static int total(String[] nums) {
//     int result = 0;
//     for (String num : nums) {
//       result += Integer.parseInt(num);
//     }
//     return result;
//   }
// }