package pacm06_virginia;

public class Lector {
	
	private int idLector;
	private String nombre;
	private String apellido;
	private String email;
	private int edad;	

	public Lector() {
		// TODO Auto-generated method stub

	}
	public Lector(String nombre, String apellido, String email, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;	
		this.email = email;
		this.edad = edad;
		
	}
	public Lector (int idLector, String titulo, String apellido, String email, int edad) {
		this.idLector = idLector;
		this.nombre = titulo;
		this.apellido = apellido;	
		this.email = email;
		this.edad = edad;
	}
	public int getIdLector() {
		return this.idLector;
	}
	public void setIdLector(int idLector) {
		this.idLector = idLector;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido ) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad ) {
		this.edad = edad;
	}	
	
	@Override
	public String toString() {
		return "Lector:" + getNombre() + " , apellido=" + getApellido() + " , email=" + getEmail() +" , edad=" + getEdad() +".";
	}


}
