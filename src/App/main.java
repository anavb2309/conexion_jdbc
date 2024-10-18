/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author Ana Valencia
 */

import Interivalle.DAO.OperacionesCRUD;
import Interivalle.Model.Cliente;
import Interivalle.Model.Servicio_ObraBlanca;

public class main {
    
    public static void main(String[] args) {
        OperacionesCRUD clienteDAO = new OperacionesCRUD();

        ///insertar un nuevo cliente
        Cliente nuevoCliente = new Cliente(1,"prueba5Alzate", "322345639", "prueba5@example.com", "Proyecto a");
        clienteDAO.insertarCliente(nuevoCliente);

        ///consulta todos los clientes
       clienteDAO.obtenerTodosLosClientes();
       System.out.println("Lista de todos los clientes:");
       
       clienteDAO.actualizarCliente("carlosalbertoprueba1@example.com", "Pepito peres", "315234568", "prueba");
       clienteDAO.borrarCliente("marinapantojaxx@example.com");
     
      Servicio_ObraBlanca nuevaObraBlanca= new Servicio_ObraBlanca(0,45.5, 4, 4, 15.0, 10.0, 19.0, 16.0,2,4);
      clienteDAO.insertarServicioObraBlanca(nuevaObraBlanca);
      
      clienteDAO.obtenerServiosObraBlanca();
      System.out.println("Lista de todos los datos de Obra Blanca:");
      
      clienteDAO.actualizarServiciosObraBlanca(1, 45.0, 2, 3, 12.0, 10.0, 13.0, 12.0);
      clienteDAO.borrarServicioObraBlanca(3);
    
    }
}
 
