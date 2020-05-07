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