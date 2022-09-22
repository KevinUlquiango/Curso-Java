import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) throws ParseException {

        List<Vuelo> llegadaVuelos = new ArrayList<>();

        /*Formato Fecha*/
        DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        llegadaVuelos.add(new Vuelo("AAL 933", "New York", "Santiago", formatoFecha.parse("2021-08-29 05:39"), 62));
        llegadaVuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", formatoFecha.parse("2021-08-31 04:45"), 47));
        llegadaVuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", formatoFecha.parse("2021-08-30 16:00"), 52));
        llegadaVuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", formatoFecha.parse("2021-08-29 13:22"), 59));
        llegadaVuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", formatoFecha.parse("2021-08-31 14:05"), 25));
        llegadaVuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", formatoFecha.parse("2021-08-31 05:20"), 29));
        llegadaVuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", formatoFecha.parse("2021-08-30 08:45"), 55));
        llegadaVuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", formatoFecha.parse("2021-08-29 07:41"), 51));
        llegadaVuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", formatoFecha.parse("2021-08-30 10:35"), 48));
        llegadaVuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", formatoFecha.parse("2021-08-29 09:14"), 59));
        llegadaVuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", formatoFecha.parse("2021-08-31 08:33"), 31));
        llegadaVuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", formatoFecha.parse("2021-08-31 15:15"), 29));
        llegadaVuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", formatoFecha.parse("2021-08-30 08:14"), 47));
        llegadaVuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", formatoFecha.parse("2021-08-29 22:53"), 60));
        llegadaVuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", formatoFecha.parse("2021-08-31 09:57"), 32));
        llegadaVuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", formatoFecha.parse("2021-08-31 04:00"), 35));
        llegadaVuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", formatoFecha.parse("2021-08-29 07:45"), 61));
        llegadaVuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", formatoFecha.parse("2021-08-30 07:12"), 58));
        llegadaVuelos.add(new Vuelo("LAT 501", "París", "Santiago", formatoFecha.parse("2021-08-29 18:29"), 49));
        llegadaVuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", formatoFecha.parse("2021-08-30 15:45"), 39));


        llegadaVuelos.sort((v1, v2) -> v2.getHoraFechaLlegada().compareTo(v1.getHoraFechaLlegada()));

        llegadaVuelos.forEach(System.out::println);
        Vuelo ultimoVuelo = llegadaVuelos.get(0);
        System.out.println("El último vuelo en llegar es " + ultimoVuelo.getNombre() + ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getHoraFechaLlegada());

        llegadaVuelos.sort((v1, v2) -> Integer.valueOf(v2.getNumeroPasajeros()).compareTo(v1.getNumeroPasajeros()));
        Vuelo vueloNenorNumero = new LinkedList<>(llegadaVuelos).peekLast();
        System.out.println("El vuelo con menor número de pasajeros es " + vueloNenorNumero.getNombre() + ": " + vueloNenorNumero.getOrigen() + ", con " + vueloNenorNumero.getNumeroPasajeros() + " pasajeros.");
    }
}
