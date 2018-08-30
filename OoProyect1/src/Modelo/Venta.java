/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class Venta {
    private ArrayList<Moneda> pagoMoneda; 
    private Producto productoVendido;
    private Date fechaHora;
    private Adicional adicionalesSeleccionados;

    public Venta(ArrayList<Moneda> pagoMoneda, Producto productoVendido, Date fechaHora, Adicional adicionalesSeleccionados) {
        this.pagoMoneda = pagoMoneda;
        this.productoVendido = productoVendido;
        this.fechaHora = fechaHora;
        this.adicionalesSeleccionados = adicionalesSeleccionados;
    }

    

    public Venta(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
        

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Adicional getAdicionalesSeleccionados() {
        return adicionalesSeleccionados;
    }

    public void setAdicionalesSeleccionados(Adicional adicionalesSeleccionados) {
        this.adicionalesSeleccionados = adicionalesSeleccionados;
    }
    
    public Producto getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido = productoVendido;
    }

    public ArrayList<Moneda> getPagoMoneda() {
        return pagoMoneda;
    }

    
    
    
    
    
}
