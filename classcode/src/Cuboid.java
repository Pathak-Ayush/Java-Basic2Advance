import java.util.Scanner;

public class Cuboid {
//	data member of the class


 	static double  length;
	static  double breadth ;
	 static  double height;

	Cuboid(double length,double breadth,double height){
		this.length= length;
		this.breadth = breadth;
		this.height = height;
	}

	public  static double volume(){
		double volume = length* breadth * height;
		return volume;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the  of the cuboid");
		double length = sc.nextDouble();
		System.out.println("Enter the height of the cuboid");
		double breadth =sc.nextDouble();
		System.out.println("Enter the height of the cuboid");
		double height = sc.nextDouble();

//		create the object of the class Cuboid
		Cuboid  obj1 = new Cuboid(length,breadth,height);
		System.out.println("volume of the cuboid :"+obj1.volume());
	}
}