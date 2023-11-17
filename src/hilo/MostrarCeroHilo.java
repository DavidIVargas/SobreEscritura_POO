/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilo;

/**
 *
 * @author Estudiante
 */
public class MostrarCeroHilo extends Thread {
    //(Sobre escritura)Esto quiere decir que este metodo puede ser usado en multiples ocaciones
    @Override
    public void run(){
        int i;
        for (i=0; i <= 1000; i++){
            System.out.println("0");
        }
    }
}