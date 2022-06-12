package org.kulquiango.pooInterfaces.test;

import org.kulquiango.pooInterfaces.main.elements.ClienteListRepositorio;
import org.kulquiango.pooInterfaces.main.enums.Direccion;
import org.kulquiango.pooInterfaces.main.exceptions.AccesoDatoException;
import org.kulquiango.pooInterfaces.main.exceptions.EscrituraAccesoDatoException;
import org.kulquiango.pooInterfaces.main.exceptions.LecturaAccesoDatoException;
import org.kulquiango.pooInterfaces.main.interfaces.OrdenablePaginableCrudRepositorio;
import org.kulquiango.pooInterfaces.main.models.Cliente;

import java.util.List;

public class EjemploRepositorioException {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Cliente> repositorio = new ClienteListRepositorio();
            repositorio.crear(new Cliente("Kevin", "Ulquiango"));
            repositorio.crear(new Cliente("Andres", "Perez"));
            repositorio.crear(new Cliente("Juan", "Perez"));
            repositorio.crear(null);

            List<Cliente> clientes = repositorio.listar();
            clientes.forEach(System.out::println);

            System.out.println("====Paginable====");
            List<Cliente> clientePaginable = repositorio.listar(0, 1);
            clientePaginable.forEach(System.out::println);

            System.out.println("====Ordenar ASC====");
            List<Cliente> clientesOrdenAsc = repositorio.listar("nombre", Direccion.ASC);
            for (Cliente cliente : clientesOrdenAsc
            ) {
                System.out.println(cliente);
            }

            System.out.println("====Ordenar DES====");
            List<Cliente> clientesOrdenDes = repositorio.listar("NO", Direccion.DES);
            for (Cliente cliente : clientesOrdenDes
            ) {
                System.out.println(cliente);
            }
            System.out.println("====Editar====");

            Cliente clienteKevin = new Cliente("Kevin", "Guambi");
            clienteKevin.setId(550);
            repositorio.editar(clienteKevin);

            Cliente Kevin = repositorio.buscarPorId(1);
            System.out.println(Kevin);


            /*Verificar que se elimine el registro*/
            System.out.println("===Elimina===");
            repositorio.eliminar(1);
            List<Cliente> verificar = repositorio.listar("nombre", Direccion.ASC);
            verificar.forEach(System.out::println);

            System.out.println("Total registrados: " + repositorio.total());

        } catch (LecturaAccesoDatoException e) {
            e.printStackTrace();
        }catch (EscrituraAccesoDatoException e){
            e.printStackTrace();
        }catch (AccesoDatoException e){
            e.printStackTrace();
        }
    }
}
