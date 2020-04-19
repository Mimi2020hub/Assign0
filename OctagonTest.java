import static org.junit.Assert.*;
import org.junit.Test;

public class OctagonTest {
	@Test
	public void test1() {
		Octagon oct1 = new Octagon(1.00);
		double side=1.00;
		double area =oct1.getArea();
		double perimeter=oct1.getPerimeter();
		assertEquals(4.83,area,0.01);
		assertEquals(8.00,perimeter,0.01);
	}
}
