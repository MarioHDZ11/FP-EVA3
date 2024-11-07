/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

/**
 *
 * @author invitado
 */
public class Eva3_4_Metodos {

    
    public static void main(String[] args) {
        System.out.println("Mayor de 8 y 7 = " + buscarMayor(8,7));
        
        System.out.println("El dia 4 es = " + buscarDia(4));
    }
    //Determinar el mayor de 2 números
    public static int buscarMayor(int num1, int num2){
//        int resu; 
//        if(num1 > num2){
//            resu = num1;
//        }else{
//            resu = num2;      
//        }
        if(num1 > num2){
            return num1;
        }else{
            return num2;
            
        }
    } 
    public static String buscarDia(int dia){
        
        switch(dia){
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "Numero de dia no valido(deben ser entre el 1 - 7)";      
        }  
    }
}
