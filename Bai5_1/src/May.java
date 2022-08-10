import java.util.Scanner;

public class May {
	private static Scanner sc = new Scanner(System.in);
	private String maMay;
	private String kieuMay;
	private String tinhTrang;
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	public String getKieuMay() {
		return kieuMay;
	}
	public void setKieuMay(String kieuMay) {
		this.kieuMay = kieuMay;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public void input() {
		System.out.println("Nhap vao ma may: ");
		maMay = sc.nextLine();
		System.out.println("Nhap vao kieu may: ");
		kieuMay = sc.nextLine();
		System.out.println("Nhap vao tinh trang: ");
		tinhTrang = sc.nextLine();
	}
	public void output() {
		System.out.println("Ma may: "+maMay);
		System.out.println("Kieu may: "+kieuMay);
		System.out.println("Tinh trang: "+tinhTrang);
	}

}
