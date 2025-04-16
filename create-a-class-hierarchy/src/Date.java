public class Date {
    int dd;
    int mm;
    int yy;

    public Date(int d, int m, int y) {
        this.dd = d;
        this.mm = m;
        this.yy =y;
    }

    public String getDate(){
        return toString();
    }

    @Override
    public String toString() {
        return dd + "/" + mm + "/" + yy;
    }    

}
