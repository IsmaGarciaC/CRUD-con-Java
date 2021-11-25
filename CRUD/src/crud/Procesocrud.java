/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Procesocrud {
    Scanner read = new Scanner(System.in);
    private int operador;
    private String resp = null;
    private String persona;
    private String respeliminar;
    
   //Empieza el bucle   
    public void crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        persona = read.next();
}
    public void modificarPersona(){
        System.out.println("Ingrese el nuevo nombre de la persona");
        persona = read.next();
    }
    public void listarPersona(){
        System.out.println("Su persona es...");
        System.out.println(persona);
    }
    public void eliminarPersona(){
        System.out.println("Desea eliminar a esta persona?");
        respeliminar = read.next();
        if ("si".equals(respeliminar)) {
            persona= "ELIMINADO";
        }
}
    public void secuencia(){
        do {
            System.out.println("1. Crear");
            System.out.println("2. Modificar");
            System.out.println("3. Listar");
            System.out.println("4. Eliminar");
            System.out.println("Ingrese el numero del proceso a realizar");
            operador = read.nextInt();
            //empieza el bucle
            switch(operador){
                case 1:
                    crearPersona();
                    break;
                case 2:
                    modificarPersona();
                    break;
                case 3:
                    listarPersona();
                    break;
                case 4:
                    eliminarPersona();
                    break;
                default:
                    System.out.println("El numero ingresado no es valido");
                    }
            System.out.println(" ");
            System.out.println("Desea continuar?");
            resp = read.next();
        } while ("si".equals(resp));
    }
}
