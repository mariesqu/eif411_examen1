package entities;

import java.util.List;

import enums.Hospital;
import interfaces.PruebaCovid19;

public abstract class OrganizacionMundialSalud {
	protected List<Paciente> listaPacientes;
	protected List<PruebaCovid19> listaPruebaCovid19;

	protected abstract Boolean isGamHospital();

	protected abstract Hospital getNombreHospital();

	public OrganizacionMundialSalud(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	private void diagnosticar() {
		for (Paciente paciente : listaPacientes) {
			if (getNombreHospital().toString().toUpperCase().equals("HOSPITAL DE NICOYA")) {
				listaPruebaCovid19.add(new PruebaRapida(paciente));
			} else {
				listaPruebaCovid19.add(new PruebaPcr(paciente));
			}
		}
	}

	public final void imprimirReporte() {
		System.out.println(getNombreHospital());
		System.out.println("--------------------------");
		for (PruebaCovid19 pruebas : listaPruebaCovid19) {
			System.out
					.println("Paciente: " + pruebas.getNombrePaciente() + " => Resultado: " + pruebas.isPositiveCase());
		}
	}
}
