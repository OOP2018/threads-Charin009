
/**
 * Subtract 1 to limit from Counter
 * @author kaizofaria
 *
 */

public class SubtractTask implements Runnable{
	private Counter counter;
	private int limit;

	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	public void run() {
		for (int k = 1; k <= limit; k++) {
			counter.add(k * -1);
		}
		System.out.println("Done " + Thread.currentThread().getName());
	}
}
