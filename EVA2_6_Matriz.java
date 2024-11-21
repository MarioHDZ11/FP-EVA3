/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_matriz;

/**
 *
 * @author invitado
 */
public class EVA2_6_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[5]; // Arreglo unidimensional
        // Arreglos de 2 dimensiones --> Matriz: Hoja de Excel
        int[][] matriz = new int [3][3];
        matriz[0][0] = 100;//Primer posicion
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900; //Ultima posicion
        //Imprimir Matriz:
        for(int i = 0; i < 3; i++){// Primer Dimension: FIlas
            for(int j = 0; j < 3; j++){// Segunda Dimension: Columnas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
