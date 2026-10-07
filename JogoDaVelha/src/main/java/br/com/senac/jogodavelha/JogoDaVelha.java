/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author henry61623916
 */
public class JogoDaVelha {

    public static void main(String [] args){
        
         
        Scanner entrada = new Scanner (System.in);
        Tabuleiro tabuleiro = new Tabuleiro ("1 - Cada jogador deve escolher um simbolo;" + "2 - O jogador 1 inicia a partida");
        
        Jogador Jogador1 = new Jogador (1,"Henry", 'X');
        Jogador Jogador2 = new Jogador (2, "Ribeiro", 'O');
        
        tabuleiro.mostrartabuleiro();
        
        do{
            
           if (tabuleiro.getJogadordavez() == 1){
                System.out.println("Jogador1, escolha onde jogar: ");
                String local = entrada.nextLine();
                
                tabuleiro.marcarJogada(Jogador1.getSimbolo(), local);
                
                tabuleiro.setJogadordavez(2);
                
                tabuleiro.mostrartabuleiro();
                
                tabuleiro.verificarGanhador(Jogador1.getSimbolo());
            }
            
           
           
           
           
           
           
           
           else {
                System.out.println("Jogador2, escolha onde jogar: ");
                
                    String local = entrada.nextLine();
                
                tabuleiro.marcarJogada(Jogador2.getSimbolo(), local);
                
                tabuleiro.setJogadordavez(1);
                
                tabuleiro.mostrartabuleiro();
                
                tabuleiro.verificarGanhador(Jogador2.getSimbolo());
                
                
            }        } while(tabuleiro.isHouveganhadorultimarodada() == false);
        
        
    }
}
