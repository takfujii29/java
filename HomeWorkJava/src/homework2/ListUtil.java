package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ListUtil {

	public static void main(final String[] args) {

		// 偶数を返す
		List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
		List<Integer> evensList = ListUtil.evensof(intList);
		for (final Integer e : evensList) {
			System.out.println(e);
		}
		// 二つの整数のリスト
		List<String> hogeList = ListUtil.replicate(3, "hoge");
		System.out.println(hogeList);

		// 二つの整数のリストListを受け取り、それぞれのリストの対応する要素をペアPair
		var zips = ListUtil.zip(List.of(1, 2, 3), List.of(2, 3, 4));
		System.out.println(zips);

		// 与えられた数の約数
		List<Integer> divisor = ListUtil.factors(24);
		System.out.println(divisor);

		// 完全数に達するまでの約数
		List<Integer> perfects = ListUtil.perfects(500);
		System.out.println(perfects);

		// 整数Listの隣接する数字をペアにしたい
		List<Pair<Integer, Integer>> pairList = ListUtil.pairs(List.of(1, 2, 3, 4));
		System.out.println(pairList);

		//与えられた数値をsortする
		var sorted = ListUtil.sorted(List.of(1, 2, 3, 4));
		System.out.println(sorted);

		var position = ListUtil.positions(10, List.of(10, 15, 20, 10, 10, 33));
		System.out.println(position);

		var scalarProduct = ListUtil.scalarProduct(List.of(1,2,3), List.of(4,5,6));
		System.out.println(scalarProduct);

        var tetrads = ListUtil.zip4(List.of(1,2,3), List.of(10,20,30), List.of(100,200,300), List.of(1000,2000,3000));
        System.out.println(tetrads);
	}

	// 偶数を返す----------------------------------------------------------------------------------------
//	public static List<Integer> evensof(final List<Integer> intList) {
//		List<Integer> evensList = new ArrayList<>();
//		for (final Integer e : intList) {
//			if (e % 2 == 0) {
//				evensList.add(e);
//			}
//		}
//		return evensList;
//	}

	// 偶数を返す ラムダ式
	public static List<Integer> evensof(List<Integer> intList) {
		return intList.stream()
					   .filter(e -> e % 2 == 0)
					   .collect(Collectors.toList());
	}

	// 二つの整数のリスト------------------------------------------------------------------------------
//	public static List<String> replicate(int size, String hoge) {
//		List<String> hogeList = new ArrayList<>();
//		for (int i = 0; i < size; i++) {
//			hogeList.add(hoge);
//		}
//		return hogeList;
//	}

	// 二つの整数のリスト ラムダ式
	public static List<String> replicate(int size, String hoge) {
		return IntStream.range(0, size)
						.mapToObj(i -> hoge)
						.collect(Collectors.toList());
	}


	//二つの整数PairをListとして返す---------------------------------------------------------------------
//	private static List<Pair<Integer, Integer>> zip( List<Integer> list1,  List<Integer> list2) {
//		List<Pair<Integer, Integer>> zips = new ArrayList<>();
//		int size = Math.min(list1.size(), list2.size());
//
//		for (int i = 0; i < size; i++) {
//			zips.add(new Pair<>(list1.get(i), list2.get(i)));
//		}
//		return zips;
//	}

	//二つの整数PairをListとして返す ラムダ式
	public static List<Pair<Integer, Integer>> zip( List<Integer> list1, List<Integer> list2) {
		int size = Math.min(list1.size(), list2.size());
		return IntStream.range(0, size)
						 .mapToObj(i -> new Pair<>(list1.get(i), list2.get(i)))
						 .collect(Collectors.toList());
	}


	// 与えられた数の約数---------------------------------------------------------------------------------
//	public static List<Integer> factors(int num) {
//		List<Integer> divisorList = new ArrayList<>();
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				divisorList.add(i);
//			}
//		}
//		return divisorList;
//	}

	// 与えられた数の約数 ラムダ式
	public static List<Integer> factors(int num) {
		return IntStream.range(1, num + 1)
						 .filter(e -> num % e == 0)
						 .boxed()
						 .collect(Collectors.toList());
	}


	// 完全数に達するまでの約数-----------------------------------------------------------------------------------
	public static List<Integer> perfects(int numMax) {
		List<Integer> perfectsList = new ArrayList<>();
		for (int i = 1; i < numMax; i++) {
			int sum = 0;
			List<Integer> divisorList = ListUtil.factors(i);
			for (int divisor : divisorList) {
				  sum += divisor;
			  }
			  if(sum - i == i) {
				  perfectsList.add(i);
			  }
		}
		return perfectsList;
	}

	// 完全数に達するまでの約数 ラムダ式----------------------------------------------------------------------------------
//    private static int total(List<Integer> intList, int exclusive) {
//        return intList.stream()
//                      .filter(i -> i != exclusive)
//                      .mapToInt(Integer::valueOf)
//                      .sum();
//    }
//
//    public static List<Integer> perfects(int n) {
//        return IntStream.range(1, n + 1)
//                        .mapToObj(i -> new Pair<Integer, List<Integer>>(i, factors(i)))
//                        .filter(p -> total(p.second(), p.first()) == p.first())
//                        .map(Pair::first)
//                        .collect(Collectors.toList());
//    }

	//ペアのリストを返す--------------------------------------------------------------------------------------------------
//	public static List<Pair<Integer, Integer>> pairs(List<Integer> list) {
//		List<Pair<Integer, Integer>> pairList = new ArrayList<>();
//		for (int i = 0; i < list.size() - 1; i++) {
//			pairList.add(new Pair<>(list.get(i), list.get(i + 1)));
//		}
//		return pairList;
//	}

	//ペアのリストを返す ラムダ式-------------------------------------------------------------------------------------------------
	public static List<Pair<Integer, Integer>> pairs(List<Integer> list) {
		return IntStream.range(0, list.size() - 1)
									.mapToObj(i -> new Pair<>(list.get(i), list.get(i + 1)))
									.collect(Collectors.toList());
	}


	//ソートになっているかを調べる-----------------------------------------------------------------------------------
//	public static boolean sorted(List<Integer> intList) {
//		var pairs = pairs(intList);
//		for ( var pair : pairs) {
//			if (pair.first() > pair.second()) {
//				return false;
//			}
//		}
//		return true;
//	}

	//ソートになっているかを調べる ラムダ式----------------------------------------------------------------------------------
	public static boolean sorted(List<Integer> intList) {
		return pairs(intList).stream()
										  .noneMatch(p -> p.first() > p.second());
	}

//	第一引数の数値をリストの中から探し該当するインデックスを返す ------------------------------------------------------------------------
//	public static List<Integer> positions(int target, List<Integer> intList) {
//		List<Integer> indexes = new ArrayList<>();
//		for (int i = 0; i < intList.size(); i++) {
//			indexes.add(i);
//		}
//
//		var positions = new ArrayList<Integer>();
//		var pairs = zip(indexes, intList);
//		for (var pair : pairs) {
//			if (pair.second() == target) {
//				positions.add(pair.first());
//			}
//		}
//		return positions;
//	}

//	第一引数の数値をリストの中から探し該当するインデックスを返す  ラムダ式-----------------------------------------------------------------------
	public static List<Integer> positions(int target, List<Integer> intList) {
		List<Integer> indexes = IntStream.range(0, intList.size() )
																	.boxed()
																	.collect(Collectors.toList());

		return zip(indexes, intList).stream()
				.filter(p -> p.second() == target)
				.map(Pair::first)
				.collect(Collectors.toList());
	}


//２つのベクトル（リスト）の内積は対応する各要素の積の和で表せる-----------------------------------------------------------------------------
//	public static int scalarProduct(List<Integer> firsts, List<Integer> seconds) {
//		int total = 0;
//		for (int i = 0; i < firsts.size(); i++) {
//			total += firsts.get(i) * seconds.get(i);
//		}
//		return total;
//	}

	//２つのベクトル（リスト）の内積は対応する各要素の積の和で表せる ラムダ式-----------------------------------------------------------------------------
	public static int scalarProduct(List<Integer> firsts, List<Integer> seconds) {
		return zip(firsts, seconds).stream()
													.mapToInt(p -> p.first() * p.second())
													.sum();
 	}

	public static List<Pair<Integer, Pair<Integer, Pair<Integer, Integer>>>> zip4(List<Integer> list1, List<Integer> list2, List<Integer> list3, List<Integer> list4) {
		var min = Math.min(Math.min(list1.size(), list2.size()), Math.min(list3.size(), list4.size()));
		List<Pair<Integer, Pair<Integer, Pair<Integer, Integer>>>> result = new ArrayList<>();

		for (int i = 0; i < min; i++) {
			result.add(tetrad(list1.get(i), list2.get(i), list3.get(i), list4.get(i)));
		}
		return result;
	}

	private static Pair<Integer, Pair<Integer, Pair<Integer, Integer>>> tetrad(Integer a, Integer b, Integer c, Integer d) {
		return new Pair<>(1, new Pair<>(b, new Pair<>(c, d)));
	}
}
