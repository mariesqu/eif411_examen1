package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Hospital;
import interfaces.PruebaCovid19;

public abstract class OrganizacionMundialSalud { //Composicion
	protected List<Paciente> listaPacientes;
	protected List<PruebaCovid19> listaPruebaCovid19;

	protected abstract Boolean isGamHospital();

	protected abstract Hospital getNombreHospital();

	public OrganizacionMundialSalud(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
		listaPruebaCovid19 = new ArrayList<PruebaCovid19>();
	}

	public void diagnosticar() {
		for (Paciente paciente : listaPacientes) {
			if (isGamHospital()) {
				listaPruebaCovid19.add(new PruebaPcr(paciente));//polimorfismo encapsulacion
			} else {
				listaPruebaCovid19.add(new PruebaRapida(paciente));//polimorfismo encapsulacion
			}
		}
	}

	public final void imprimirReporte() {
		System.out.println(getNombreHospital().getNombre());
		System.out.println("--------------------------");
		for (PruebaCovid19 pruebas : listaPruebaCovid19) {
			System.out
					.println("Paciente: " + pruebas.getNombrePaciente() + " => Resultado: " + pruebas.isPositiveCase());
		}
	}
}
