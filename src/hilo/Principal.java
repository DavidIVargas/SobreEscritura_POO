/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilo;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*MostrarCeroUno obj = new MostrarCeroUno();
        obj.mostrarCero();
        obj.mostrarUno();

        MostrarCeroHilo h0 = new MostrarCeroHilo();
        h0.start();
        MostrarUnoHilo h1 = new MostrarUnoHilo();
        h1.start();
        */
        Mostrar0Hilo h0 = new Mostrar0Hilo();
        h0.HiloMostrarCero();
        Mostrar1Hilo h1 = new Mostrar1Hilo();
        h1.HiloMostrarUno();
    }
}
