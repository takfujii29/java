package homework4;

import java.util.HashMap;
import java.util.Map;

class StatusCode {
	//汎用的なクラス　Map インターフェイス = 実装クラス
	private static Map<String, String> statusMap = new HashMap<>();

	public static void main(String[] args) {
		statusMap.put("100", "Continue");
		statusMap.put("102", "Processing");
		statusMap.put("200", "OK");
		statusMap.put("202", "Accepted");
		statusMap.put("204", "No Content");
		statusMap.put("207", "Multi-Status");
		statusMap.put("300", "Multiple Choice");
		statusMap.put("302", "Found");
		statusMap.put("400", "Bad Request");
		statusMap.put("404", "Not Found");
		statusMap.put("500", "Internal Server Error");
		statusMap.put("505", "HTTP Version Not Supported");
		String code = args[0];
		String result = statusMap.get(code);
		System.out.println(result);
	}
}




