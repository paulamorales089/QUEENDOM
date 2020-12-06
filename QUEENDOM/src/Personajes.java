import processing.core.PApplet;
import processing.core.PImage;

public class Personajes {
	int x, y;

	private PImage Real, Sel1, Sel2, Sel3, Zombie;

	public Personajes(PApplet app, int x, int y) {

		Real = app.loadImage("data/Real.png");
		Sel1 = app.loadImage("data/Sel1.png");
		Sel2 = app.loadImage("data/Sel2.png");
		Sel3 = app.loadImage("data/Sel3.png");
		Zombie = app.loadImage("data/Zombie.png");
		
		
		this.x = x;
		this.y = y;
	}

	public void PintarPersonaje(PApplet app) {
		
		app.image(Real, 75, 118);
		
	}
	
	public void PintarSelec(PApplet app) {
		app.image(Sel1, 820, 88);
		app.image(Sel2, 820, 243);
		app.image(Sel3, 820, 399);
	}
	
	public void PintarZombie(PApplet app) {
		app.image(Zombie, x, y);
		
	}

}
