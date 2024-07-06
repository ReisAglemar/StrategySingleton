package strategy;

public class Personagem {

    private Faz compotamento;

    public void setCompotamento(Faz compotamento) {
        this.compotamento = compotamento;
    }

    public void faz (){
        compotamento.faz();
    }
}
