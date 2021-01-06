package ar.edu.unlam.pb2.obras;

import java.util.Set;
import java.util.TreeSet;

public class Catalogo {
	
	Set<ObraDeArte> obras; 
	
	
	public Catalogo() {
		obras= new TreeSet<ObraDeArte>();
	}

	public void agregarObra(ObraDeArte obraDeArte)throws Exception {
		
		if(obras.contains(obraDeArte)) {
			throw new Exception("Obra Duplicada");
		}else {
			obras.add(obraDeArte);
		}
	}

	public int obtenerCantidadObras() {
		Integer resultado=obras.size();
		return resultado;
	}

	public boolean existeObra(ObraDeArte obraDeArte) {
		if(obras.contains(obraDeArte)) {
			return true;
		}else {
			return false;
		}
	}

	public Set<ObraDeArte> getObras() {
		return obras;
	}

	public void setObras(Set<ObraDeArte> obras) {
		this.obras = obras;
	}

	

}
