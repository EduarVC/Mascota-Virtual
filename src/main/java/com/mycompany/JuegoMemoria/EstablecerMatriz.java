package com.mycompany.JuegoMemoria;

import com.mycompany.mascotas.Mascota;
import java.awt.Color;
import javax.swing.JButton;

public class EstablecerMatriz {

    private static int columnas;
    private static int filas;
    private JButton[][] matriz;

    public EstablecerMatriz() {
        matriz = new JButton[getFilas()][getColumnas()];
        setColumnas(2);
        setFilas(4);
    }

    public JButton[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(JButton[][] matriz) {
        this.matriz = matriz;
    }

    public void obtenerCantidadCartas(/*Mascota mascotaSalvaje*/ int nivel) {
        switch (nivel) {
            case 0:
                setFilas(4);
                setColumnas(2);
                break;
            case 1:
                setFilas(4);
                setColumnas(3);
                break;
            case 2:
                setFilas(4);
                setColumnas(4);
                break;
            case 3:
                setFilas(4);
                setColumnas(5);
                break;
            case 4:
                setFilas(4);
                setColumnas(6);
                break;
            case 5:
                setFilas(4);
                setColumnas(7);
                break;
            case 6:
                setFilas(4);
                setColumnas(8);
                break;
            case 7:
                setFilas(5);
                setColumnas(8);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void matriz(/*Mascota mascotaEnemigo*/) {
        int contador = 0;
        int contador2 = 0;
        boolean existe = false;
        obtenerCantidadCartas(7);
        int numeroParejas = (getColumnas() * getFilas()) / 2;
        int[] cartas = new int[getColumnas() * getFilas()];
        int[] parejas = new int[numeroParejas];
        int[][] matrizN = new int[getFilas()][getColumnas()];

        while (contador < numeroParejas) {
            int numero = (int) (Math.random() * 151 + 1);
            for (int i = 0; i < parejas.length; i++) {
                if (numero == parejas[i]) {
                    existe = true;
                    break;
                } else {
                    existe = false;
                }
            }
            if (existe == false) {
                parejas[contador] = numero;
                contador++;
            }
        }
        
        for (int i = 0; i < parejas.length; i++) {
            System.out.println(parejas[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < cartas.length; i++) {
            if (i < cartas.length / 2) {
                cartas[i] = parejas[i];
            } else if (i >= cartas.length / 2) {
                cartas[i] = parejas[contador2];
                contador2++;
            }
        }
        
        for (int i = 0; i < cartas.length; i++) {
            System.out.println(cartas[i]);
            
        }
        System.out.println("");
        System.out.println("");
        
        boolean verificar;
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
               
                verificar = true;
                while (verificar == true) {
                    int posAleatoria = (int) (Math.random() * (getColumnas()*getFilas()));
//                    System.out.println(posAleatoria);
//                    System.out.println("");
                    if (cartas[posAleatoria] != 0) {
                        matrizN[i][j] = cartas[posAleatoria];
                        cartas[posAleatoria] = 0;
                        verificar = false;
                    } 
                }
            }
        }
        
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                System.out.print(matrizN[i][j]+"  ");
                
            }
            System.out.println("");
        }
    }

    public static int getColumnas() {
        return columnas;
    }

    public static void setColumnas(int columnas) {
        EstablecerMatriz.columnas = columnas;
    }

    public static int getFilas() {
        return filas;
    }

    public static void setFilas(int filas) {
        EstablecerMatriz.filas = filas;
    }
}
