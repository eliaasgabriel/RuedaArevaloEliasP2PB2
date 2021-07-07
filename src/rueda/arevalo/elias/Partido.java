package rueda.arevalo.elias;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Partido {
	public Integer fecha = 0;
	public String equipoLocal = "";
	public String equipoVisitante = "";
	public List<Jugador> goles;
	public List<Jugador> jugando;
	
	public Partido(Integer fecha, String equipoLocal, String equipoVisitante) {
		this.fecha = fecha;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.goles = new ArrayList<Jugador>();
	}

	public Integer getFecha() {
		return fecha;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public void hacerGol(Jugador jugador) {
		
		this.goles.add(jugador);
		
	}

	public Integer obtenerGoles(Jugador jugador) throws JugadorNoEncontradoException {
		Integer contadorGol = 0;
		
		for(Jugador e: goles) {
		
			if(e == jugador) {
				contadorGol++;
			}
			else {
			throw new JugadorNoEncontradoException();
		}
			
		}
		return contadorGol;
			
	}
	
	public void iniciarPartido(Partido partido, Torneo torneo) {
		
		for(Participante j: torneo.obtenerLista()) {
			if(j.getNombreEquipo() == partido.getEquipoLocal() || j.getNombreEquipo() == partido.getEquipoVisitante() && j.getTipo() == "jugador" && torneo.buscarParticipante(j.getDni()).equals(j)) {
				
				this.jugando.add(j);
			}
		}
	}
	
	public Integer obtenerJugadoresEnCancha(Partido nuevo) {
		return this.jugando.size();
			
	}
	
}
		
	

	
	


