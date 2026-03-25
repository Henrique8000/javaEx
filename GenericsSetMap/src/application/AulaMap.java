package application;

import java.util.Map;
import java.util.TreeMap;

public class AulaMap {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99125424");
		
		cookies.remove("email");
		
		cookies.put("phone", "993432342");
		
		System.out.println("Cookies contains 'phone' key: " + cookies.containsKey("phone") + "\n");
		
		System.out.println("Phone number: " + cookies.get("phone") + "\n");
		
		System.out.println("Email: " + cookies.get("email") + "\n");
		
		System.out.println("Size: " + cookies.size() + "\n");
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}

}
