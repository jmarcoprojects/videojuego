package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void movDerecha() {
		this.x++;
	}
	
	public void movIzquierda() {
		this.x--;
	}
	
	public void movArriba() {
		this.y--;
	}
	
	public void movAbajo() {
		this.y++;
	}

}
