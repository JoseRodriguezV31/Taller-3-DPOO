package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	private String nombre;
    private String capacidad;
    
    
    public Avion(String nombre,String capacidad ) {
        this.nombre = nombre;
        this.capacidad = capacidad;
       
    }

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
    
}
