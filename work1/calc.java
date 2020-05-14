interface Calculator {

	public int calc(int x, int y);

	public static Calculator create(String op) {
		switch (op) {
		case "+" : return new Sum();
		case "-" : return new Minus();
		case "m" : return new Multiply();
		case "/" : return new Division();
		default :
			throw new IllegalArgumentException("invalid op");
		}
	}
}

class Sum implements Calculator {
	@Override
	public int calc(int x, int y) {
		return x + y;
	}
}

class Minus implements Calculator {
	@Override
	public int calc(int x, int y) {
		return x - y;
	}
}

class Multiply implements Calculator {
	@Override
	public int calc(int x, int y) {
		return x * y;
	}
}

class Division implements Calculator {
	@Override
	public int calc(int x, int y) {
		return x / y;
	}
}

public class calc {
	public static void main(String[] args) {
		 Calculator calculator = Calculator.create(args[0]);

		 int result = calculator.calc(Integer.parseInt(args[1]), Integer.parseInt(args[2]));

		 System.out.println(result);
	}
}

//public class Calc
//{
//
//  public static void main(String[] args) {
//    String op = args[0];
//    int num1 = Integer.parseInt(args[0]);
//    int num2 = Integer.parseInt(args[1]);
//
//    System.out.println(calc(op, num1, num2));
//  }
//
//  public static int calc(String op, int num1, int num2) {
//    switch (op) {
//      case "+":
//        return num1 + num2;
//      case "-":
//        return num1 - num2;
//      case "m":
//        return num1 * num2;
//      case "/":
//        if (num2 == 0) {
//          throw new IllegalArgumentException("divided by zero");
//        }
//        return num1 / num2;
//      default:
//        throw new UnsupportedOperationException("invalid op");
//    }
//  }
//}
