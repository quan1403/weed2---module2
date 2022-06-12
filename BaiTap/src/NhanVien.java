import java.sql.Date;

public class NhanVien extends Canbo {
    private String CongViec;

    public NhanVien() {

    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    public NhanVien(String name,Date date, int address, String congViec) {
        super(name, date, address);
        CongViec = congViec;

    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "CongViec='" + CongViec + '\'' +super.toString()+
                '}';
    }
}
