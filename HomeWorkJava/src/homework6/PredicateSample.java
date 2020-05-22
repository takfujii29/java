package homework6;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {

//	//文字列を受け取り、その文字列が大文字のみならばtrueを返すラムダ式。
//	Predicate<String> str1 = s -> s.isupper();
//	System.out.println(str1.test("abcde"));
//	System.out.println(str1.test("ABCDE"));
//
//	//文字列を受け取り、其の文字列が小文字のみならばtrueを返すラムダ式。
//	Predicate<String> str2 = s -> s.islower();
//	System.out.println(str2.test("abcde"));
//	System.out.println(str2.test("ABCDE"));

	//数値を受け取り、その数値が3の倍数ならばtrueを返すラムダ式。
	Predicate<Integer> three = n -> n % 3 == 0;
	System.out.println(three.test(6));

	//数値を受け取り、その数値が5の倍数ならばtrueを返すラムダ式
	Predicate<Integer> five = n -> n % 5 == 0;
	System.out.println(five.test(6));

	//数値を受け取り、その数値が15の倍数ならばtrueを返すラムダ式。Predicate<T>のデフォルトメソッドを利用すること
	Predicate<Integer> fifteen = three.and(five);
	System.out.println(fifteen.test(15));
	}
}
