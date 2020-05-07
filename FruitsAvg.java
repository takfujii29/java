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