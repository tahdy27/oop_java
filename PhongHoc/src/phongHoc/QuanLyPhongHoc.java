package phongHoc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLyPhongHoc {
    private List<PhongHoc> dsPhong;

    public QuanLyPhongHoc() {
        dsPhong = new ArrayList<>();
    }

    public boolean themPhong(PhongHoc p) {
        if (timPhong(p.getMaPhong()) != null) {
            return false;
        }
        dsPhong.add(p);
        return true;
    }

    public PhongHoc timPhong(String maPhong) {
        for (PhongHoc p : dsPhong) {
            if (p.getMaPhong().equalsIgnoreCase(maPhong)) {
                return p;
            }
        }
        return null;
    }

    public List<PhongHoc> getDanhSach() {
        return new ArrayList<>(dsPhong);
    }

    public List<PhongHoc> layPhongDatChuan() {
        List<PhongHoc> kq = new ArrayList<>();

        for (PhongHoc p : dsPhong) {
            if (p.datchuan()) {
                kq.add(p);
            }
        }
        return kq;
    }

    public void sapXepTheoDayNha() {
        dsPhong.sort(
            Comparator.comparing(
                PhongHoc::getDayNha,
                String.CASE_INSENSITIVE_ORDER
            )
        );
    }
    public void sapXepDienTichGiamDan() {
        dsPhong.sort(
            Comparator.comparingDouble(PhongHoc::getDienTich)
                      .reversed()
        );
    }

    public void sapXepSoBongDenTangDan() {
        dsPhong.sort(
            Comparator.comparingInt(PhongHoc::getSoBongDen)
        );
    }

    public boolean capNhatSoMayTinh(String maPhong, int soMayMoi) {
        if (soMayMoi < 0) {
            return false;
        }

        PhongHoc p = timPhong(maPhong);

        if (p instanceof PhongHocMayTinh) {
            ((PhongHocMayTinh) p).setSoMayTinh(soMayMoi);
            return true;
        }

        return false;
    }

    public boolean xoaPhong(String maPhong) {
        PhongHoc p = timPhong(maPhong);

        if (p == null) {
            return false;
        }

        return dsPhong.remove(p);
    }

    public int tinhTongSoPhong() {
        return dsPhong.size();
    }

    public List<PhongHocMayTinh> layPhongCo60May() {
        List<PhongHocMayTinh> kq = new ArrayList<>();

        for (PhongHoc p : dsPhong) {
            if (p instanceof PhongHocMayTinh) {
                PhongHocMayTinh mt = (PhongHocMayTinh) p;

                if (mt.getSoMayTinh() == 60) {
                    kq.add(mt);
                }
            }
        }

        return kq;
    }

    public void hienThi(List<? extends PhongHoc> ds) {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (PhongHoc p : ds) {
            System.out.println(p);
            System.out.println("Dat chuan: "
                + (p.datchuan() ? "Co" : "Khong"));
        }
    }

    public void hienThiTatCa() {
        hienThi(dsPhong);
    }
}
