package phongHoc;

public class PhongHocLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongHocLyThuyet(String maPhong, String dayNha,
            double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    @Override
    public boolean datchuan() {
        return kiemTraCoBan() && coMayChieu;
    }
}