package LiskovSubstitution;

public class Tavuk2 implements IYuruyenler{
    @Override
    public String yuru() {
        return "yürüdü";

        //Bu senaryoda, Tavuk için Uc() metodu erişilemez olduğu için herhangi bir sorun ile karşılaşılmayacaktır.
    }
}
