import java.util.Date;

public class Vuelo {
    private String nombre, origen, destino;
    private Date horaFechaLlegada;
    private Integer numeroPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date horaFechaLlegada, Integer numeroPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.horaFechaLlegada = horaFechaLlegada;
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getHoraFechaLlegada() {
        return horaFechaLlegada;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    @Override
    public String toString() {
        return
                nombre + " " + origen + " " + destino + " " + horaFechaLlegada + " " + numeroPasajeros;
    }
}
