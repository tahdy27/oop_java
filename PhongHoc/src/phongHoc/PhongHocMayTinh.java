package phongHoc;

public class PhongHocMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongHocMayTinh(String maPhong, String dayNha,
            double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public boolean datchuan() {
        return kiemTraCoBan()
            && soMayTinh > 0
            && dienTich / soMayTinh >= 1.5;
    }
}