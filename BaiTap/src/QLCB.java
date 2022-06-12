import java.sql.Date;
import java.util.Scanner;
public class QLCB {
    Canbo[] canbos = new Canbo[0];
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("Menu");
        System.out.println("1.Nhập thông tin mới cho cán bộ");
        System.out.println("2.Tìm kiếm theo họ tên");
        System.out.println("3.Hiển thị thông tin cán bộ tìm được");

        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                System.out.println("1.Tạo công nhân");
                System.out.println("2.Tạo kỹ sư");
                System.out.println("3.Tạo nhân viên");
            case 2:
                for (Canbo cb:canbos){
                System.out.println(cb);
            }

            case 3:
                for (Canbo cb:canbos){
                    System.out.println(cb);
                }


                int choice1 = Integer.parseInt(sc.nextLine());
                switch (choice1) {
                    case 1:
                        Canbo canbo1 = create(1);
                        add(canbo1);
                        break;
                    case 2:
                        Canbo canbo2 = create(2);
                        add(canbo2);
                        break;
                    case 3:
                        Canbo canbo3 = create(3);
                        add(canbo3);
                        break;
                }
                break;
        }

    }

    public Canbo create(int ChucVu) {
        System.out.println("nhập tên ");
        String name = sc.nextLine();
        System.out.println(" Ngày sinh");
        int ngaySinh = Integer.parseInt(sc.nextLine());
        System.out.println(" Tháng sinh");
        int thangSinh = Integer.parseInt(sc.nextLine());
        System.out.println(" Năm sinh");
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ ");
        int address = Integer.parseInt(sc.nextLine());

        if (ChucVu==1){
            System.out.println("Nhập Ngành Đào Tạo");
            String nganhDaoTao = sc.nextLine();
            return new KySu(name,new Date(namSinh-1900,thangSinh-1,ngaySinh),address,nganhDaoTao);
        }else if (ChucVu==2){
            System.out.println("Nhập Bậc");
            int rank = Integer.parseInt(sc.nextLine());
            return new CongNhan(name,new Date(namSinh-1900,thangSinh-1,ngaySinh),address,rank);
        }else if (ChucVu==3){
            System.out.println("Nhập Công Việc");
            String nhapCongViec = sc.nextLine();
            return new NhanVien(name,new Date(namSinh-1900,thangSinh-1,ngaySinh),address,nhapCongViec);
        }else {
            System.out.println("Nhập lại");
            return null;
        }

    }
    public void add(Canbo canbo){
        Canbo[] newCB = new Canbo[canbos.length+1];

        for (int i =0; i < canbos.length;i++){
            newCB[i] = canbos[i];

        }
        newCB[newCB.length-1]=canbo;
        canbos = newCB;
    }
    public void search(Canbo canbo){
        System.out.println("Nhập tên cán bộ cần tìm kiếm");
        String name = sc.nextLine();

    }



    }




