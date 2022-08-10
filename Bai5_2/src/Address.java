import java.util.Scanner;

public class Address {
	private static Scanner sc = new Scanner(System.in);
	private int id;
	private String district;
	private String province;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void input() {
		System.out.print("Nhap vao id address: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vao quan/huyen: ");
		district = sc.nextLine();
		System.out.print("Nhap vao tinh/thanh pho: ");
		province = sc.nextLine();

	}
	public void output() {
		System.out.println("Id Address: "+id);
		System.out.println("Quan/Huyen: "+district);
		System.out.println("Tinh/Thanh pho: "+province);
	}

}
