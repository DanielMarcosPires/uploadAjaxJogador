package io.github.jiangdequan;

import java.util.Scanner;

public class Caracter {
    private int life = 100;
    private int Inimigolife = 100;
   
    public void Player(){
        
        System.out.println("o Jogador foi iniciado");
        System.out.println("Vida");//Vida do jogador
        this.StatsPlayer();
    }
    private void StatsPlayer(){
        System.out.println(this.life);
        System.out.println("Stamina: "+50);
        System.out.println("[][][][][][]");

    }
    public void Inimigo(){
        System.out.println("O Inimigo foi avistado");
        System.out.println("Vida");//vida do Inimigo
        this.StatsInimigo();
    }
    private void StatsInimigo(){
        System.out.println(this.Inimigolife);
        System.out.println("Stamina: "+100);
        System.out.println("[][][][][][]");
    }
    
    
}
