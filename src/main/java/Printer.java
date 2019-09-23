public class Printer {

    private int paper = 100;
    private int toner = 10;

    public boolean print(int pages, int copies) {
        int total = pages * copies;
        if (total <= this.paper){
            this.toner -= total;
            this.paper -= total;
            return true;
        }
        return false;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

}
