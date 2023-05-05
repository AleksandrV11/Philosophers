package Task10;

public class Filosofi {

    int ind;
    boolean levay;
    boolean pravay;

    public Filosofi(int ind) {
        this.ind = ind;
    }

    public int getPerson() {
        return ind;
    }

    public void setPerson(String person) {
        this.ind = ind;
    }

    public boolean getLevay() {
        return levay;
    }

    public void setLevay(String levay) {
        this.levay = Boolean.parseBoolean(levay);
    }

    public boolean getPravay() {
        return pravay;
    }

    public void setPravay(String pravay) {
        this.pravay = Boolean.parseBoolean(pravay);
    }

    @Override
    public String toString() {
        return "Person{" +
                "filosof='" + ind + '\'' +
                ", levay='" + levay + '\'' +
                ", pravay='" + pravay + '\'' +
                '}';
    }



}
