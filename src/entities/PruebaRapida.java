package entities;

import interfaces.PruebaCovid19;

public final class PruebaRapida implements PruebaCovid19 {
	private final Paciente paciente;

	PruebaRapida(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public Boolean isPositiveCase() {
		return this.paciente.getTemperatura() >= 37 && this.paciente.getEdad() > 60;
	}

	@Override
	public String getNombrePaciente() {
		return this.paciente.getNombre();
	}
}
