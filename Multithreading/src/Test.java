public class Test extends  Thread {

	public  void run(){
		System.out.println("thread is created now !  ");
	}
	public static void main(String[] args) {
//	create the object of the Test class
		Test t = new Test();// this will give the error
		t.start(); // to start the thread we have to use the start methods
//		t.run();
	}
}
