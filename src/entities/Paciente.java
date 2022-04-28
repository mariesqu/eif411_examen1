package entities;

public final class Paciente {
	private final String nombre;
	private final Integer edad;
	private final Integer temperatura;
	private final Boolean vomito;

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
