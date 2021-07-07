package rueda.arevalo.elias;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Torneo {
	
	public Set <Participante> participantes;
	
	public String nombre = "";
	
	public Torneo(String string) {
		this.participantes = new HashSet<Participante>();

	}

	public void agregarParticipante(Participante nuevo) {
		participantes.add(nuevo);
		
	}

	public Participante buscarParticipante(Integer dni) {
		
		for(Participante e: participantes) {
			if(e.getDni().equals(dni)) {
				
			return e;
		}
			
	}
		return null;
	}


	public Set<Participante> obtenerLista(){
		return participantes;
	}

	
}


