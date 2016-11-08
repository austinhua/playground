
public class PrintFormatting {

	public PrintFormatting() {
	}

	public static void main(String[] args) {
		double dblTotal = 1234567890.098432123;
		System.out.printf("Total is: $%,.2f%n", dblTotal);
		System.out.printf("Total: %10.2f: %n", dblTotal);
		System.out.printf("% 4d%n", (int)dblTotal);
		System.out.printf("%10h%n", dblTotal);
	}

}
