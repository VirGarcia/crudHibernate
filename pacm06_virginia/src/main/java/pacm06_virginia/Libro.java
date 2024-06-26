package pacm06_virginia;

//import jakarta.persistence.Column;

public class Libro {

	private int idLibro;
	private String titulo;
	private String autor;
	private int anio_publicacion;
	//@Column(name = "disponible", columnDefinition = "TINYINT(1)")
	private boolean disponible;

	public Libro() {
		// TODO Auto-generated method stub

	}
	public Libro(String titulo, String autor, int anio_publicacion, boolean disponible) {
		this.titulo = titulo;
		this.autor = autor;	
		this.anio_publicacion = anio_publicacion;
		this.disponible = disponible;
		
	}
	public Libro (int idLibro, String titulo, String autor, int anio_publicacion, boolean disponible) {
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.autor = autor;	
		this.anio_publicacion = anio_publicacion;
		this.disponible = disponible;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio_publicacion() {
		return anio_publicacion;
	}
	public void setAnio_publicacion(int anioPublicacion) {
		this.anio_publicacion= anioPublicacion;
	}
	public boolean getDisponible() {
		return this.disponible;
	}
	public void setDisponible(boolean disponible ) {
		this.disponible = disponible;
	}	
	
	@Override
	public String toString() {
		return "Libro:" + getTitulo() + " , autor=" + getAutor() + " , anioPublic=" + getAnio_publicacion() +" , disponible=" + getDisponible() +".";
	}
}
