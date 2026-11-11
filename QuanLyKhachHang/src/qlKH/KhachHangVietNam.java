package qlKH;

import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang {
    private String doiTuong;
    private double dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
                            String doiTuong, double dinhMuc) {
        super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double thanhTien() {
        return soKW <= dinhMuc
                ? soKW * donGia
                : dinhMuc * donGia + (soKW - dinhMuc) * donGia * 2.5;
    }
}
