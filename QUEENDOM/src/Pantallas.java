import processing.core.PApplet;
import processing.core.PImage;

public class Pantallas {

	int x, y;

	private PImage PRINCIPAL, PERSONALIZACIÓN;

	public Pantallas(PApplet app, int x, int y) {

		PRINCIPAL = app.loadImage("data/PRINCIPAL.png");
		PERSONALIZACIÓN = app.loadImage("data/PERSONALIZACIÓN.png");
		
		this.x = x;
		this.y = y;
	}

	public void PintarPrincipal(PApplet app) {
		
		app.image(PRINCIPAL, x, y);
		
	}
	
	public void PintarPersonalización(PApplet app) {
		app.image(PERSONALIZACIÓN, x, y);
	}
	
}
