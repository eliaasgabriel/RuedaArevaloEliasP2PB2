package rueda.arevalo.elias;

import static org.junit.Assert.*;


import org.junit.Test;

public class torneoDeFutbolTest {

	@Test
	public void queSePuedanAgregarMiembrosAlTorneo() {
		String nombre = "De Paul";
		Integer dni = 2;
		String nombreEquipo = "Seleccion Argentina";
		Integer numeroCamiseta = 7;
		
		String nombreDT = "Scaloni";
		Integer dniDT = 3;
		Integer edad = 46;
		Participante jugador = new Jugador(dni, nombre, nombreEquipo, 7, "jugador");
		Participante dt = new DirectorTecnico(dniDT, nombreDT, nombreEquipo, edad, "dt");
		Torneo copaAmerica = new Torneo("Copa America");
		
		copaAmerica.agregarParticipante(jugador);
		copaAmerica.agregarParticipante(dt);
		
		assertEquals(dt, copaAmerica.buscarParticipante(dniDT));
		
	}
	
	@Test
	public void queSePuedanRegistrarLosPartidosDelTorneo() {
		String equipoLocal = "Uruguay";
		String equipoVisitante = "Argentina";
		Partido nuevo = new Partido((Integer) 22/04/2021, equipoLocal, equipoVisitante);
		Torneo copaAmerica = new Torneo("Copa America");
		copaAmerica.agregarParticipante(new Jugador ((Integer)1, "Messi", "Argentina",(Integer) 10, "jugador"));
		copaAmerica.agregarParticipante(new Jugador ((Integer)2, "Rodriguez", "Argentina",(Integer) 18, "jugador"));
		
		nuevo.iniciarPartido(nuevo, copaAmerica);
		assertEquals((Integer)2, nuevo.obtenerJugadoresEnCancha(nuevo));
	
		
		
	}
	
	@Test (expected = JugadorNoEncontradoException.class)
	public void queSeRegistrenLosGolesQueHizoUnJugador() throws JugadorNoEncontradoException {
		String nombre = "De Paul";
		Integer dni = 2;
		String nombreEquipo = "Seleccion Argentina";
		Integer numeroCamiseta = 7;
		Jugador jugador = new Jugador(dni, nombre, nombreEquipo, 7, "jugador");
		String equipoLocal = "Uruguay";
		String equipoVisitante = "Argentina";
		Partido partido = new Partido((Integer) 22/04/2021, equipoLocal, equipoVisitante);
		
		partido.hacerGol( jugador);
		partido.hacerGol( jugador);
		
		Jugador jugador2 = new Jugador(dni, nombre, nombreEquipo, 7, "jugador");
		assertEquals((Integer)2, partido.obtenerGoles(jugador2));
		
	}
	
	

}
