package homework4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacter3 {
	public static void main(String[] args) {

		try {
			Path file = Paths.get("C:\\Users\\fujii\\Documents\\eclipse\\java\\HomeWorkJava\\src\\homework4\\sample.txt");
//			File file = new File(args[0]);

			String text = Files.readString(file);

			List<String> characters = List.of("a", "b", "z", "あ");
			Map<String, Integer> result = search(text, characters);
			System.out.println(result);

		} catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

	  private static Map<String, Integer> search(String text, List<String> characters) throws IOException {
			Map<String, Integer> map = new HashMap<>();
				for (String c : characters) {
					List<String> charList = new ArrayList<>();
					String[] words = text.split("");
					for(String word : words) {
						if (word.equals(c)) {
							charList.add(c);
							map.put(c, charList.size());
						}
					}
				}
			return map;
	}

}

