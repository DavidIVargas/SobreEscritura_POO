/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilo;

/**
 *
 * @author Estudiante
 */
public class Mostrar1Hilo extends Thread{
    private Thread t;
    public void HiloMostrarUno(){
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run (){
        int i;
        for (i=0; i<1000; i++){
            System.out.print("1");
        }
    }
}
