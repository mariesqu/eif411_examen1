package entities;

import java.util.List;

import enums.Hospital;

public class HospitalMexico extends OrganizacionMundialSalud {

	private Boolean isGamHospitalFlg = true;
	private Hospital hospital = Hospital.MEXICO;

	public HospitalMexico(List<Paciente> listaPacientes) {
		super(listaPacientes);
	}
	
	public HospitalMexico(List<Paciente> listaPacientes, Hospital hospital, Boolean isGamHospitalFlg) {
		super(listaPacientes);
		this.hospital = hospital;
		this.isGamHospitalFlg = isGamHospitalFlg;
	}

	@Override
	protected Boolean isGamHospital() {
		return this.isGamHospitalFlg;
	}

	@Override
	protected Hospital getNombreHospital() {
		return hospital;
	}
}
