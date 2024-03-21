import java.util.Random;

import javax.swing.event.SwingPropertyChangeSupport;

public class JogoV2 {

    public static void main(String [] args)throws Exception{
        
        var p = new Personagem();
        var p2 = new Personagem();
        var gerador = new Random();
        var p3 = new Personagem();
        p.nome = "Messi";
        p2.nome = "Soneca";
        p2.sono = 50;
        p2.energia = 1;
        p2.fome = 1;
        p3.nome = "Al Mossar";
        p3.sono = 4;
        p3.fome = 10;
        p3.energia = 2;


        while(true){
            int oQueFazer = gerador.nextInt(4);
            switch(oQueFazer){
                case 1:
                    p.comer();
                    p2.comer();
                    p3.dormir();
                    break;
                case 2:
                    p.dormir();
                    p2.cacar();
                    p3.cacar();
                    break;
                default:
                    p.cacar();
                    p2.dormir();
                    p3.comer();
                    break;
            }
            System.out.println(p);
            System.out.println(p2);
            System.out.println(p3);
            System.out.printf("*****************\n");
            Thread.sleep(3000);
        }
    }
}