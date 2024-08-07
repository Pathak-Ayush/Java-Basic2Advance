public class NonStaticAccessData {

	public static  class Animal {
		String name = "tommy";
	}

	public static void main(String[] args) {
		Animal obj = new Animal();
		System.out.println(obj.name);
	}
}
