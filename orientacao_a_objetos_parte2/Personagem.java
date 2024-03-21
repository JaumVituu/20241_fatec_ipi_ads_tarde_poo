public class Personagem {
    String nome;
    int fome = 0;
    int energia = 10;
    int sono = 0;

    void cacar(){
        if(energia >= 2){
            System.out.printf("%s esta cacando...\n", nome);
            energia -= 2;
        }
        else{
            System.out.printf("%s esta sem energia para cacar...\n",nome);
        }
        fome = Math.min(fome+1,10);
        sono = (sono < 10)?sono + 1: 10;
    }

    void comer(){
        // if(fome >= 1){
        //     System.out.printf("%s esta comendo...\n", nome);
        //     energia = Math.min(energia + 1, 10);
        //     fome = Math.min(fome - 1, 10);
        // }
        // else{
        //     System.out.printf("%s está sem fome.", nome);
        // }
        switch(fome){
            case 0:
                System.out.printf("%s esta sem fome...\n",nome);
                break;
            default:
                System.out.printf("%s esta comendo...\n", nome);
                fome--;
                energia = energia == 10 ? energia: energia + 1;
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.printf("%s esta dormindo...\n", nome);
            sono -= 1;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.printf("%s esta sem sono...\n", nome);
        }
    }

    public String toString(){
        return String.format(
            "%s: (e:%d, f:%d, s:%d)",
            nome,energia,fome,sono
            );
        
    }
}
