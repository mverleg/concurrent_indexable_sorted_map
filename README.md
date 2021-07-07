
Concurrent Indexable Sorted Map
===============================

**This library is under construction**, it is not ready for use.

Operations:

* Iterate over key-value pairs sorted by key in `O(log(n))`.
* Get key-value pair by ordinal position in `O(log(n))`.
* Get value and its ordinal position in `O(log(n)).
* Get the closest key above the (and its value) above a key in `O(log(n)).
* Insert key-value pair in `O(log(n))`.
* Remove tail entry in `O(log(n))`.
* Get size in `O(1)`.

All operations are thread-safe and lock-free.

todo - true?: Memory use is up to `O(log(n))`, with good locality for fast access.

Note that this data structure does not:

* Allow null values.
* Implement `Collection`.
* Delete non-tail entries (might be added in the future).


