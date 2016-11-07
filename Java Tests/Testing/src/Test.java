import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

public class Test {
	private static int x = 0;
	private static Point p;
	public int a;
	

	public Test() {
		a = 4;
	}
	
	public Test(int a_) {
		a = 5;
		new Test();
	}

	public static Point pos() {
		return Test.p;
	}

	public static void main(String[] args) {
		Test x = new Test(10);
		System.out.println(x.a);
		/*Test s = new Test();
		s.a = 5;
		try {
			int b = (Integer) Test.class.getField("a").get(s);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

	public static void p(Object o) {
		System.out.println(o);
	}
}
