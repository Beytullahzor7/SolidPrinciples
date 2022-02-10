package Interfacex;

public class Kaleci implements IFutbolcu{
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
