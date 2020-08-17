package homework6;

import java.util.function.Function;

public class FunctionSample {

	public static void main(String[] args) {

		//文字列を受け取り、その長さを返すラムダ式。
		Function<String, Integer> length = e -> e.length();
		System.out.println(length.apply("あいうえお"));

		//文字列を受け取り、大文字のみの文字列を返すラムダ式
		Function<String, String> uppercase = e -> e.toUpperCase();
		System.out.println(uppercase.apply("abcde"));

		//数値をsけ取り、数値が偶数ならばtrue、それ以外ならばfalseを返すラムダ式。
		Function<Integer, Boolean> even = e -> e % 2 == 0;
		System.out.println(even.apply(6));

		//boolean値を受け取り、trueならば1、それ以外ならば0を返すラムダ式。
		Function<Boolean, Integer> true1 = e -> e ? 1 : 0;
		System.out.println(true1.apply(true));
		System.out.println(true1.apply(false));

		//3.と4.を合成したラムダ式。Function<T,R>インターフェースのデフォルトメソッドを利用すること。
		Function<Boolean, Boolean> true2 = even.compose(true1);
		Function<Boolean, Boolean> true3 = true1.andThen(even);
		System.out.println(true2.apply(false));
		System.out.println(true3.apply(false));


	}

}
