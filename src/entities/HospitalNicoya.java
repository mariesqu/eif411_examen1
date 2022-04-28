package entities;

import java.util.List;

import enums.Hospital;

public class HospitalNicoya extends OrganizacionMundialSalud {
	private Boolean isGamHospitalFlg = false;
	private Hospital hospital = Hospital.NICOYA;

	public HospitalNicoya(List<Paciente> listaPacientes) {
		super(listaPacientes);
	}

	public HospitalNicoya(List<Paciente> listaPacientes, Hospital hospital, Boolean isGamHospitalFlg) {
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
