import java.util.Scanner;

public class Student {
	private static Scanner sc = new Scanner(System.in);
	private int id;
	private String name;
	private int age;
	private Address x = new Address();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getX() {
		return x;
	}

	public void setX(Address x) {
		this.x = x;
	}

	public void input() {
		System.out.print("Nhap vao id student: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vao ten: ");
		name = sc.nextLine();
		System.out.print("Nhap vao tuoi: ");
		age = sc.nextInt();
		x.input();
	}

	public void output() {
		System.out.println("Id Student: " + id);
		System.out.println("Ten: " + name);
		System.out.println("Tuoi: " + age);
		x.output();
	}

	public static void main(String[] args) {
		int lc;
		int n;
		System.out.print("Nhap vao so nguyen n: ");
		n = sc.nextInt();
		Student a[] = new Student[n];
		System.out.println("Nhap thong tin sinh vien.");
		for (int i = 0; i < n; i++) {
			System.out.println("Sinh vien thu " + (i + 1) + ":");
			a[i] = new Student();
			a[i].input();
			for (int j = 0; j < i; j++) {
				while (a[i].id == a[j].id) {
					System.out.println("id bi trung,moi nhap lai: ");
					a[i].setId(sc.nextInt());
				}
			}
		}
		do {
			System.out.println("---------Menu---------\n" + "1.Hien thi thong tin cac sinh vien ra man hinh.\n"
					+ "2.Tim kiem sinh vien theo id va hien thi ra man hinh.\n" + "3.Sua thong tin.\n"
					+ "4.Xoa sinh vien theo id.\n" + "5.Ket thuc chuong trinh.");

			do {
				System.out.print("Moi nhap vao lua chon: ");
				lc = sc.nextInt();
			} while (lc > 5 || lc < 1);
			switch (lc) {
			case 1: {
				System.out.println("Thong tin cac sinh vien");
				for (int i = 0; i < n; i++) {
					a[i].output();
					System.out.print("\n");
				}
				break;
			}
			case 2: {
				int id1;
				int count1 = 0;
				System.out.println("Moi nhap vao id: ");
				id1 = sc.nextInt();
				for (int i = 0; i < n; i++) {
					int d = a[i].getId();
					if (id1 == d) {
						a[i].output();
						count1++;
					}
				}
				if (count1 == 0) {
					System.out.println("Khong co sinh vien nao");
				}
				break;
			}
			case 3: {
				int count2 = 0;
				for (int i = 0; i < n; i++) {
					if (a[i].x.getProvince().equals("Thanh Hoa")) {
						a[i].x.setProvince("Hai Phong");
						count2++;
					}
				}
				if (count2 == 0)
					System.out.println("Khong co sinh vien Thanh Hoa nao");
				System.out.println("\nDanh sach sinh vien sau khi sua:");
				for (int i = 0; i < n; i++) {
					a[i].output();
				}
				break;
			}
			case 4: {
				int id2;
				System.out.println("Nhap id sinh vien can xoa:");
				id2 = sc.nextInt();
				for (int i = 0; i < n; i++) {
					if (id2 == a[i].getId()) {
						for (int z = i; z < n - 1; z++) {
							a[z] = a[z + 1];
						}
						n--;
					}
				}
				System.out.println("Danh sach sinh vien sau khi xoa:");
				for (int i = 0; i < n; i++) {
					a[i].output();
				}
				break;
			}
			}
		} while (lc != 5);
	}
}
