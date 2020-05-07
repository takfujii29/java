import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListUtil {

  public static void main(String[] args) {
    var intList = List.of(1, 2, 3, 4, 5, 6);

    List<Integer> evensList = ListUtil.evensof(intList);

    for (Integer e : evensList) {
      System.out.println(e);
    }
  }

  public static List<Integer> evensof(List<Integer> intList) {
    List<Integer> evensList = new ArrayList<>();
    for (Integer e : intList) {
      if (e % 2 == 0) {
        evensList.add(e);
      }
    }
    return evensList; 
  }
}

//   public static List<Integer> evensList
//     return intList.stream()
//                   .filter
// }