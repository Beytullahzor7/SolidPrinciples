package DependencyInversion;

public class Uretim {
    public void UretimYap(){
        Araba araba = new Araba();
        araba.ParcalariMonteEt();
    }
}


class Araba{
    public boolean ParcalariMonteEt(){
        //Montaj işlemleri..
        return true;
    }
}

/*Uretim high-level class tır. Araba ise low-level class tır. Dolayısıyla Uretim class’ı
içerisindeki UretimYap() metodu içindeki işlemler Araba class’ındaki ParcalariMonteEt() metoduna bağlıdır.
 Araba class’ındaki metodlarda yapılacak olan değişiklikler üst class’ı da etkilemektedir.
 Yani, Araba class’ına herhangi bir metod eklediğimizde gerektiğinde yine Uretim class’ındaki UretimYap() metodunda da
 metod eklememiz gerekecektir. Yine bir bağımlılık söz konusudur. Dolayısıyla, bu durum Dependency Inversion Prensibi’ne aykırıdır.
 */