package model.bookmarks;

import google.maps.Coordinates;
import model.Photo;

public class PhotoBookmark extends BaseBookmark<Photo> {

	public PhotoBookmark(Photo photo) {
		super(photo);
	}

	@Override
	public Coordinates getCoordinates() {
		return this.item.getCoordinates();
	}

	@Override
	public String getTooltipInfo() {
		// Click on Photo: Description of the photo and user who uploaded it
		return String.format("Description: %s\nUser: %s", this.item.getDescription(), this.item.getUser());
	}

	@Override
	public void open() {
		// Click on Photo: Download photo
		this.item.download();
	}
}
