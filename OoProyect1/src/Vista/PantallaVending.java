package Vista;

import Controlador.GestionProducto;
import Controlador.Vending;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rodri
 */
public class PantallaVending 
{

private Scanner Typer;


    // ----------------------------
    //  Relaciones
    // ----------------------------
private ArrayList<Producto> catalogo;

    // ----------------------------
    //  Constructores
    // ----------------------------

    /**
     * 
     */
    public PantallaVending() 
    {
            Typer = new Scanner(System.in);
    }

    
    public int mostrarMenu()
    {
        
        imprimir("Maquina expendedora");
        imprimir();
        imprimir("Codigo     Producto");
    int Codigo=0;    
    for (Producto catalogo1 : catalogo) 
    {
        imprimir("codigo ");
    }
        
        
        imprimir(" 1)        Acumular un número");
        imprimir(" 2)        Mostrar resultado actual");
        imprimir(" 3)        Modificar texto");
        imprimir(" 3)        Modificar texto");
        imprimir(" 3)        Modificar texto");
        imprimir(" 3)        Modificar texto");

        imprimir("0) Salir");

        int opcionSeleccionada = leerInt("Selecciona una opción");

        return opcionSeleccionada;
    }
    
    public int leerInt(String enunciado)
    {
        imprimir(enunciado+":");
        System.out.print(" > ");
        int numero = Typer.nextInt();
        return numero;
    }

    /**
     * 
     */
    public void imprimir()
    {
        imprimir("");
    }

    /**
     * 
     * @param mensaje
     */
    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }

    /**
     * 
     * @param mensaje
     */
    public void mostrarError(String mensaje) 
    {
        imprimir("===========================");
        imprimir("   ERROR EN: " +mensaje);
        imprimir("===========================");

    }

    /**
     * 
     * @param enunciado
     * @return
     */
    public String leerString(String enunciado)
    {
        imprimir(enunciado+":");
        System.out.print(" > ");
        String texto = Typer.nextLine();
        texto = Typer.nextLine();
        return texto;
    }
}
