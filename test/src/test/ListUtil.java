package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListUtil {

	public static void main(String[] args) {

	List<Integer> intList = List.of(1,2,3,4,5,6);
	System.out.println(ListUtil.evenof(intList));

	List<String> hogeList = ListUtil.replicate(3, "hoge");
	System.out.println(hogeList);

	var zipList = ListUtil.zip(List.of(1,2,3), List.of(2,3,4));
	System.out.println(zipList);

	List<Integer> factorsList = ListUtil.factors(15);
	System.out.println(factorsList);

	List<Integer> perfectsList = ListUtil.perfects(500);
	System.out.println(perfectsList);

	List<Pair<Integer, Integer>> pairs = ListUtil.pairs(List.of(1,2,3,4));
	System.out.println(pairs);
	}


	public static List<Integer> evenof(List<Integer> intList){
//		List<Integer> evenList = new ArrayList<>();
//		for(Integer n : intList) {
//			if(n % 2 == 0) {
//				evenList.add(n);
//			}
//		}
//		return evenList;
		return intList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
	}

	public static List<String> replicate(int num, String hoge) {
//		List<String> hogeList = new ArrayList<>();
//		for(int i = 0; i < num; i++) {
//			hogeList.add(hoge);
//		}
//		return hogeList;
		return IntStream.range(0,num).mapToObj(e -> hoge).collect(Collectors.toList());
	}

	public static List<Pair<Integer, Integer>> zip(List<Integer> list1, List<Integer> list2) {
//		int min = Math.min(list1.size(), list2.size());
//		List<Pair<Integer, Integer>> pairList = new ArrayList<>();
//		for(int i = 0; i < min; i++) {
//			pairList.add(new Pair<>(list1.get(i),list2.get(i)));
//		}
//		return pairList;
		int min = Math.min(list1.size(), list2.size());
		return IntStream.range(0, min).mapToObj(i -> new Pair<>(list1.get(i),list2.get(i))).collect(Collectors.toList());
	}

	private static List<Integer> factors(int num) {
//		List<Integer> factorsList = new ArrayList<>();
//		for(int i = 1; i <= num; i++) {
//			if(num % i == 0) {
//				factorsList.add(i);
//			}
//		}
//		return factorsList;
		return IntStream.range(1, num + 1).filter(e -> num % e == 0).boxed().collect(Collectors.toList());
	}

	private static List<Integer> perfects(int num) {
//		List<Integer> perfectsList = new ArrayList<>();
//		for(int i = 1; i < num; i++) {
//			int sum = 0;
//			List<Integer> factorsList = ListUtil.factors(i);
//			for(int factor : factorsList) {
//				sum += factor;
//			}
//			if(sum - i == i) {
//				perfectsList.add(i);
//			}
//		}
//		return perfectsList;
		return IntStream.range(1, num + 1).mapToObj()
	}

	private static List<Pair<Integer, Integer>> pairs(List<Integer> list) {
		List<Pair<Integer,Integer>> pairs = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			pairs.add(new Pair<>(list.get(i),list.get(i + 1)));
		}
		return pairs;
	}

}
