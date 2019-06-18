package QLKhachHang;

public class Hotel {
    // Số ngày trọ, loại phòng trọ, giá phòng, và các thông tin cá nhân về mỗi khách trọ.
    private int soNgayO;
    private String loaiPhong;
    private Double giaPhong;

    public Hotel(){

    }

    public Hotel(int soNgayO, String loaiPhong, Double giaPhong) {
        this.soNgayO = soNgayO;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public int getSoNgayO() {
        return soNgayO;
    }

    public void setSoNgayO(int soNgayO) {
        this.soNgayO = soNgayO;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public Double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(Double giaPhong) {
        this.giaPhong = giaPhong;
    }
}
