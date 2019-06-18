package QLKhachHang;

public class People {
    private String ten;
    private int age;
    private String address;
    private int    idNumberCMT;

    public People(){

    }

    public People(String ten, int age, String address, int idNumber) {
        this.ten = ten;
        this.age = age;
        this.address = address;
        this.idNumberCMT = idNumber;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdNumber() {
        return idNumberCMT;
    }

    public void setIdNumber(int idNumber) {
        this.idNumberCMT = idNumber;
    }

    @Override
    public String toString() {
        return "People{" +
                "ten='" + ten + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", idNumberCMT=" + idNumberCMT +
                '}';
    }
}
