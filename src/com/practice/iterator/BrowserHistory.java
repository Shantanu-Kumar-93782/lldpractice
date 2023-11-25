package com.practice.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrowserHistory<T> implements Iterable<T> {

	List<T> history = new ArrayList<>();

	public void add(T e) {
		history.add(e);
	}

	public static class InnerIterator<T> implements Iterator<T> {

		List<T> history = null;

		int index = 0;

		public InnerIterator(List<T> history, int index) {
			this.history = history;
			this.index = index;
		}

		@Override
		public boolean hasNext() {
			if(history.size() <= index) {
				index=0;
				return false;
			} else {
				return true;
			}
		}

		@Override
		public T next() {
			T currentElement = history.get(index);
			index++;
			return currentElement;
		}

	}

	@Override
	public Iterator<T> iterator() {
		return new InnerIterator<T>(this.history, 0);
	}

}
