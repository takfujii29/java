package homework4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacter {
	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\fujii\\Documents\\eclipse\\java\\HomeWorkJava\\src\\homework4\\sample.txt");
//			File file = new File(args[0]);
			if (checkBeforeReadfile(file)){
				//一文字ずつとってint型で返す -> string型に変更すべき？
				FileReader filereader = new FileReader(file);
				BufferedReader br = new BufferedReader(filereader);

		        List<String> characters = List.of("a", "b", "z", "あ");
		        Map<String, Integer> result = search(br, characters);
		        System.out.println(result);

				br.close();
			}else {
				System.out.println("ファイルが見つからないか開けません");
			}
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
//×新しい行に一致するものがあると更新される× forが二つあるので直さないといけない
	  private static Map<String, Integer> search(BufferedReader br, List<String> characters) throws IOException {
			String str;
			Map<String, Integer> map = new HashMap<>();
			while((str = br.readLine()) != null) {
				for (String c : characters) {
					List<String> charList = new ArrayList<>();
					String[] words = str.split("");
					for(String word : words) {
						if (word.equals(c)) {
							charList.add(c);
							map.put(c, charList.size());
						}
					}
				}
			}
			return map;
	}

	private static boolean checkBeforeReadfile(File file){
			if (file.exists()){
				if (file.isFile() && file.canRead()){
					return true;
				}
			}
			return false;
		}
}