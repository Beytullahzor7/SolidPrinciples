package LiskovSubstitution;

public abstract class Kus {

    public abstract String Uc();
    public abstract String Yuru();


    public static void main(String[] args) {
        Kus kanatlı = new Guvercin();
        kanatlı.Uc();
        kanatlı.Yuru();
        kanatlı = new Tavuk();
        kanatlı.Uc(); //Bu metod çağırıldığında throw new NotImplementedException()
                      //hatası fırlatacaktır. Çünkü kullanılmakta fakat metodun içi boş olduğu için bu durum oluşmuştur.
                      //Yani kalıtım alınan class’ın içindeki özellikler kalıtımı alan class ta kullanılmalıdır.
                      //Yukarıdaki örnekte İlgili metod Guvercin için düzgün çalışmakta olup, tavuk için sorun olacaktır.
        kanatlı.Yuru();
    }
}

class Tavuk extends Kus{

    @Override
    public String Uc() {
        return "ImplementHata";
    }

    @Override
    public String Yuru() {
        return "Yürü";
    }
}

class Guvercin extends Kus{

    @Override
    public String Uc() {
        return "Uc";
    }

    @Override
    public String Yuru() {
        return "Yürü";
    }
}


