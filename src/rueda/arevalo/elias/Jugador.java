package rueda.arevalo.elias;

public class Jugador extends Participante{
	
	public Integer numeroDeCamiseta = 0;
	
	public Jugador(Integer dni, String nombre, String nombreEquipo, Integer numeroDeCamiseta, String tipo) {
		super(dni, nombre, nombreEquipo, tipo);
		this.numeroDeCamiseta = numeroDeCamiseta;
	}
	
	public void hacerGol() {
		
	}

}
