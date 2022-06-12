package org.kulquiango.pooInterfaces.main.elements;

import org.kulquiango.pooInterfaces.main.abstracts.AbstractaListRepositorio;
import org.kulquiango.pooInterfaces.main.enums.Direccion;
import org.kulquiango.pooInterfaces.main.exceptions.LecturaAccesoDatoException;
import org.kulquiango.pooInterfaces.main.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {


    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente clienteEditable = this.buscarPorId(cliente.getId());
        clienteEditable.setNombre(cliente.getNombre());
        clienteEditable.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        Cliente clienteEliminar = this.buscarPorId(id);
        this.dataSource.remove(clienteEliminar);
    }


    @Override
    public void eliminarPorNombre(String nombre) {
        for (int i = 0; i < dataSource.size(); i++) {
            Cliente cliente = dataSource.get(i);
            if (cliente.getNombre().equals(nombre)) {
                dataSource.remove(cliente);
                i--;
            }
        }
    }
    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            /*compareTo*/
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);

            } else if (dir == Direccion.DES) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });

        return listaOrdenada;
    }


    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    /*KUG: Prueba de funcionalidad del metodo implementado*/
//    public static void main(String[] args) {
//        TListRepositorio list = new TListRepositorio();
//        list.crear(new T("Kevin","Ulquiango"));
//        list.crear(new T("Kevin","Guambi"));
//        list.crear(new T("Andres","Guambi"));
//        list.crear(new T("Kevin","Ulquiango"));
//        list.crear(new T("Kevin","Guambi"));
//        list.crear(new T("Andres","Guambi"));
//        list.crear(new T("Kevin","Ulquiango"));
//        list.crear(new T("Kevin","Guambi"));
//        list.crear(new T("Andres","Guambi"));
//        list.eliminarPorNombre("Kevin");
//        for (T cliente: list.dataSource
//             ) {
//            System.out.println(cliente.getNombre() + " " + cliente.getApellido());
//        }
//    }
}