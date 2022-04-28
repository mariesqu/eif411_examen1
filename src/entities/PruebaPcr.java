package entities;

import interfaces.PruebaCovid19;

public final class PruebaPcr implements PruebaCovid19 {

	private final Paciente paciente;

	PruebaPcr(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public Boolean isPositiveCase() {
		return this.paciente.getTemperatura() >= 39 && this.paciente.getVomito();
	}

	@Override
	public String getNombrePaciente() {
		return this.paciente.getNombre();
	}
}
