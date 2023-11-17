/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilo;

/**
 *
 * @author Estudiante
 */
public class MostrarUnoHilo extends Thread{
    
    @Override
    public void run(){
        int i;
        for (i=0; i<=1000;i++){
            System.out.print("1");
        }
    }
}
