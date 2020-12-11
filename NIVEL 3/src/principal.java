import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class principal extends PApplet{

	public static void main(String[] args) {
		PApplet.main("principal");
	}
	
	@Override
	public void settings() {
		size (1200,700);
		
	}
	//PATITOS
	
	//variables extras
	
	int velocidad = 3;
	PImage image2;
	ArrayList<Personajes> personajes;
	
	Personajes elementos;
	
	//int color;
	//boolean show;
	
	@Override
	public void setup() {
		
		//fondo	
		
		image2 = loadImage("nivel3.png");
		
		personajes = new ArrayList<Personajes>();
		
		for (int i = 0; i <13; i++) { //Number of times that the colored balls must be created and the making of the balls.
			int tempXpos = (int) random (1200);
			int tempYpos = (int) random (500);
			int tempXspeed = (int) random (5,7);
			personajes.add(new Personajes(this, tempXpos, tempYpos, tempXspeed));
			
			
		}
		
		
			/*show = true;
			color = color(0);*/
		
		}


	@Override
	public void draw() {
		//System.out.println(mouseX + "," + mouseY);
		
		//Fondo
		
		background(255);
		imageMode(CENTER);
		image(image2,600,350,1300,700);
		imageMode(CORNER);
		
		//personajes
		for (int i = 0; i < personajes.size(); i++) {
			
		personajes.get(i).PintarPato(this);
		personajes.get(i).mover();
	}
	}	

	 @Override
	public void mousePressed() {
		 
		 for (int i = 0; i < personajes.size(); i++)	{
			 
			 if(dist(mouseX, mouseY, personajes.get(i).getposX(), personajes.get(i).getposY()) < 65) {
				 
				 personajes.remove(i);
				 
			 } 
			 } 			
	 	 }
	 
	 @Override
	public void mouseReleased() {

				 
	}
}		



