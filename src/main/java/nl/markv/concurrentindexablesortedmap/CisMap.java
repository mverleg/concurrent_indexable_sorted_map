package nl.markv.concurrentindexablesortedmap;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

//TODO @mark: Javadoc
@ThreadSafe
public final class CisMap<T> {
	// could also use a generic key <K> to be more general
	// constructor taking comparator (to be able to reverse)
	// optionally: max size (in which case removeLastKey is not needed)

	@Nullable
	COPQEntry<T> firstEntry();

	@Nullable
	COPQEntry<T> lastEntry();

	@Nullable
	COPQEntry<T> ceilingEntry(long aStartTimeNanos);

	int size();

	void put(long aTimestampNanos, T aTrackable);

	void removeLast();

	// inclusive both ends
	// careful, underlying may change while iterating
	Iterable<COPQEntry<T>> sliceIterable(long aEndTimeNanos, long aStartTimeNanos);
}