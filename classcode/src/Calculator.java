public class Calculator {
	static int  num2 = 1000;
	// this is the data member or member variables
	Calculator(){
		System.out.println("constructor called");
	}

	{
		System.out.println("block code executed");
	}

	static {
		int num2 = 34000;
		System.out.println(num2);
	}

	public  int Sum(int a,int b){
		return  a+b;
	}

	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		int sumData =obj1.Sum(23,234);
		System.out.println("The sum of the two number is "+ sumData);
		System.out.println(num2);
	}
}


//access modifiers in the java
// dp3
// default
// public
//private
// protected

// static function ->