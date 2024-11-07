/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_return;

/**
 *
 * @author invitado
 */
public class Eva3_2_Return {

    public static void main(String[] args) {
        //Invocar o llamar al metodo
        //SI REGRESA RESULTADOS, TENEMOS 2 OPCIONES
        //HACER ALGO CON EL VALOR
          //GUARDARLO Y USUARLO VARIAS VECES 
        int valor;
        valor = sumarDosEnteros(50, 75);
        System.out.println("Resultado = " + valor);
          // USUARLO UNA SOLA VEZ
        System.out.println("RESULTADO = " + sumarDosEnteros(50, 75));
        //IGNORAR EL VALOR
        sumarDosEnteros(50, 75);
    }
    //Sumar 2 enteros
    public static int sumarDosEnteros(int num1, int num2){
        int resu;
        resu = num1 +num2;
        return resu;     
    }
}
