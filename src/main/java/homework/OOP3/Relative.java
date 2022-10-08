package homework.OOP3;

public class Relative{
    private human h1;
    private human h2;
    private Relation r;



    public Relative(human h1, human h2, Relation r) {
        this.h1 = h1;
        this.h2 = h2;
        this.r = r;
    }

    public human getH1() {
        return h1;
    }


    @Override
    public String toString() {
        return h1 +" "+h2 +" " + r;
    }
}
