package uniandes.dpoo.aerolinea.persistencia;

import java.io.IOException;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea 
{
    
    public void cargarAereolinea( String archivo, Aerolinea aerolinea ) throws IOException, InformacionInconsistenteException;

   
    public void salvarAereolinea( String archivo, Aerolinea aerolinea ) throws IOException;

}	

