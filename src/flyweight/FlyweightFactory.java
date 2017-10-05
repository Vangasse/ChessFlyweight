package flyweight;

import java.util.ArrayList;
import java.awt.Graphics;

public class FlyweightFactory {
	protected ArrayList<SpriteFlyweight> flyweights;
	
	public enum Sprites{
		WEISS_BAUER, WEISS_DAME, WEISS_KOENIG, WEISS_LAEUFER, WEISS_SPRINGER, WEISS_TURM,
		SCHWARZ_BAUER, SCHWARZ_DAME, SCHWARZ_KOENIG, SCHWARZ_LAEUFER, SCHWARZ_SPRINGER, SCHWARZ_TURM,
	}
	
	public FlyweightFactory() {
		flyweights = new ArrayList<SpriteFlyweight>();
		flyweights.add(new Sprite(getClass().getResource("/img/Bauer_weiss.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Dame_weiss.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Koenig_weiss.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Laeufer_weiss.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Springer_weiss.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Turm_weiss.png")));

		flyweights.add(new Sprite(getClass().getResource("/img/Bauer_schwarz.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Dame_schwarz.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Koenig_schwarz.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Laeufer_schwarz.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Springer_schwarz.png")));
		flyweights.add(new Sprite(getClass().getResource("/img/Turm_schwarz.png")));
	}
	
	public SpriteFlyweight getFlyweight(Sprites figur) {
		switch(figur) {
		case WEISS_BAUER:
			return flyweights.get(0);
		case WEISS_DAME:
			return flyweights.get(1);
		case WEISS_KOENIG:
			return flyweights.get(2);
		case WEISS_LAEUFER:
			return flyweights.get(3);
		case WEISS_SPRINGER:
			return flyweights.get(4);
		case WEISS_TURM:
			return flyweights.get(5);
		case SCHWARZ_BAUER:
			return flyweights.get(6);
		case SCHWARZ_DAME:
			return flyweights.get(7);
		case SCHWARZ_KOENIG:
			return flyweights.get(8);
		case SCHWARZ_LAEUFER:
			return flyweights.get(9);
		case SCHWARZ_SPRINGER:
			return flyweights.get(10);
		case SCHWARZ_TURM:
			return flyweights.get(11);
		default: return null;
		}
	}
}
