
public class ConcreteClass {
	public  static class  Dog{
		String name ;
		int age ;
		// constructor
		Dog(String name,int age){
			this.name= name;
			this.age= age;
		}
		public  void bark(){
			System.out.println("wolf ! ");
		}
	}
	public static void main(String[] args) {
		System.out.println("welcome to learn about the concrete class   in the java ");
        //call the function bark
		Dog obj = new Dog("tommy",12);
		obj.bark();
	}

}

/*

	⭐⭐⭐ what is the concrete class in the java
	the class in which declaration and initialization both are in the
	same  class

 */