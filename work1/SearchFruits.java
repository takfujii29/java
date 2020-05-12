import java.io.*;
import java.util.*;

public class SearchFruits {

  public static void main(String[] args) {
    
    FileInputStream fi = null;
    InputStreamReader is = null;
    BufferedReader br = null;

    try {
      //読み込みのファイルのインスタンス生成
      //ファイル名を指定
      fi = new FileInputStream("fruits.csv");
      is = new InputStreamReader(fi);
      br = new BufferedReader(is);

      //読み込み行
      String line;

      //読み込み行数の管理
      int i = 0;

      //列名を管理するための配列
      String[] arr = null;
      int num = Integer.parseInt(args[0]);
      //1行ずつ読み込みを行う
      while((line = br.readLine()) != null) {
        
        //先頭行は列数
        if(i == 0 ) {

          //カンマで分割した内容を配列に格納する
          //arr = {"name","price"};
          arr = line.split(",");
        } else {

           //カンマで分割した内容を配列に格納する
           String[] data = line.split(",");
           int price = Integer.parseInt(data[1]);
           if(price >= num) {
             System.out.println(data[0]);
           }

        }
        // }else {
        //   System.out.println("該当なし");
        //   // break;
        // }
        i++;
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.OptionalDouble;
// import java.util.stream.Collectors;

// public class SearchFruits
// {

//     public static void main(String[] args) throws IOException {
//         Path filePath = Path.of(args[0]);
//         int price = Integer.parseInt(args[1]);

//         List<Fruit> fruits1 = search1(filePath, price);
//         System.out.println(fruits1.stream()
//                                   .map(Fruit::getName)
//                                   .collect(Collectors.joining(" ")));

//         List<Fruit> fruits2 = search2(filePath, price);
//         System.out.println(fruits2.stream()
//                                   .map(Fruit::getName)
//                                   .collect(Collectors.joining(" ")));
//     }

//     public static List<Fruit> search1(Path filePath, int price) throws IOException {
//         try (BufferedReader br = Files.newBufferedReader(filePath)) {
//             String line;
//             List<Fruit> fruits = new ArrayList<>();
//             while ((line = br.readLine()) != null) {
//                 Fruit fruit = new Fruit(line);
//                 if (fruit.getPrice() > price) {
//                     fruits.add(fruit);
//                 }
//             }
//             return fruits;
//         }
//     }

//     public static List<Fruit> search2(Path filePath, int price) throws IOException {
//         try (BufferedReader br = Files.newBufferedReader(filePath)) {
//             return br.lines()
//                      .map(Fruit::new)
//                      .filter(f -> f.getPrice() > price)
//                      .collect(Collectors.toList());
//         }
//     }
// }