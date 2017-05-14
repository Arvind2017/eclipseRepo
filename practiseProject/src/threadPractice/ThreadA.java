package threadPractice;

public class ThreadA extends Thread {

	int index = 0;

	public void calculate() {

		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread starts calculation");
				this.notify();

				this.index = this.index + i;
			}
			System.out.println("Child thread provided notification to main method");

			// System.out.println("End of the ThreadA");
		}
	}

	public void run() {

		calculate();
	}
}
