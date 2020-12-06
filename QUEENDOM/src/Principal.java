import processing.core.PApplet;

public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Principal");
	}

	@Override
	public void settings() {
		size(1200, 700);
	}

	Pantallas pantallas;
	Personajes personajes;
	
	int estado=0;

	@Override
	public void setup() {
		
    pantallas = new Pantallas(this, 0, 0);
    personajes = new Personajes(this, 0, 0);
    
    System.out.println(pantallas);

	}

	@Override
	public void draw() {
    background(255);
    //Pantalla principal
	if (estado == 0) {

    pantallas.PintarPrincipal(this);

		}
	//Pantalla de personalizacion
	if (estado == 1) {
		
		pantallas.PintarPersonalización(this);
		personajes.PintarPersonaje(this);
		personajes.PintarSelec(this);
		
	}
	//System.out.println(mouseX + "," + mouseY);
	}
	
	@Override
	public void mousePressed() {
	    //Boton de jugar
		if (dist(mouseX,mouseY,597,556)<20) {
			estado=1;
		}
	}
}
