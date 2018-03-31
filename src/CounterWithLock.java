import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Counter that use ReentrantLock lock add() method before do anything thn unlock it.
 * @author Charin Tantrakul
 *
 */
public class CounterWithLock extends Counter{
	private Lock lock = new ReentrantLock();
	
	public void add (int amount) {
		try {
			lock.lock();
			super.add(amount);
		}
		finally {
			lock.unlock();
		}
	}
}
