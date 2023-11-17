/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilo;

/**
 *
 * @author Estudiante
 */
public class Mostrar0Hilo implements Runnable{
    private Thread t;
    public void HiloMostrarCero(){
        t = new Thread(this);//this lo que quiere decir que esta de clase.
        t.start();
    }
    @Override
    public void run(){
        int i;
        for (i=0; i<=1000; i++){
            System.out.print("0");
        }
    }
}
