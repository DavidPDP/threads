package mundo;

public class Empacador extends Thread{

	private Bodega bodega;

	public Empacador(Bodega bodega) {
		this.bodega = bodega;
	}

	@Override
	public void run() {

		while (true) {
			bodega.crearPaquete();
		}
	}
}
