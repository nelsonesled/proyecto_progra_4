/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

/**
 *
 * @author utp
 */
public class Tablero {

    private  Casilla[][] casillas;

    public Tablero() {
        casillas = new Casilla[8][];
        for (int i = 0; i < 8; i++) {
            casillas[i] = new Casilla[8];
            for (int j = 0; j < 8; j++) {
                casillas[i][j] = new Casilla((i + j) % 2 == 0 ? Color.NEGRO : Color.BLANCO,i + 1, (char) ('A' + j));
            }
        }
    }

    public Casilla getCasilla(int fila, int columna) {
        
        return casillas[fila][columna];
    }

    public void cambiar(int posx,int posy,Casilla ficha){
        Casilla ca=new Casilla(Color.BLANCO,posy,(char)posx);
        casillas[posx][posy]=ca;
        
    }
    
   /* public void sacar(int posx, int posy){
        char ficha =(char) casillas[posy,posx];
    }*/
    
    public Casilla getCasilla(String posicion) {
        int columna = posicion.charAt(0) - 'A';
        int fila = Integer.valueOf(posicion.substring(1)) - 1;
        return getCasilla(fila, columna);
    }

}
