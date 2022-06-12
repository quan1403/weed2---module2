import java.sql.Date;

public class Canbo {
    private String name;
    private Date date;
    private int address;

    public Canbo(String name, Date date, int address) {
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public Canbo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", address=" + address +
                '}';
    }
}


