package tw.brad.apis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BradUtils {
	public static String loadView() throws Exception{
		String source = "C:\\Users\\User\\git\\repository\\BradWeb\\src\\main\\webapp\\views\\view1.html";
		File html = new File(source);
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(html));
		byte[] data = bin.readAllBytes();
		bin.close();
		return new String(data);
	}
}
