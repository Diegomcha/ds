package model.bookmarks;

import java.util.Objects;

import google.maps.BookMark;
import google.maps.Navigator;

public abstract class BaseBookmark<T> implements BookMark {

	// Emulating an static obj
	protected final Navigator nav = new Navigator();
	protected final T item;

	protected BaseBookmark(T item) {
		this.item = Objects.requireNonNull(item);
	}

}
