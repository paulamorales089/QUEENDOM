import processing.core.PApplet;
import processing.core.PImage;

public class Personajes {

	float xpos, ypos, xspeed;

	private PImage Patito;
	
	
	public Personajes(PApplet app, float tempXpos, float tempYpos, float tempXspeed) {
	
		Patito = app.loadImage("data/ZOMBIE.png");
		
		xpos = tempXpos;
		ypos = tempYpos;
		xspeed = tempXspeed;
		
	}
	public void PintarPato(PApplet app) {
		
		app.image(Patito, xpos , ypos , 90, 90);
		
	}
	
	public void mover () {
			
	float width = 1200;
			
		xpos += xspeed;
		
		if(xpos > width ){
			
			xpos = 0;
			
		}
			
		}
	
	public float setposX(int xpos) {
		
		return xpos;
		
	}
	
	public float setposY(int ypos) {
		
		return ypos;
		
	}
	
	
	public float getposX() {
		
		return xpos;
	
	}
	
	public float getposY() {
		
		return ypos;
		
	}
		
}
