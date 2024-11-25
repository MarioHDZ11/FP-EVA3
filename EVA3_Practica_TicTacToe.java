/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_practica_tictactoe;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_Practica_TicTacToe {
    // Asignar los signos
    public static final char VACIO = '_';
    public static final char CRUZ = 'X';
    public static final char CIRCULO = 'O';
    
    public static void main(String[] args) {
        //MATRIZ
        char[][] TTT = new char [3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                TTT[i][j] = VACIO; 
            }
        }
        //Pedir Jugada al usuario
        int turnoJug = 1;
        while(true){
            mostrarJuego(TTT);
            if(turnoJug == 1) {
                System.out.println("Tu Turno");
                System.out.println("Presiona 0 para salir del juego");
                int fila = seleccionarFila("Selecciona la fila:");
                if(fila == -1){
                    break;
                }
                int colm = seleccionarColumna("Selecciona la columna:");
                    //cambiar casilla por Cruz
                if(TTT[fila][colm] == VACIO) {
                    TTT[fila][colm] = CRUZ;
                    turnoJug = 2;
                }else {
                    System.out.println("Casilla ocupada-----Intenta denuevo");
                    continue;
                }
            } else {//Pasar jugada a la computadora
                System.out.println("Turno de la computadora");
                pedirCasillaComp(TTT);
                turnoJug = 1;
            }       //Mostrar que el jugador gano
            if (darGanador(TTT, CRUZ) == 1) {
                mostrarJuego(TTT);
                System.out.println("GANASTE!!!");
                break;
            }       //Mostrar que la computadora gano
            if (darGanador(TTT, CIRCULO) == 1) {
                mostrarJuego(TTT);
                System.out.println("La computadora GANO!!!");
                break;
            }       //Dar empate
            if (indicarNoEspacios(TTT) == 1) {
                mostrarJuego(TTT);
                System.out.println("¡EMPATE!");
                break;
            }
        }
    }
    public static void mostrarJuego(char[][] ttt){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("[" + ttt[i][j] + "]");
            }
            System.out.println("");
        }
    }    
    public static int seleccionarFila(String mensaje){
        Scanner cap = new Scanner(System.in);
        int fila;
        do{
            System.out.println(mensaje);
            System.out.println("-1-2-3-");
            fila = cap.nextInt();
            if(fila == 0){
                return -1;
            }if((fila < 1) || (fila > 3))
                System.out.println("Fila no valida");
        }while((fila < 1) || (fila > 3));
            return fila -1;
    }
    public static int seleccionarColumna(String mensaje){
        Scanner cap = new Scanner(System.in);
        int colm;
        do{
            System.out.println(mensaje);
            System.out.println("-1-");
            System.out.println("-2-");
            System.out.println("-3-");
            colm = cap.nextInt();
            if((colm < 1) || (colm > 3))
                System.out.println("columna no valida");   
        }while ((colm < 1) || (colm > 3));
            return colm -1;
    }
    public static void pedirCasillaComp(char[][] ttt){
        while(true){
            int fila = (int)(Math.random() * 3);   
            int colm = (int)(Math.random() * 3); 
            if (ttt[fila] [colm] == VACIO) {  
                ttt[fila] [colm] = CIRCULO;
                break;
            } 
        }
    }
    public static int indicarNoEspacios (char[][] ttt) {
        for (int i=0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { 
                if (ttt[i][j] == VACIO) {
                    return 0;
                }   
            }
        }
        return 1;
    }    
    public static int darGanador (char[][] ttt, char jug) {
        // Verificar Horizontales y Verticales
        for (int i = 0; i < 3; i++) {
            if (ttt[i][0] == jug && ttt[i][1] == jug && ttt[i][2] == jug) {
                return 1;
            }
            if (ttt[0][i] == jug && ttt[1][i] == jug && ttt[2][i] == jug) {
                return 1;
            }
        }// Verificar diagonales
        if (ttt[0][0] == jug && ttt[1][1] == jug && ttt[2][2] == jug) {
            return 1;
        }
        if (ttt[0][2] == jug && ttt[1][1] == jug && ttt[2][0] == jug) {
            return 1;
        }
        return 0; 
    }
}