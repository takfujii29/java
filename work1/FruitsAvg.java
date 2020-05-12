import java.io.*;
import java.util.*;

public class FruitsAvg {

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
      int argi = 0; 
      //列名を管理するための配列
      String[] arr = null;

      int total = 0;
      int apple = 0;
      int banana = 0;
      int orange = 0;
      int grape = 0;
      int peaches = 0;
      //1行ずつ読み込みを行う
      while((line = br.readLine()) != null) {
        
        //先頭行は列数
        if(i == 0 ) {

          //カンマで分割した内容を配列に格納する
          //arr = {"name","price"};
          arr = line.split(",");
        } else if(i == 1 && args[argi].equals("りんご")) {
          String[] data = line.split(",");
          apple = apple + Integer.parseInt(data[1]);
        }
        else if(i == 2 && args[argi].equals("バナナ")) {
          String[] data = line.split(",");
          banana = banana + Integer.parseInt(data[1]);
        }else if(i == 3 && args[argi].equals("みかん")) {
          String[] data = line.split(",");
          orange = orange + Integer.parseInt(data[1]);
        }else if(i == 4 && args[argi].equals("ぶどう")) {
          String[] data = line.split(",");
          grape = grape + Integer.parseInt(data[1]);
        }else if(i == 5 && args[argi].equals("もも")) {
          String[] data = line.split(",");
          peaches = peaches + Integer.parseInt(data[1]);
        }
        // }else {
        //   System.out.println("該当なし");
        //   // break;
        // }
        i++;
        if(argi < args.length - 1) {
          argi++;
        }
      }
      total = apple + banana + orange + grape + peaches;
      double average = (double) total/args.length;
      System.out.println(average);
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
// import java.util.Arrays;
// import java.util.OptionalDouble;

// public class FruitsAvg
// {
//     public static void main(String[] args) throws IOException {
//         Path filePath = Path.of(args[0]);
//         String[] names = Arrays.copyOfRange(args, 1, args.length);

//         double average1 = average1(filePath, names);
//         System.out.println(average1);

//         double average2 = average2(filePath, names);
//         System.out.println(average2);
//     }

//     public static double average1(Path filePath, String[] names) throws IOException {
//         try (BufferedReader br = Files.newBufferedReader(filePath)) {
//             Arrays.sort(names);
//             String line;
//             int total = 0;
//             int hitCount = 0;
//             while ((line = br.readLine()) != null) {
//                 Fruit f = new Fruit(line);
//                 if (Arrays.binarySearch(names, f.getName()) >= 0) {
//                     hitCount++;
//                     total += f.getPrice();
//                 }
//             }

//             if (hitCount > 0) {
//                 return (double) total / hitCount;
//             }

//             return 0;
//         }
//     }

//     public static double average2(Path filePath, String[] names) throws IOException {
//         try (BufferedReader br = Files.newBufferedReader(filePath)) {
//             Arrays.sort(names);
//             OptionalDouble average = br.lines()
//                                        .map(Fruit::new)
//                                        .filter(f -> Arrays.binarySearch(names, f.getName()) >= 0)
//                                        .mapToInt(Fruit::getPrice)
//                                        .average();

//             if (average.isPresent()) {
//                 return average.getAsDouble();
//             }
//             return 0;
//         }
//     }
// }