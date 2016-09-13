package mundo;

import java.util.Random;

public class Programa {
	private Bodega bodega;
	private Operario threadOperario;
	private Empacador threadEmpacador;

	public Programa(Bodega bodega) {
		this.bodega = bodega;
		threadOperario = new Operario(bodega);
		threadEmpacador = new Empacador(bodega);

	}

	public void descargarPaquete() {
		threadOperario.start();
	}

	public void crearPaquete() {
		threadEmpacador.start();
	}

	public static void main(String[] args) {
		Programa programa = new Programa(new Bodega());
		programa.descargarPaquete();
		programa.crearPaquete();

	}
}
