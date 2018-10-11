import java.util.Date;

public class HoaQua {
    private double price;
    private double weight;
    private String origin;
    private Date ngaynhap;
    private int soluong;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static void main(String[] args) {
        HoaQua q1 = new HoaQua();
        QuaTao q2 = new QuaTao();
        QuaCam q3 = new QuaCam();
        CamSanh q4 = new CamSanh();
        CamCaoPhong q5 = new CamCaoPhong();
        System.out.println("finish");
    }
    
}
