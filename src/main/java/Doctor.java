public class Doctor {
	private String nombre;
	private String rut;
	private int edad;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Doctor(String nombre, String rut, int edad) {
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
	}
	@Override
	public String toString(){
		return this.nombre+","+this.edad+","+this.rut+",";
	}
}