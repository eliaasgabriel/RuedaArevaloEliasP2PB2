package rueda.arevalo.elias;

public class Participante {
	
	public String nombre = "";
	public Integer dni = 0;
	public String nombreEquipo = "";
	public String tipo = ""; 
	public Participante(Integer dni, String nombre, String nombreEquipo, String tipo) {
		this.dni = dni;
		this.nombre = nombre;
		this.nombreEquipo = nombreEquipo;
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

}
