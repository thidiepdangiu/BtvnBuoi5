import java.util.Scanner;

public class KiemTraSnt {

	public static boolean isPrime(int n) {
		int count = 0;
		if (n < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 0)
				return true;
			else
				return false;
		}
	}

	public static boolean isPrime(long n) {
		int count = 0;
		if (n < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 0)
				return true;
			else
				return false;
		}
	}

	public static boolean isPrime(float n) {
		return false;
	}

	public static boolean isPrime(double n) {
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KiemTraSnt test = new KiemTraSnt();
		int a;
		long b;
		float c;
		double d;
		System.out.print("Nhap a: ");
		a = sc.nextInt();
		System.out.println(test.isPrime(a));
		System.out.print("Nhap b: ");
		b = sc.nextLong();
		System.out.println(test.isPrime(b));
		System.out.print("Nhap c: ");
		c = sc.nextFloat();
		System.out.println(test.isPrime(c));
		System.out.print("Nhap d: ");
		d = sc.nextDouble();
		System.out.println(test.isPrime(d));
	}

}
