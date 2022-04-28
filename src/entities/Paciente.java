package entities;

public final class Paciente {
	private final String nombre; //inmutabilidad
	private final Integer edad; //inmutabilidad
	private final Integer temperatura; //inmutabilidad
	private final Boolean vomito; //inmutabilidad

	public Paciente(String nombre, Integer edad, Integer temperatura, Boolean vomito) {
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.vomito = vomito;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public Integer getTemperatura() {
		return temperatura;
	}

	public Boolean getVomito() {
		return vomito;
	}
}
