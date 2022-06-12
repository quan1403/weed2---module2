import java.sql.Date;
public class CongNhan extends Canbo {
    private int rank;

public CongNhan(){

}
 public CongNhan(String name, Date date, int address, int rank) {
        super(name, date, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "rank='" + rank + '\'' +super.toString()+
                '}';
    }
}







