import java.util.Scanner;

public class PhongMay {
	private static Scanner sc = new Scanner(System.in);
	private String maPhong;
	private String tenPhong;
	private String dienTich;
	private QuanLi x = new QuanLi();
	private May y = new May();
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getDienTich() {
		return dienTich;
	}
	public void setDienTich(String dienTich) {
		this.dienTich = dienTich;
	}
	public QuanLi getX() {
		return x;
	}
	public void setX(QuanLi x) {
		this.x = x;
	}
	public May getY() {
		return y;
	}
	public void setY(May y) {
		this.y = y;
	}
	public void input() {
		System.out.println("Nhap ma phong: ");
		maPhong = sc.nextLine();
		System.out.println("Nhap ten phong: ");
		tenPhong = sc.nextLine();
		System.out.println("Nhap dien tich: ");
		dienTich = sc.nextLine();
		x.input();
		y.input();		
	}
	public void output() {
		System.out.println("Ma phong: "+maPhong);
		System.out.println("Ten phong: "+tenPhong);
		System.out.println("Dien tich: "+dienTich);
		x.output();
		y.output();
	}
	public static void main(String[] args) {
		PhongMay a = new PhongMay();
		a.input();
		a.output();
	}

}
