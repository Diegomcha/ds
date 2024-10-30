package google.maps;

import java.awt.Rectangle;
import java.util.*;

public class Map {
	private List<BookMark> bookMarks = new ArrayList<>();

	public void add(BookMark element) {
		bookMarks.add(element);
	}

	public void draw() {
		// 1. Here the map will be drawn
		// Optional homework
		// 2. Now the bookMarks will be drawn on the map
		for (BookMark bookMark : bookMarks)
			System.out.println("Red bookmark in " + bookMark.getCoordinates());
	}

	public void shortClick(int x, int y) {
		BookMark bookMark = findBookMark(x, y);
		if (bookMark != null)
			System.out.println("Pop-up window: " + bookMark.getTooltipInfo());
	}

	public void longClick(int x, int y) {
		BookMark bookmark = findBookMark(x, y);
		if (bookmark != null)
			bookmark.open();
	}

	// Auxiliary private method ----------------------
	private BookMark findBookMark(int x, int y) {
		for (BookMark bookMark : bookMarks) {
			Coordinates coordinates = bookMark.getCoordinates();
			Rectangle elementArea = new Rectangle((int) coordinates.getLongitude(), (int) coordinates.getLatitude(), 9,
					9);
			if (elementArea.contains(x, y))
				return bookMark;
		}
		return null;
	}

}
