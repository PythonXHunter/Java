interface Operation{
	final static float pi = 3.14f;
	float area(float x,float y);
	float vol(int x,int y ,int z);
}

class Area implements Operation{
	public float area(float x,float y){
	return (x*y);
	}	
}

class Vol implements Operation{
	public float vol(float x,float y,float z){
	return (x*y*z*pi);
	}	
}

public class cylinder{

public static void main(String args[]){
		Area o1 = new Area();
		Vol o2 = new Vol();
		Operation op ;
		op = o1;
		System.out.println("Result Of Area= " + op.area(4,5));
		op = o2;
		
		System.out.println("Result Of Volume= " + op.area(4,5,4));
	}
}
