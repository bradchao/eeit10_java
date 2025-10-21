package tw.brad.apis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

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
	
}
