/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.jogodavelha;

/**
 *
 * @author henry61623916
 */
public class Tabuleiro {
    private int notaJ1;
    private int notaJ2;
    private String regras;
    private boolean houveganhadorultimarodada;
    private int jogadordavez;
    private char A1 = ' ', A2 = ' ', A3 = ' ', B1 = ' ', B2 = ' ', B3 = ' ', C1 = ' ', C2 = ' ', C3 = ' ';

    public int getJogadordavez() {
        return jogadordavez;
    }

    public void setJogadordavez(int jogadordavez) {
        this.jogadordavez = jogadordavez;
    }

    public boolean isHouveganhadorultimarodada() {
        return houveganhadorultimarodada;
    }

    public void setHouveganhadorultimarodada(boolean houveganhadorultimarodada) {
        this.houveganhadorultimarodada = houveganhadorultimarodada;
    }

    public int getNotaJ1() {
        return notaJ1;
    }

    public void setNotaJ1(int notaJ1) {
        this.notaJ1 = notaJ1;
    }

    public int getNotaJ2() {
        return notaJ2;
    }

    public void setNotaJ2(int notaJ2) {
        this.notaJ2 = notaJ2;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras; 
    }

    public Tabuleiro(String regras) {
        this.regras = regras;
        this.notaJ1 = 0;
        this.notaJ2 = 0;
        this.houveganhadorultimarodada = false;
        this.jogadordavez = 1;
    }
    
     public void verificarGanhador(char simbolo){
    if(A3 == simbolo && B2 == simbolo && C1 == simbolo){
        this.houveganhadorultimarodada = true;
    }else if (A1 == simbolo && B1 == simbolo && C1 == simbolo){
      this.houveganhadorultimarodada = true;
    }else if(A2 == simbolo && B2 == simbolo && C2 == simbolo){
        this.houveganhadorultimarodada = true;
    }else if(A3 == simbolo && B3 == simbolo && C3 == simbolo){
        this.houveganhadorultimarodada = true;
    }else if (A1 == simbolo && B2 == simbolo && C3 == simbolo){
        this.houveganhadorultimarodada = true;
    }else if(C1 == simbolo && C2 == simbolo && C3 == simbolo){
        this.houveganhadorultimarodada = true;
    }else if (C1 == simbolo && B2 == simbolo && B3 == simbolo){
          this.houveganhadorultimarodada = true;  
    }else if (A1 == simbolo && A2 == simbolo && A3 == simbolo){
       this.houveganhadorultimarodada = true;
    }else if(A1 == simbolo && B1 == simbolo && C1 == simbolo){
        this.houveganhadorultimarodada = true;
    }
    }
    
    public void organizar(){
        
    }
    
    public void mostrartabuleiro(){
        System.out.printf("""
                            A      B        C
                                ║        ║       
                     1      %c   ║   %c    ║   %c    
                                ║        ║       
                          ═══════╬═══════╬═══════
                                ║        ║       
                     2      %c   ║   %c    ║   %c    
                                ║        ║       
                          ═══════╬═══════╬═══════
                                ║        ║       
                     3      %c   ║   %c    ║   %c   
                                ║        ║       
                         """, A1, B1, C1, A2, B2, C2, A3, B3, C3);
    }
        public void marcarJogada(char simbolo, String coordenada){
            switch(coordenada){
                case "A1":
                    this.A1 = simbolo;
                    break;
                case "A2":
                    this.A2 = simbolo;
                    break;
                case "A3":
                    this.A3 = simbolo;
                    break;
                case "B1":
                    this.B1 = simbolo;
                    break;
                case "B2":
                    this.B2 = simbolo;
                    break;
                case "B3":
                    this.B3 = simbolo;
                    break;
                case "C1":
                    this.C1 = simbolo;
                    break;
                case "C2":
                    this.C2 = simbolo;
                    break;
                case "C3":
                    this.C3 = simbolo;
                    break;
                
            }
        }
    }
