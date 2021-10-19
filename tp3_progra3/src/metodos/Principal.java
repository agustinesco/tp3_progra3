package metodos;

import estructuraDeDatos.Equipo;
import estructuraDeDatos.Fecha;

public class Principal {

	public static void main(String[] args) {
		Equipo a = new Equipo("El colo colo", 10);
		Equipo b = new Equipo("El trueno verde", 10);
		Equipo[] equipos = new Equipo[2];
		equipos[0] = a;
		equipos[1] = b;
		Fecha f = new Fecha(equipos);
		f.generarJSON("src\\archivos\\prueba");
	}

}
