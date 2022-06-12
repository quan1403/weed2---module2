import java.sql.Date;

public class KySu extends Canbo {
    private String NganhDaoTao;

    public KySu() {

    }

    public KySu(String name, Date date,int address, String nganhDaoTao) {
        super(name, date, address);
        NganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "NganhDaoTao='" + NganhDaoTao + '\'' +super.toString()+
                '}';
    }
}
