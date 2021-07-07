package rueda.arevalo.elias;

public class DirectorTecnico extends Participante {
	
	public Integer edad = 0;
	
	public DirectorTecnico(Integer dni, String nombre, String nombreEquipo, Integer edad, String tipo) {
		super(dni, nombre, nombreEquipo, tipo);
		this.edad = edad;
	}

}
