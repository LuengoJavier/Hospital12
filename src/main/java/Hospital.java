import java.util.ArrayList;

public class Hospital {
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	private ArrayList<Doctor> doctores = new ArrayList<Doctor>();

	public boolean agregarPaciente(String nombre, int edad, String rut) {
		Paciente paciente = new Paciente(nombre, edad, rut);
		this.pacientes.add(paciente);
		return true;
	}

	public boolean eliminarPaciente(String nombre, int edad, String rut) {
		for(Paciente paciente: this.pacientes) {
			if (paciente.getNombre().equals(nombre) & paciente.getEdad() == edad && paciente.getRut().equals(rut)){
				this.pacientes.remove(paciente);
				return true;
			}
		}
		return false;
	}

	public boolean contratarDoctor(String nombre, String rut, int edad) {
		Doctor doctor = new Doctor(nombre, rut, edad);
		this.doctores.add(doctor);
		return true;
	}

	public boolean despedirDoctor(String nombre, String rut, int edad) {
		for(Doctor doctor: this.doctores) {
			if (doctor.getNombre().equals(nombre) & doctor.getEdad() == edad && doctor.getRut().equals(rut)){
				this.doctores.remove(doctor);
				return true;
			}
		}
		return false;
	}
	public void mostrarPacientes(){
		for(Paciente paciente : this.pacientes){
			System.out.println(paciente.toString());
		}
	}
	public void mostrarDoctores(){
		for(Doctor doctor : doctores){
			System.out.println(doctor.toString());
		}
	}
}