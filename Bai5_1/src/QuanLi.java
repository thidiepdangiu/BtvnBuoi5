import java.util.Scanner;

public class QuanLi {
	private static Scanner sc = new Scanner(System.in);
	private int maQL;
	private String hoTen;
	public int getMaQL() {
		return maQL;
	}
	public void setMaQL(int maQL) {
		this.maQL = maQL;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void input() {
		System.out.println("Nhap vao ma quan li: ");
		maQL = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao ho ten: ");
		hoTen = sc.nextLine();
	}
	public void output() {
		System.out.println("Ma quan li: "+maQL);
		System.out.println("Ho ten: "+hoTen);
	}

}
