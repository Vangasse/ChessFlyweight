package flyweight;

import java.awt.Graphics;

import brett.Position;

public abstract class SpriteFlyweight {
	public abstract void drawImage(Position position, int feldSize, Graphics graphics);
}
