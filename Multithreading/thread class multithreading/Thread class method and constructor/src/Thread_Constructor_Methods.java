public class Thread_Constructor_Methods {
	public static void main(String[] args) {
		System.out.println("Thread Class Methods and Constructors:");

		System.out.println("\nThread Constructors:");
		System.out.println("1. Thread()");
		System.out.println("2. Thread(Runnable target)");
		System.out.println("3. Thread(String name)");
		System.out.println("4. Thread(Runnable target, String name)");
		System.out.println("5. Thread(ThreadGroup group, Runnable target)");
		System.out.println("6. Thread(ThreadGroup group, Runnable target, String name)");
		System.out.println("7. Thread(ThreadGroup group, Runnable target, String name, long stackSize)");

		System.out.println("\nThread Methods:");
		System.out.println("1. run()");
		System.out.println("2. start()");
		System.out.println("3. currentThread()");
		System.out.println("4. isAlive()");

		System.out.println("\nThread Name Methods:");
		System.out.println("1. getName()");
		System.out.println("2. setName(String name)");

		System.out.println("\nThread Priority Methods:");
		System.out.println("1. getPriority()");
		System.out.println("2. setPriority(int newPriority)");
		System.out.println("3. MAX_PRIORITY");
		System.out.println("4. MIN_PRIORITY");
		System.out.println("5. NORM_PRIORITY");

		System.out.println("\nOther Methods:");
		System.out.println("1. getId()");
		System.out.println("2. getState()");
		System.out.println("3. isDaemon()");
		System.out.println("4. setDaemon(boolean on)");
		System.out.println("5. sleep(long millis)");
		System.out.println("6. sleep(long millis, int nanos)");
		System.out.println("7. yield()");
	}
}
/* ⭐⭐⭐⭐⭐
	1. Thread()
	2. Thread(Runnable target)
	3. Thread (String name)
	4. Thread(Runnable Target ,String name)

	thread group related ⭐⭐⭐
	5. Thread(ThreadGroup group, Runnable target)
	6. Thread(ThreadGroup group, Runnable target, String name)
	7. Thread(ThreadGroup group, Runnable target, String name, long stackSize)

	⭐⭐⭐⭐⭐ methods
	1. run ()
	2. start()
	3. currentThread()
	4. isAlive()

	Thread Name Methods ⭐⭐⭐
	5. getName()
	6. setName(String name)


	Thread Priority Methods ⭐⭐⭐

	getPriority(): Returns the priority of the thread.
	setPriority(int newPriority): Sets the priority of the thread.
	MAX_PRIORITY: Returns the maximum priority of a thread.
	MIN_PRIORITY: Returns the minimum priority of a thread.
	NORM_PRIORITY: Returns the normal priority of a thread.



	Other Methods  ⭐⭐⭐
	getId(): Returns the ID of the thread.
	getState(): Returns the state of the thread.
	isDaemon(): Returns whether the thread is a daemon thread or not.
	setDaemon(boolean on): Sets whether the thread is a daemon thread or not.
	sleep(long millis): Causes the thread to sleep for the specified amount of time.
	sleep(long millis, int nanos): Causes the thread to sleep for the specified amount of time.
	yield(): Causes the thread to yield control to other threads.

 */