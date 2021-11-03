package test;



import org.junit.Test;

import estructuraDeDatos.Torneo;
import metodos.AsignarArbitros;
import metodos.Jsons;

public class AsignarArbitrosTest {

	@Test (expected = IllegalArgumentException.class)
	public void testTorneoConEquiposImpar() {
		Torneo torneo = Jsons.leerTorneoDeJson("Torneo con 3 equipos");
		AsignarArbitros.asignarArbitros(torneo);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testTorneoSinEquipos() {
		Torneo torneo = Jsons.leerTorneoDeJson("Torneo sin equipos");
		AsignarArbitros.asignarArbitros(torneo);
	}
	
	@Test 
	public void testTodosLosEquiposTienenArbitro() {
		Torneo torneo = new Torneo(crear4Equipos());
		AsignarArbitros.asignarArbitros(torneo);
		Assert.todosConArbitro(torneo);
	}
	@Test 
	public void testTodosLosEquiposTienenArbitroDiferente() {
		Torneo torneo = new Torneo(crear4Equipos());
		AsignarArbitros.asignarArbitros(torneo);
		Assert.todosConArbitroDiferente(torneo);
	}
	
	@SuppressWarnings("unused")
	private String[] crear6Equipos() {
		String a = "Boca";
		String b ="river";
		String c = "Independiente";
		String d = "SanLorenzso";
		String e = "Sacachispas";
		String f = "El trueno verde";
		String[] equipos = {a,b,c,d,e,f};
		return equipos;
	}
	@SuppressWarnings("unused")
	private String[] crear2Equipos() {
		String a = "Boca";
		String b = "river";
		String[] equipos = {a,b};
		return equipos;
	}
	private String[] crear4Equipos() {
		String a = "Boca";
		String b = "river";
		String c = "Independiente";
		String d = "Racing";
		String[] equipos = {a,b,c,d};
		return equipos;
	}
}
