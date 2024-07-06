import singleton.Singleton;
import strategy.Personagem;
import strategy.Strategy1;
import strategy.Strategy2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        //sigleton
//        Singleton.SingletonHolder teste = Singleton.getInstance();
//        System.out.println(teste);
//        teste = Singleton.getInstance();
//        System.out.println(teste);

        Strategy1 s1 = new Strategy1();
        Strategy2 s2 = new Strategy2();
        Personagem personagem = new Personagem();

        personagem.setCompotamento(s1);
        personagem.faz();
        personagem.setCompotamento(s2);
        personagem.faz();


    }
}