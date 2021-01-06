package ar.edu.unlam.pb2.obras;

public class ObraDeArte implements Comparable<ObraDeArte>{

	private String nombre;
	private Autor autor;
	
	public ObraDeArte(String nombre, Autor autor) {
		this.nombre=nombre;
		this.autor=autor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public int compareTo(ObraDeArte obraDeArte) {
		
		return this.nombre.compareTo(obraDeArte.getNombre());
		
	}
	

	

}
