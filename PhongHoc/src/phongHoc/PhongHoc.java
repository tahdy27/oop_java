package phongHoc;

public abstract class PhongHoc {
    protected String maPhong, dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha,
                    double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public PhongHoc() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    // Điều kiện chung
    public boolean kiemTraCoBan() {
        return soBongDen >= 1
            && dienTich / soBongDen >= 10;
    }

    // Bắt buộc class con triển khai
    public abstract boolean datchuan();

    @Override
    public String toString() {
        return "PhongHoc [maPhong=" + maPhong
            + ", dayNha=" + dayNha
            + ", dienTich=" + dienTich
            + ", soBongDen=" + soBongDen + "]";
    }
}