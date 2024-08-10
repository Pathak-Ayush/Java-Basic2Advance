public class Performing_single_task_from_single_thread {
	static  class Test extends  Thread{
		public  void run(){
			System.out.println("thread  task run by the single thread ");
		}
	}
	public static void main(String[] args) {
	Test t = new Test();
		t.start();
	}
}
