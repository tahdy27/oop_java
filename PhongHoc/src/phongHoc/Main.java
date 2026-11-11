
package phongHoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyPhongHoc ql = new QuanLyPhongHoc();

        int chon;

        do {
            System.out.println("\n===== QUAN LY PHONG HOC =====");
            System.out.println("1. Hien thi danh sach");
            System.out.println("2. Tim phong theo ma");
            System.out.println("3. Them phong hoc");
            System.out.println("4. Liet ke phong dat chuan");
            System.out.println("5. Sap xep theo day nha");
            System.out.println("6. Sap xep dien tich giam dan");
            System.out.println("7. Sap xep so bong den tang dan");
            System.out.println("8. Cap nhat so may tinh");
            System.out.println("9. Xoa phong hoc");
            System.out.println("10. Tinh tong so phong");
            System.out.println("11. Liet ke phong co 60 may");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    ql.hienThiTatCa();
                    break;

                case 2:
                    System.out.print("Nhap ma phong can tim: ");
                    String maTim = sc.nextLine();

                    PhongHoc p = ql.timPhong(maTim);

                    if (p == null) {
                        System.out.println("Khong tim thay!");
                    } else {
                        System.out.println(p);
                        System.out.println("Dat chuan: "
                            + p.datchuan());
                    }
                    break;

                case 3:
                    System.out.println(
                        "Chuc nang them phong: "
                        + "hay chon loai phong va nhap cac thuoc tinh."
                    );
                    break;

                case 4:
                    ql.hienThi(ql.layPhongDatChuan());
                    break;

                case 5:
                    ql.sapXepTheoDayNha();
                    ql.hienThiTatCa();
                    break;

                case 6:
                    ql.sapXepDienTichGiamDan();
                    ql.hienThiTatCa();
                    break;

                case 7:
                    ql.sapXepSoBongDenTangDan();
                    ql.hienThiTatCa();
                    break;

                case 8:
                    System.out.print("Nhap ma phong: ");
                    String maCN = sc.nextLine();

                    System.out.print("Nhap so may tinh moi: ");
                    int soMay = sc.nextInt();
                    sc.nextLine();

                    if (ql.capNhatSoMayTinh(maCN, soMay)) {
                        System.out.println("Cap nhat thanh cong!");
                    } else {
                        System.out.println(
                            "Khong tim thay phong may tinh "
                            + "hoac so may khong hop le!"
                        );
                    }
                    break;

                case 9:
                    System.out.print("Nhap ma phong can xoa: ");
                    String maXoa = sc.nextLine();

                    if (ql.timPhong(maXoa) == null) {
                        System.out.println("Khong tim thay phong!");
                        break;
                    }

                    System.out.print(
                        "Ban chac chan muon xoa? (Y/N): "
                    );
                    String xacNhan = sc.nextLine();

                    if (xacNhan.equalsIgnoreCase("Y")) {
                        System.out.println(
                            ql.xoaPhong(maXoa)
                                ? "Da xoa phong!"
                                : "Xoa that bai!"
                        );
                    } else {
                        System.out.println("Da huy thao tac xoa.");
                    }
                    break;

                case 10:
                    System.out.println(
                        "Tong so phong: " + ql.tinhTongSoPhong()
                    );
                    break;

                case 11:
                    ql.hienThi(ql.layPhongCo60May());
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
