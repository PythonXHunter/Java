interface shape{
double area();
final static double pi = 3.14;
}

class Cylinder implements shape{
	double radius,height;
	Cylinder(double radius ,double height){
		this.radius = radius;
		this.height = height;
	}
	
	public double area(){
	return pi*radius*radius*height;
	}
	
	public double vol(){
	return pi*radius*radius*height;
	}
}

public class cy{
	public static void main(String args[]){
		shape s;
		s = new Cylinder(5,5);
		
		System.out.println("Area of Cylinder:" + s.area());
		System.out.println("Area of Cylinder:" + s.vol());
	}
}
