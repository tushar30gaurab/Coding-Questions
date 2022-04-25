class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer peeked;

public PeekingIterator(Iterator<Integer> iterator) {
// initialize any member here.
    this.iterator = iterator;
}

// Returns the next element in the iteration without advancing the iterator.
public Integer peek() {
    if (peeked == null) {
        peeked = iterator.hasNext() ? iterator.next() : null;
    }
    return peeked;
}

// hasNext() and next() should behave the same as in the Iterator interface.
// Override them if needed.
@Override
public Integer next() {
    Integer ans = peek();
    peeked = null;
    
    return ans;
}

@Override
public boolean hasNext() {
    return peek() != null;
}
}