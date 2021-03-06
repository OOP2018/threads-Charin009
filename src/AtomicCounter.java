import java.util.concurrent.atomic.AtomicLong;
/**
 * Counter that use AtomicLong instead normal long.
 * @author Charin Tantrakul
 *
 */
public class AtomicCounter extends Counter {
	private AtomicLong total;

	public AtomicCounter() {
		total = new AtomicLong();
	}

	public void add(int amount) {
		total.getAndAdd(amount);
	}
	
	public long get() {
		return total.get();
	}

}
