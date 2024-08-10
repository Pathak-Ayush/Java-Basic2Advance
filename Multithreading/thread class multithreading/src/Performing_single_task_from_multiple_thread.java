public class Performing_single_task_from_multiple_thread {

	static  class Test extends  Thread{
		public  void  run(){
			System.out.println("performing single task from multiple thread !");
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.run();
		Test t2 = new Test();
		t2.run();
	}
}
