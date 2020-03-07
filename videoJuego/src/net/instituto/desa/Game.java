package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.movDerecha();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.movIzquierda();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.movArriba();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.movAbajo();
		}
	}
}
