public class Performing_multiple_task_from_multiple_thread {

	static  class MyThread1 extends  Thread{
		public  void run(){
			System.out.println("thread task 1  ");
		}
	}
	static  class MyThread2 extends  Thread{
		public  void  run (){
			System.out.println("thread task 2");
		}
	}
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		MyThread2 t2 = new MyThread2();
		t2.start();
	}
}
