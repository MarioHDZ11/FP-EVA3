/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_metodos;

/**
 *
 * @author invitado
 */
public class Eva3_1_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Invocar el metodo, llamada a metodo --> Usarlo
        imprimirMensaje("Hola mundo!!");
        
    }
    //Declaracion del metodo
    //Modificadores (Opcionales)
           //Valor de retorno 
                //Nombre
                               //Parametros (Opcionales)
    //Son utiles para reutilizar codigo 
    public static void imprimirMensaje(String mensaje){
        //Cuerpo del metodo
        System.out.println("Tu mensaje: " + mensaje);
    }
    
}
