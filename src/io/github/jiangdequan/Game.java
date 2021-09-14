package io.github.jiangdequan;

import java.util.Scanner;

public class Game{
    
    public void sistem(){
        
        Game m = new Game();
        Caracter p = new Caracter();
       System.out.println("a luta começou!");
    
       p.Player();
       
       
       System.out.println();
       Caracter i = new Caracter();
       i.Inimigo();
    
       System.out.println();
        System.out.println("---------DICAS-----------");
        if(p == i){

            System.out.println("oi");

        }else{
            System.out.println("ERROR Inteiro Inválido!");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       Game m = new Game();
      m.sistem();
    }
    
}