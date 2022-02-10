package LiskovSubstitution;

public class Guvercin2 implements IYuruyenler, IUcanlar{

    @Override
    public String uc() {
        return "Uctu";
    }

    @Override
    public String yuru() {
        return "Yurudu";
    }
}
