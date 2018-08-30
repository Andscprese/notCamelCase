/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Adicional;
import Modelo.Moneda;
import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class GestionProducto {

    private ArrayList<Producto> listaDeTodosLosProductos;
    private ArrayList<Adicional> listaDeTodosLosAdicionales;
    private ArrayList<Moneda> listaDeMonedas;

    public GestionProducto() {
        
        this.listaDeTodosLosAdicionales = new ArrayList<>(6);
        listaDeTodosLosAdicionales.add(new Adicional("Azucar", 50.0));
        listaDeTodosLosAdicionales.add(new Adicional("Leche", 50.0));
        listaDeTodosLosAdicionales.add(new Adicional ("Salsas", 200.0));
        listaDeTodosLosAdicionales.add(new Adicional("Aji", 100.0));
        listaDeTodosLosAdicionales.add(new Adicional("Queso Extra", 500.0));
        listaDeTodosLosAdicionales.add(new Adicional("Servilletas", 50.0));
        
        this.listaDeTodosLosProductos = new ArrayList<>(9);
        listaDeTodosLosProductos.add(new Producto("Hambuguesa", 5000.0, 10));
        listaDeTodosLosProductos.add(new Producto("Pizza", 4500.0, 10));
        listaDeTodosLosProductos.add(new Producto("Tinto", 2000.0, 10));
        listaDeTodosLosProductos.add(new Producto("Ensalada", 3500.0, 10));
        listaDeTodosLosProductos.add(new Producto("Helado", 2000.0, 10));
        listaDeTodosLosProductos.add(new Producto("Pasta", 4000.0, 10));
        listaDeTodosLosProductos.add(new Producto("Sushi", 10000.0, 10));
        listaDeTodosLosProductos.add(new Producto("Empanada", 2000.0, 10));
        listaDeTodosLosProductos.add(new Producto("Soda", 2500.0, 10));


        this.listaDeMonedas = new ArrayList<Moneda>(5);
        listaDeMonedas.add(new Moneda(50, 0));
        listaDeMonedas.add(new Moneda(100, 0));
        listaDeMonedas.add(new Moneda(200, 0));
        listaDeMonedas.add(new Moneda(500, 0));
        listaDeMonedas.add(new Moneda(1000, 0));

    }

    
    /**
     * Crea una nueva lista de adicionales
     *
     * @return Lista de adicionales
     */
    public ArrayList<Adicional> darListaDeAdicionales(int posicionDelCodigoDelProducto) {
        //nueva lista de Adicionales que se anadira a los nuevos productos
        ArrayList<Adicional> nuevaListaDeAdicionales;
        if (posicionDelCodigoDelProducto == 0) {
            //Hamburguesa
            nuevaListaDeAdicionales = new ArrayList<>(4);
            //Salsas
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(2));
            //Aji
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(3));
            //Queso Extra
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(4));
            //Servilleta
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(5));
        } else if (posicionDelCodigoDelProducto == 1) {
            //Pizza
            nuevaListaDeAdicionales = new ArrayList<>(4);
            //Salsas
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(2));
            //Aji
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(3));
            //Queso Extra
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(4));
            //Servilleta
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(5));
        } else if (posicionDelCodigoDelProducto == 2) {
            //Tinto
            nuevaListaDeAdicionales = new ArrayList<>(2);
            //Azucar
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(0));
            //Leche
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(1));
        } else if (posicionDelCodigoDelProducto == 3) {
            //Ensalada
            nuevaListaDeAdicionales = new ArrayList<>(1);
            //Salsa
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(2));
        } else if (posicionDelCodigoDelProducto == 4) {
            //Helado
            //Nada
            nuevaListaDeAdicionales = new ArrayList<>(0);
        } else if (posicionDelCodigoDelProducto == 5) {
            //Pasta
            nuevaListaDeAdicionales = new ArrayList<>(2);
            //Salsas
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(2));
            //Queso Extra
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(4));
        } else if (posicionDelCodigoDelProducto == 6) {
            //Sushi
            nuevaListaDeAdicionales = new ArrayList<>(1);
            //Salsas
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(2));
        } else if (posicionDelCodigoDelProducto == 7) {
            //Empanada
            nuevaListaDeAdicionales = new ArrayList<>(2);
            //Aji
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(3));
            //Servilleta
            nuevaListaDeAdicionales.add(listaDeTodosLosAdicionales.get(5));
        } else if (posicionDelCodigoDelProducto == 8) {
            //Soda
            //nada
            nuevaListaDeAdicionales = new ArrayList<>(0);
        }
        else{
            //Invalido
            nuevaListaDeAdicionales = new ArrayList<>(0);
        }
        return nuevaListaDeAdicionales;
    }
    
    public ArrayList<Producto> darListaDeObsequios(int posicionDelCodigoDelProducto) {
        //nueva lista de Adicionales que se anadira a los nuevos productos
        ArrayList<Producto> nuevaListaDeObsequios;
        if (posicionDelCodigoDelProducto == 0) {
            //Hamburguesa
            //8 7
            nuevaListaDeObsequios = new ArrayList<>(2);
            //Empanada
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(7).getNombre()));
            //Soda
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(8).getNombre()));
        } else if (posicionDelCodigoDelProducto == 1) {
            //Pizza
            nuevaListaDeObsequios = new ArrayList<>(2);
            //Empanada
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(7).getNombre()));
            //Soda
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(8).getNombre()));
        } else if (posicionDelCodigoDelProducto == 2) {
            //Tinto
            nuevaListaDeObsequios = new ArrayList<>(1);
            //Empanada
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(7).getNombre()));
        } else if (posicionDelCodigoDelProducto == 3) {
            //Ensalada
            nuevaListaDeObsequios = new ArrayList<>(1);
            //Soda
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(8).getNombre()));
        } else if (posicionDelCodigoDelProducto == 4) {
            //Helado
            //Nada
            nuevaListaDeObsequios = new ArrayList<>(0);
        } else if (posicionDelCodigoDelProducto == 5) {
            //Pasta
            nuevaListaDeObsequios = new ArrayList<>(1);
            //Soda
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(8).getNombre()));
        } else if (posicionDelCodigoDelProducto == 6) {
            //Sushi
            nuevaListaDeObsequios = new ArrayList<>(1);
            //Soda
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(8).getNombre()));
        } else if (posicionDelCodigoDelProducto == 7) {
            //Empanada
            nuevaListaDeObsequios = new ArrayList<>(1);
            //Tinto
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(2).getNombre()));
        } else if (posicionDelCodigoDelProducto == 8) {
            //Soda
            nuevaListaDeObsequios = new ArrayList<>(1);
            //Empanada
            nuevaListaDeObsequios.add(new Producto(listaDeTodosLosProductos.get(7).getNombre()));
        }
        else{
            //Invalido
            nuevaListaDeObsequios = new ArrayList<>(0);
        }
        return nuevaListaDeObsequios;
    }
        
    /**
     * Regresa nueva lista de productos con sus variables llenas. La lista es de
     * diez productos siempre
     *
     * @return Lista De Productos
     */
    public ArrayList<Producto> darNuevaListaDeProductos() {
        ArrayList<Producto> nuevaListaDeProductos = new ArrayList<>(this.listaDeTodosLosProductos.size());
        Producto nuevoProducto;
        String codigo;
        double precio;
        int unidadesDisponibles;
        ArrayList<Adicional> listaDeAdicionales;
        ArrayList<Producto> listaDeObsequios;
        for(int i=0; i<this.listaDeTodosLosProductos.size(); i++){
            codigo=listaDeTodosLosProductos.get(i).getNombre();
            precio=listaDeTodosLosProductos.get(i).getPrecio();
            unidadesDisponibles=listaDeTodosLosProductos.get(i).getUnidadesDisponibles();
            listaDeAdicionales = darListaDeAdicionales(i);
            listaDeObsequios = darListaDeObsequios(i);
            
            nuevaListaDeProductos.add(new Producto(codigo, unidadesDisponibles, precio, listaDeAdicionales, listaDeObsequios));
        }
        return nuevaListaDeProductos;
    }

    /*
    *
    *            Metodos de Creacion de Lista De Monedas
    *
     */
    public ArrayList<Moneda> darListaDeMonedas() {
        return this.listaDeMonedas;
    }
}
