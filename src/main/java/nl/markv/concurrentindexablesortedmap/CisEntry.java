package nl.markv.concurrentindexablesortedmap;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.ThreadSafe;

//TODO @mark: javadoc
@ThreadSafe
public final class CisEntry<K, T> {

	public final int position;
	@Nonnull
	public final K key;
	@Nonnull
	public final T value;

	CisEntry(int position, K key, T value) {
		this.position = position;
		this.key = key;
		this.value = value;
	}
}