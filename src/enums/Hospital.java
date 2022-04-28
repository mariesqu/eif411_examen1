package enums;

public enum Hospital {
	NICOYA("NICOYA"), MEXICO("Mexico");

	private String nombre;

	private Hospital(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return "Hospital de " + nombre;
	}
}
