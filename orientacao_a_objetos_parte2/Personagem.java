public class Personagem {
    String nome;
    int fome;
    int energia;
    int sono;

    void cacar(){
        System.out.printf("%d esta cacando...\n", nome);
    }

    void comer(){
        System.out.printf("%d esta comendo...\n", nome);
    }

    void dormir(){
        System.out.printf("%d esta dormindo...\n", nome);
    }
}
