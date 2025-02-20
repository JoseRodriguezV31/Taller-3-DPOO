package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{
	public static final int COSTO_POR_KM_NATURAL = 600;
    public static final int COSTO_POR_KM_CORPORATIVO = 900;
    public static final double DESCUENTO_PEQ = 0.02;
    public static final double DESCUENTO_MEDIANAS = 0.1;
    public static final double DESCUENTO_GRANDES = 0.2;
    
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int distancia = calcularDistanciaVuelo(vuelo.getRuta());
        if (cliente.getTipoCliente().equals("Corporativo")) {
            return distancia * COSTO_POR_KM_CORPORATIVO;
        } else {
            return distancia * COSTO_POR_KM_NATURAL;
        }
    }

   
    protected double calcularPorcentajeDescuento(Cliente cliente) {
        if (cliente.getTipoCliente().equals("Corporativo")) {
            ClienteCorporativo clienteCorp = (ClienteCorporativo) cliente;
            switch (clienteCorp.getTamanoEmpresa()) {
                case ClienteCorporativo.PEQUENA:
                    return DESCUENTO_PEQ;
                case ClienteCorporativo.MEDIANA:
                    return DESCUENTO_MEDIANAS;
                case ClienteCorporativo.GRANDE:
                    return DESCUENTO_GRANDES;
            }
        }
        return 0.0;
    }
}
