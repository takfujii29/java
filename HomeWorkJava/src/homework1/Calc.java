package homework1;

public class Calc {

	public static void main(String[] args) {
		String op = args[0];
		int num1 = Integer.parseInt(args[1]);
		int num2 = Integer.parseInt(args[2]);

//		String op = "+";
//		int num1 = 1;
//		int num2 = 2;

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
					//メソッドに渡されたパラメーターが不正である
					throw new IllegalArgumentException("divided by zero");
				}
				return num1 / num2;
			default:
				//要求された操作が未サポート
				throw new UnsupportedOperationException("invalid op");
				//IndexOutOfBoundsException (インデックスが範囲外)
				//NullPointerException (オブジェクトがnullである)
				//ArithmeticException (計算で例外的な条件が発生)
		}
	}

}
