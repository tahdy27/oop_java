package qlKH;

public class DanhSachKhachHang {
    private KhachHang[] ds;
    private int count;

    public DanhSachKhachHang(int n) {
        ds = new KhachHang[n];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void kiemTra() {
        if (ds.length == count) {
            KhachHang[] temp = new KhachHang[ds.length * 2];
            System.arraycopy(ds, 0, temp, 0, count);
            ds = temp;
        }
    }

    public void them(KhachHang a) {
        for (int i = 0; i < count; i++) {
            if (ds[i].getMaKhachHang().equals(a.getMaKhachHang())) {
                System.out.println("ma khach hang bi trung");
                return;
            }
        }
        kiemTra();
        ds[count] = a;
        count++;
    }

    public void xoa(String a) {
        for (int i = 0; i < count; i++) {
            if (ds[i].getMaKhachHang().equals(a)) {
                for (int j = i; j < count - 1; j++) {
                    ds[j] = ds[j + 1];
                }
                ds[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("khong co khach hang co ma khach hang nhu the");
    }

    public void capNhat(String a, double gia) {
        for (int i = 0; i < count; i++) {
            if (ds[i].getMaKhachHang().equals(a)) {
                ds[i].setDonGia(gia);
                return;
            }
        }
        System.out.println("khong co khach hang co ma khach hang nhu the");
    }

    public void sapXep() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (ds[i].getMaKhachHang().compareTo(ds[j].getMaKhachHang()) > 0) {
                    KhachHang temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }

    public void in() {
        for (int i = 0; i < count; i++) {
            System.out.println(ds[i]);
        }
    }
}