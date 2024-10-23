package model.bookmarks;

import google.maps.Coordinates;
import model.Monument;

public class MonumentBookmark extends BaseBookmark<Monument> {

	public MonumentBookmark(Monument monument) {
		super(monument);
	}

	@Override
	public Coordinates getCoordinates() {
		return this.nav.getCoordinates(this.item.getAddress()) ;
	}

	@Override
	public String getTooltipInfo() {
		// Click on Monument: Name and author of the monument (Coliseum)
		return String.format("Name: %s\nAuthor: %s", this.item.getName(), this.item.getAuthor());
	}

	@Override
	public void open() {
		// Click on Monument: Navigate to the monument with GPS
		this.nav.navigateTo(this.item.getAddress());
	}
}
