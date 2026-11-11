package qlKH;

import java.time.LocalDate;

public abstract class KhachHang {
    protected String maKhachHang;
    protected String hoTen;
    protected LocalDate ngayLapHoaDon;
    protected double soKW;
    protected double donGia;

    public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.soKW = soKW;
        this.donGia = donGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public double getSoKW() {
        return soKW;
    }

    public void setSoKW(double soKW) {
        this.soKW = soKW;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public abstract double thanhTien();

    @Override
    public String toString() {
        return "maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", ngayLapHoaDon=" + ngayLapHoaDon
                + ", soKW=" + soKW + ", donGia=" + donGia;
    }
}