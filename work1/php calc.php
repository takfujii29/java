<?php
  $symbol = $argv[1];
  $num1 = $argv[2];
  $num2 = $argv[3];

  switch($argv[1]) {
    case "+":
      echo $num1+$num2;
      break;
    case "-":
      echo $num1-$num2;
      break;
    case "*":
      echo $num1*$num2;
      break;
    case "/":
      echo $num1/$num2;
      break;
    default:
      echo 'エラー';
      break;
  }
?>

<!-- public class Calc
{

  public static void main(String[] args) {
    String op = args[0];
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    System.out.println(calc(op, num1, num2));
  }

  public static int calc(String op, int num1, int num2) {
    switch (op) {
      case "+":
        return num1 + num2;
      case "-":
        return num1 - num2;
      case "m":
        return num1 * num2;
      case "/":
        if (num2 == 0) {
          throw new IllegalArgumentException("divided by zero");
        }
        return num1 / num2;
      default:
        throw new UnsupportedOperationException("invalid op");
    }
  }
}
 -->
