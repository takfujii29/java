import java.util.HashMap;

public class Map {
  public static void main(String[] args) {
    Map<Integer, String> indexes = new HashMap<>();

    indexse.put(1, "java");
    indexes.put(2. "PHP");
    indexes.put(3, "Ruby");

    String java = indexes.get(1);
    String php = indexes.get(2);

    System.out.println(java);
    System.out.println(php);

    Map<String, Integer> ranking = new HashMap<>();

    ranking.put("Java", 1);
    ranking.put("PHP", 2);
    ranking.put("Puby", 3);

    for(String key: ranking.keySet()) {
      System.out.println("key:" + key + " value:" + ranking.get(key));
    }

    for(Map.Entry<String, Integer> entry: ranking.enterSet()) {
      System.out.println("key: " + entry.getKey() + " value:" + entry.getValue())
    }
  }

}