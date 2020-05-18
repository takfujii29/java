package aivick;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

	public static void main(final String[] args) {

		// 偶数を返す
		final List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
		final List<Integer> evensList = ListUtil.evensof(intList);
		for (final Integer e : evensList) {
			System.out.println(e);
		}
		// 二つの整数のリスト
		final List<String> hogeList = ListUtil.replicate(3, "hoge");
		System.out.println(hogeList);

//		// 二つの整数のリストListを受け取り、それぞれのリストの対応する要素をペアPair
//		final var zips = ListUtil.zip(List.of(1, 2, 3), List.of(2, 3, 4));
//		System.out.println(zips);

		// 与えられた数の約数
		final List<Integer> divisor = ListUtil.factors(24);
		System.out.println(divisor);

		// 完全数に達するまでの約数
		final List<Integer> perfects = ListUtil.perfects(500);
		System.out.println(perfects);

		// 整数Listの隣接する数字をペアにしたい
//		final List<Integer> pairList = ListUtil.pairs(List.of(1, 2, 3, 4));
//		System.out.println(pairList);

	}

	// 偶数を返す
	public static List<Integer> evensof(final List<Integer> intList) {
		final List<Integer> evensList = new ArrayList<>();
		for (final Integer e : intList) {
			if (e % 2 == 0) {
				evensList.add(e);
			}
		}
		return evensList;
	}

	// 二つの整数のリスト
	public static List<String> replicate(final int num, final String hoge) {
		final List<String> hogeList = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			hogeList.add(hoge);
		}
		return hogeList;
	}

//	private static List<Pair> zip(final List<Integer> list1, final List<Integer> list2) {
//		final List<Pair> zips = new ArrayList<>();
//		final int size = Math.min(list1.size(), list2.size());
//
//		for (int i = 0; i < size; i++) {
//			final Pair pair = new Pair(list1.get(i), list2.get(i));
//			zips.add(pair);
//		}
//
//		return zips;
//	}

	// 与えられた数の約数
	private static List<Integer> factors(final int num) {
		final List<Integer> divisorList = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisorList.add(i);
			}
		}
		return divisorList;
	}

	// 完全数に達するまでの約数
	private static List<Integer> perfects(final int numMax) {
		final List<Integer> perfectsList = new ArrayList<>();
		for (int i = 1; i < numMax; i++) {
			int sum = 0;
			final List<Integer> divisorList = ListUtil.factors(i);
			for (final int divisor : divisorList) {
				  sum += divisor;
			  }
			  if(sum - i == i) {
				  perfectsList.add(i);
			  }
		  }
		  return perfectsList;

		}
	}