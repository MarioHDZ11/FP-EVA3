/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva3_3_Captura {

    public static void main(String[] args) {
        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido = capturarTexto("introduce tu apellido:");
         
        int edad = capturarEntero("Introduce tu edad:");
        
        double salar = capturarDouble("Introduce tu salario:");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        
        System.out.println("Edad: " + edad);
        
        System.out.println("Salario: " + salar);
    }
    
    public static String capturarTexto(String mensaje){
        Scanner cap = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = cap.nextLine();
        return texto;
    }
    
    public static int capturarEntero(String mensaje){
        Scanner cap = new Scanner(System.in);
        int age;
        System.out.println(mensaje);
        age = cap.nextInt();
        return age;
    }
    
    public static double capturarDouble(String mensaje){
        Scanner cap = new Scanner(System.in);
        double salario;
        System.out.println(mensaje);
        salario = cap.nextDouble();
        return salario;
    }
}
