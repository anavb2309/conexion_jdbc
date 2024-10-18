/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interivalle.Model;

/**
 *
 * @author Ana Valencia
 */
public class Cliente {
    
    int idUsuario;
    String nombreCliente;
    String telefonoCliente;
    String emailCliente;
    String proyectoCotizar;

    // Constructor
    public Cliente(int idUsuario, String nombreCliente, String telefonoCliente, String emailCliente, String proyectoCotizar) 
    {
        this.idUsuario = idUsuario;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.proyectoCotizar = proyectoCotizar;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getProyectoCotizar() {
        return proyectoCotizar;
    }

    public void setProyectoCotizar(String proyectoCotizar) {
        this.proyectoCotizar = proyectoCotizar;
    }
}
