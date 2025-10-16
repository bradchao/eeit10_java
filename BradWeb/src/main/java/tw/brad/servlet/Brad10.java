package tw.brad.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@WebServlet("/brad10")
public class Brad10 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source = "C:\\Users\\User\\git\\repository\\BradWeb\\src\\main\\webapp\\upload\\_secret.png";

		BufferedImage img = ImageIO.read(new File(source));
		Graphics2D g2d = img.createGraphics();
		
		
		Font font = new Font(null, Font.BOLD, 72);
		
		AffineTransform transform = new AffineTransform();
		transform.rotate(Math.toRadians(-30));
		Font font2 = font.deriveFont(transform);
		
		g2d.setFont(font2);
		g2d.setColor(Color.YELLOW);
		g2d.drawString("Hello, 全世界", 200, 800);
		
		response.setContentType("image/png");
		ImageIO.write(img, "PNG", response.getOutputStream());
		response.flushBuffer();		
		
		ImageIO.write(img, "PNG", new File("C:/Users/User/git/repository/BradWeb/src/main/webapp/upload/_secret2.png"));
		
	}

}
