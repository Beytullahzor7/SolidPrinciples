package Interfacex;

public class Forvet implements IFutbolcu{
    @Override
    public void DefansYap() {
        System.out.println("Defans yap");
    }

    @Override
    public void PenaltiKurtar() {
        System.out.println("Penaltı kurtar");

    }

    @Override
    public void GolAt() {
        System.out.println("Gol at");

    }
}

//Yukarıdaki örnekte yapılan yanlışı şimdi düzeltelim.
// Interfaceleri parçalara ayrılalım ve
// olması gerektiği kadar interfaci  classlara implemente edelim.