import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator2 {
	public  int sum(int n1,int n2){
		return n1+n2;
	}

	public static void main(String[] args) {
        //create the object of the class
		Calculator2 obj = new Calculator2();
//		System.out.println(obj);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number n1 ");
		int n1 = sc.nextInt();
		System.out.println("Enter your number n2 ");
		int n2 = sc.nextInt();
		System.out.println("the sum of the Enter your number:"+obj.sum(n1,n2));
	}
}
