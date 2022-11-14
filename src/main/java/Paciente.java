public class Paciente {
	private String nombre;
	private int edad;
	private String rut;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Paciente(String nombre, int edad, String rut) {
		this.nombre = nombre;
		this.edad = edad;
		this.rut = rut;
	}
	@Override
	public String toString(){
		return this.nombre+","+this.edad+","+this.rut+",";
	}
}