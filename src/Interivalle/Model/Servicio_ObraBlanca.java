/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interivalle.Model;

/**
 *
 * @author Ana Valencia
 */
public class Servicio_ObraBlanca {

    // Atributos de la clase Servicio ObraBlanca
    private int Id_Actividad;
    private double areaPrivadaApto;         
    private int cantidadPanel;              
    private int cantidadPoyo;               
    private double medidaZonaOficio;       
    private double medidaSalpicaderoCocina; 
    private double medidaCocina;            
    private double medidaBanos;   
    private int cantidadMuros;
    private int cantidadPuntosElectricos;

    // Constructor
    public Servicio_ObraBlanca(int Id_Actividad, double areaPrivadaApto, int cantidadPanel, int cantidadPoyo,
                      double medidaZonaOficio, double medidaSalpicaderoCocina,
                      double medidaCocina, double medidaBanos, int cantidadMuros,int cantidadPuntosElectricos) {
        
        this.Id_Actividad= Id_Actividad;
        this.areaPrivadaApto = areaPrivadaApto;
        this.cantidadPanel = cantidadPanel;
        this.cantidadPoyo = cantidadPoyo;
        this.medidaZonaOficio = medidaZonaOficio;
        this.medidaSalpicaderoCocina = medidaSalpicaderoCocina;
        this.medidaCocina = medidaCocina;
        this.medidaBanos = medidaBanos;
        this.cantidadMuros = cantidadMuros;
        this.cantidadPuntosElectricos = cantidadPuntosElectricos;
    }   
    
    public int getId_Actividad() {
        return Id_Actividad;
    }

    public void setId_Actividad(int Id_Actividad) {
        this.Id_Actividad = Id_Actividad;
    }

    public double getAreaPrivadaApto() {
        return areaPrivadaApto;
    }

    public void setAreaPrivadaApto(double areaPrivadaApto) {
        this.areaPrivadaApto = areaPrivadaApto;
    }

    public int getCantidadPanel() {
        return cantidadPanel;
    }

    public void setCantidadPanel(int cantidadPanel) {
        this.cantidadPanel = cantidadPanel;
    }

    public int getCantidadPoyo() {
        return cantidadPoyo;
    }

    public void setCantidadPoyo(int cantidadPoyo) {
        this.cantidadPoyo = cantidadPoyo;
    }

    public double getMedidaZonaOficio() {
        return medidaZonaOficio;
    }

    public void setMedidaZonaOficio(double medidaZonaOficio) {
        this.medidaZonaOficio = medidaZonaOficio;
    }

    public double getMedidaSalpicaderoCocina() {
        return medidaSalpicaderoCocina;
    }

    public void setMedidaSalpicaderoCocina(double medidaSalpicaderoCocina) {
        this.medidaSalpicaderoCocina = medidaSalpicaderoCocina;
    }

    public double getMedidaCocina() {
        return medidaCocina;
    }

    public void setMedidaCocina(double medidaCocina) {
        this.medidaCocina = medidaCocina;
    }

    public double getMedidaBanos() {
        return medidaBanos;
    }

    public void setMedidaBanos(double medidaBanos) {
        this.medidaBanos = medidaBanos;
    }
     public int getCantidadMuros() {
        return cantidadMuros;
    }

    public void setCantidadMuros(int cantidadMuros) {
        this.cantidadMuros = cantidadMuros;
    }
    
     public int getCantidadPuntosElectricos() {
        return cantidadPuntosElectricos;
    }

    public void setCantidadPuntosElectricos(int cantidadPuntosElectricos) {
        this.cantidadPuntosElectricos = cantidadPuntosElectricos;
    }
}
  
