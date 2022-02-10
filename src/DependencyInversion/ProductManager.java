package DependencyInversion;

public class ProductManager {

    private IUretim iUretim;

    public ProductManager(IUretim iUretim) {
        this.iUretim = iUretim;
    }

    public void uret(){
        iUretim.parcalariMonteEt();
    }
}
