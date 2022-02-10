package DependencyInversion;

public class Main {
    public static void main(String[] args) {
        IUretim motorsiklet = new Motorsiklet();
        IUretim traktor = new Traktor();

        motorsiklet.parcalariMonteEt();
        traktor.parcalariMonteEt();

    }
}
