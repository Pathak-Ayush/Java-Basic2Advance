import java.util.Scanner;

public class IntroClass {

	// Define the Animal class as a static inner class
	public static class Animal {
		// fields -> this is also know as the data member and attributes of the class
		String name;
		int age;
		float weight;

		// Create the constructor
		//  is created while creating the object of the
		public Animal(String name, int age, float weight) {
			this.name = name;
			this.age = age;
			this.weight = weight;
		}

		// Method to display animal information
		public void displayInfo() {
			System.out.println("Name of the animal: " + name + "\nWeight: " + weight + "\nAge: " + age);
		}
	}

	public static void main(String[] args) {
		// Create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the animal:");
		String name = sc.next();

		System.out.println("Enter the age of the animal:");
		int age = sc.nextInt();

		System.out.println("Enter the weight of the animal:");
		float weight = sc.nextFloat(); // Changed to nextFloat() to match the type of weight

//		 object of the Animal
		Animal obj = new Animal(name, age, weight);

//
		obj.displayInfo();
	}
}

/*
⭐⭐⭐⭐⭐⭐   type of the classes in the ⭐⭐⭐⭐⭐
1  concrete class
2. abstract class
3. interface class
4. nested class
5 enum class
6 static nested class
7 Anonymous Class
8.local class
*/