import java.io.*;
import java.util.*;

public class Fruits {
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

      //1行ずつ読み込みを行う
      while((line = br.readLine()) != null) {
        
        //先頭行は列数
        if(i == 0 ) {

          //カンマで分割した内容を配列に格納する
          //arr = {"name","price"};
          arr = line.split(",");
        } else if(i == 1 && args[0].equals("りんご")) {
          String[] data = line.split(",");
          System.out.println(data[1]);
          break;
        }
        else if(i == 2 && args[0].equals("バナナ")) {
          String[] data = line.split(",");
          System.out.println(data[1]);
          break;
        }else if(i == 3 && args[0].equals("みかん")) {
          String[] data = line.split(",");
          System.out.println(data[1]);
          break;
        }else if(i == 4 && args[0].equals("ぶどう")) {
          String[] data = line.split(",");
          System.out.println(data[1]);
          break;
        }else if(i == 5 && args[0].equals("もも")) {
          String[] data = line.split(",");
          System.out.println(data[1]);
          break;
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
// import java.util.Optional;

// public class Fruits
// {

//   public static void main(String[] args) throws IOException {
//     Path filePath = Path.of(args[0]);
//     String name = args[1];

//     Fruit fruit1 = search1(filePath, name);
//     if (fruit1 != null) {
//       System.out.println(fruit1.getPrice());
//     }

//     Optional<Fruit> fruit2 = search2(filePath, name);
//     fruit2.ifPresent(f -> System.out.println(f.getPrice()));
//   }

//   public static Fruit search1(Path filePath, String name) throws IOException {
//     try (BufferedReader br = Files.newBufferedReader(filePath)) {
//       String line;
//       while ((line = br.readLine()) != null) {
//         Fruit f = new Fruit(line);
//         if (f.getName()
//              .equals(name)) {
//           return f;
//         }
//       }
//       return null;
//     }
//   }

//   public static Optional<Fruit> search2(Path filePath, String name) throws IOException {
//     try (BufferedReader br = Files.newBufferedReader(filePath)) {
//       return br.lines()
//                .map(Fruit::new)
//                .filter(f -> f.getName()
//                              .equals(name)
//                )
//                .findFirst();
//     }
//   }
// }


// class Fruit
// {
//     private String name;
//     private int price;

//     public Fruit(String line) {
//         String[] elems = line.split(",");
//         this.name = elems[0];
//         this.price = Integer.parseInt(elems[1]);
//     }

//     public String getName() {
//         return name;
//     }

//     public int getPrice() {
//         return price;
//     }
// }