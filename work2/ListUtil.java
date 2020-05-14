import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtil {

	public static void main(String[] args) {

		  // 偶数を返す
	    List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
	    List<Integer> evensList = ListUtil.evensof(intList);
	    for (Integer e : evensList) {
	      System.out.println(e);
	    }
	    // 二つの整数のリスト
	    List<String> hogeList = ListUtil.replicate(3, "hoge");
	    System.out.println(hogeList);

	    // 二つの整数のリストListを受け取り、それぞれのリストの対応する要素をペアPair
	    var zips = ListUtil.zip(List.of(1, 2,3), List.of(2, 3, 4));
	    System.out.println(zips);

	    //与えられた数の約数
	    List<Integer> divisor = ListUtil.factors(24);
	    System.out.println(divisor);

	    //完全数に達するまでの約数
	    List<Integer> perfects = ListUtil.perfects(500);
	    System.out.println(perfects);
	    
//	    整数Listの隣接する数字をペアにしたい
	    List<Integer> pairList = ListUtil.pairs(List.of(1,2,3,4));
	    System.out.println(pairList);

	 }

	// 偶数を返す
	  public static List<Integer> evensof(List<Integer> intList) {
	    List<Integer> evensList = new ArrayList<>();
	    for (Integer e : intList) {
	      if (e % 2 == 0) {
	        evensList.add(e);
	      }
	    }
	    return evensList;
	  }

	  // 二つの整数のリスト
	  public static List<String> replicate(int num, String hoge) {
	    List<String> hogeList = new ArrayList<>();
	    for(int i = 0; i < num; i++) {
	      hogeList.add(hoge);
	    }
	    return hogeList;
	  }



	  private static List<Pair<Integer, Integer>> zip(List<Integer> list1, List<Integer> list2) {
		List<Pair> zips = new ArrayList<>();
		int size = Math.min(list1.size(), list2.size());

		for(int i = 0; i < size; i++) {
			Pair pair = new Pair(list1.get(i), list2.get(i));
			zips.add(pair);
		}

		return zips;
	  }
	  
	//与えられた数の約数
	  private static List<Integer> factors(int num) {
	  	  List<Integer> divisorList = new ArrayList<>();
		  for(int i = 1; i <= num; i++){
			  if(num % i == 0){
				  divisorList.add(i);
			  }
		  }
		  return divisorList;
	  }
	  
	  
	//完全数に達するまでの約数
	  private static List<Integer> perfects(int numMax) {
		  List<Integer> perfectsList = new ArrayList<>();
		  for(int i = 1; i < numMax; i++) {
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
	  
	  //リストをペアにする
	  private static List<Integer> pairs(List<Integer> numbers) {  
		  var pairsList = new ArrayList<>();
		  
		  return pairsList;  
	  }
