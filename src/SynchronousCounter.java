/**
 * Counter that use synchronized.
 * @author Charin Tantrakul
 *
 */
public class SynchronousCounter extends Counter {
	
	@Override
	public synchronized void add ( int amount ) {
		super.add(amount);
	}
}
