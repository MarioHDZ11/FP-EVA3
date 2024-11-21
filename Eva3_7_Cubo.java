/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_cubo;

/**
 *
 * @author invitado
 */
public class Eva3_7_Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][][] cubo = new int [5][5][5];//125 enteros
        // Llenar con valores aleatorios
        System.out.println(cubo.length);
        System.out.println(cubo[0].length);
        System.out.println(cubo[0][0].length);
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = (int)(Math.random() * 50);
                }
            }
        }
        //imprimir
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print("[" + cubo[i][j][k] + "]");
                }   
            }
        }
    }
    
}
