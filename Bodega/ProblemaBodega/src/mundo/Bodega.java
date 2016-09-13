package mundo;

public class Bodega {
	private int tipoUno, tipoDos, capacidad;

	public Bodega() {
		tipoUno = 0;
		tipoDos = 0;
		capacidad = 0;
		System.out.println("La bodega se inició correctamente");
		System.out.println("-------------------------------------");
	}

	// tipo uno --> true
	// tipo dos --> false
	public void descargarPaquete(boolean tipo) {

		if (tipo) {
			while (capacidad > 190)
				;
			capacidad += 10;
			tipoUno++;
			printInfo("uno");
		} else {
			while (capacidad > 185)
				;
			capacidad += 15;
			tipoDos++;
			printInfo("dos");
		}
	}

	public void crearPaquete() {
		while (tipoUno < 3 || tipoDos < 4)
			;
		tipoUno -= 3;
		tipoDos -= 4;
		capacidad -= 90;
		printInfo(null);
	}

	private void printInfo(String tipo) {
		if (tipo != null)
			System.out.println("Se descargó un paquete tipo " + tipo);
		else
			System.out.println("Se creó el paquete correctamente");

		System.out.println("-------------------------------------");
		System.out.println("Capacidad: " + capacidad);
		System.out.println("Tipo Uno: " + tipoUno);
		System.out.println("Tipo Dos: " + tipoDos);
		System.out.println("-------------------------------------");

	}
}
