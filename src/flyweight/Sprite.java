package flyweight;

import brett.Brett;
import brett.Position;
import figuren.Figur;
import figuren.Figur.Farbe;
import java.net.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite extends SpriteFlyweight{
	protected URL path;
	protected Graphics graphics;
	
	public Sprite(URL path) {
		this.path = path;
	}
	
	@Override
	public void drawImage(Position position, int feldSize, Graphics graphics) {
		// TODO Auto-generated method stub
		
		try {
			// JPG / PNG
			BufferedImage path = ImageIO.read(this.path);
			graphics.drawImage(path, (position.getX() - 1) * feldSize, (position.getY() - 1) * feldSize, feldSize, feldSize, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
