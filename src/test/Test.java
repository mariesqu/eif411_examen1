package test;

import java.util.ArrayList;
import java.util.List;

import entities.HospitalMexico;
import entities.HospitalNicoya;
import entities.Paciente;

public class Test {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Harry Potter", 70, 40, true);
		Paciente paciente2 = new Paciente("Ron Weasley", 70, 40, true);
		Paciente paciente3 = new Paciente("Hermione Granger", 70, 38, false);
		Paciente paciente4 = new Paciente("Luna Lovegood", 70, 36, false);
		List<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(paciente1);
		pacientes.add(paciente2);
		pacientes.add(paciente3);
		pacientes.add(paciente4);
		
		HospitalMexico hopMexico = new HospitalMexico(pacientes);
		hopMexico.diagnosticar();
		hopMexico.imprimirReporte();
		
		System.out.println("\n");
		
		HospitalNicoya hopNicoya = new HospitalNicoya(pacientes);
		hopNicoya.diagnosticar();
		hopNicoya.imprimirReporte();
	}
}
