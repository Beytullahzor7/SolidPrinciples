package DependencyInversion;

public class Motorsiklet implements IUretim{
    @Override
    public boolean parcalariMonteEt() {
        return true;
    }
}

//Üretimden sorumlu ProductManager class’ımızı oluşturuyoruz ve bu class’ımızı IUretim interface’ine bağlı hale getiriyoruz.
// Böylece IProduct interface’inden implement olmuş tüm class’lar ProductManager tarafından kullanılabilecektir.
