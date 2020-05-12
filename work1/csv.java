import java.io.*;
import java.util.*;

public class csv {
  
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

        } else {
          
          //データ内容をコンソールに表示する
          System.out.println("----------------------");

          //データ件数を表示
           System.out.println("データ" + i + "件目");

           //カンマで分割した内容を配列に格納する
           String[] data = line.split(",");

           //配列の中身を順位常時する。列数（＝列名を格納した配列の要素数）分繰り返す
           int colno = 0;
           for(String column : arr) {
             System.out.println(column + ":" + data[colno]);
             colno++;

           }
        }
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