import java.lang.Math;

//Represents octagon shapes.
public class Octagon implements Shape {
	
	private double side;
	
	//constructs a new octagon with the given side
	public Octagon(double side) {
		this.side=side;
	}
	
	//returns the area of this octagon
	public double getArea() {
		double area=2*(1+Math.sqrt(2))*Math.pow(side, 2);
		return area;
	}
	
	//returns the perimeter of this octagon
	public double getPerimeter() {
		double perimeter=8*side;
		return perimeter;
	}
	public static void main(String[] args) {
		Octagon oct1= new Octagon(1);
		double side=1;
		System.out.printf("Area is: 2*(1+Math.sqrt(2))*Math.pow(%.2f, 2)=%.2f \n",side,oct1.getArea());
		System.out.printf("Perimeter is: 8*%.2f=%.2f \n",side,oct1.getPerimeter());
	}
}
