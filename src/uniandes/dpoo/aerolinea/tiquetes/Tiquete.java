package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
    private String codigo;
    private Vuelo vuelo;
    private Cliente clienteComprador;
    private int tarifa;
    private boolean usable;

    public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.clienteComprador = clienteComprador;
        this.tarifa = tarifa;
        this.usable = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    public int getTarifa() {
        return tarifa;
    }

    public boolean isUsable() {
        return usable;
    }

    public void marcarComoUsado() {
        this.usable = false;
    }
}
