package polymorphism.prob02;


public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		shape[0] = new Rectangular(20, 10);
		shape[1] = new Circle(10);
		for (Shape s : shape) {
			s.print();
		}
		
	}
}