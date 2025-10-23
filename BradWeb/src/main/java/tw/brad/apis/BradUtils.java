package tw.brad.apis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONObject;

public class BradUtils {
	private static final String url = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		return DriverManager.getConnection(url, prop);
	}	
	
	public static String loadView() throws Exception{
		String source = "C:\\Users\\User\\git\\repository\\BradWeb\\src\\main\\webapp\\views\\view1.html";
		File html = new File(source);
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(html));
		byte[] data = bin.readAllBytes();
		bin.close();
		return new String(data);
	}
	
	public static String locaViewV2() throws Exception {
		String source = "C:\\Users\\User\\git\\repository\\BradWeb\\src\\main\\webapp\\views\\view1.html";
		Path path = Path.of(source);
		return Files.readString(path);
	}
	public static String locaViewV2(String view) throws Exception {
		String source = 
			String.format("C:\\Users\\User\\git\\repository\\BradWeb\\src\\main\\webapp\\views\\%s.html", view);
		Path path = Path.of(source);
		return Files.readString(path);
	}
	
	public static String calc(String x, String y, String op) {
		try {
			int intX = Integer.parseInt(x);
			int intY = Integer.parseInt(y);
			StringBuffer sb = new StringBuffer();
			switch (op) {
				case "1": sb.append(intX + intY); break;
				case "2": sb.append(intX - intY); break;
				case "3": sb.append(intX * intY); break;
				case "4": sb.append(intX / intY).append(" ... ").append(intX % intY); break;
			}
			return sb.toString();
		}catch(Exception e) {
			return "";
		}
	}
	public static String createScore() {
		return (int)(Math.random()*101) + "";
	}
	
	public static SortedMap[] parseFood(String json) {
		JSONArray root = new JSONArray(json);
		TreeMap<String, String>[] foods = new TreeMap[root.length()];
		
		try {
			for (int i=0; i<root.length(); i++) {
				JSONObject food = root.getJSONObject(i);
				
				TreeMap<String, String> map = new TreeMap<String, String>();
				map.put("name", food.getString("Name"));
				map.put("tel", food.getString("Tel"));
				map.put("addr", food.getString("City")+food.getString("Town")+food.getString("Address"));
				foods[i] = map;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return foods;
	}
	
	public static String order2JSON(SortedMap[] rows) {
		JSONObject root = new JSONObject();
		if (rows.length > 0) {
			root.put("employee", 
				String.format("%s %s", 
					rows[0].getOrDefault("FirstName", ""),
					rows[0].getOrDefault("LastName", "")));
			root.put("customer", 
					String.format("%s %s", 
						rows[0].getOrDefault("CompanyName", ""),
						rows[0].getOrDefault("ContactName", "")));
			
			double total = 0;
			JSONArray details = new JSONArray();
			for (SortedMap<String,String> row : rows) {
				JSONObject obj = new JSONObject();
				details.put(obj);
				
				obj.put("pid", row.getOrDefault("ProductID", ""));
				obj.put("pname", row.getOrDefault("ProductName", ""));
				obj.put("price", row.getOrDefault("UnitPrice", ""));
				obj.put("qty", row.getOrDefault("Quantity", ""));
				
				
				double price = Double.parseDouble(obj.get("price").toString());
				int qty = Integer.parseInt(obj.get("qty").toString());
				double sum = price*qty;
				obj.put("sum", sum);
				
				total += sum;
			}
			
			root.put("details", details);
			root.put("total", total);
			
			
		}
		return root.toString();
	}
	
	
	
}
