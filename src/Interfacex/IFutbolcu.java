package Interfacex;

public interface IFutbolcu {
    void DefansYap();
    void PenaltiKurtar();
    void GolAt();

    /* Futbolcu örneğinde farklı mevkilerde oynayan oyunculara nerdeyse tüm görevler verilmek zorunda kalınmıştır.
    Farklı mevkilerde oynayan futbolculara bulunan zorla olmaması gereken görevler yüklenmemelidir.
    Bu yüzden interface leri ayırmalıyız ve olması gereken kadar implemente etmeliyiz.
     */
}
