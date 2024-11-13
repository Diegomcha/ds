package adapters;

import google.maps.BookMark;
import google.maps.Coordinates;
import model.Photo;

public class PhotoBookmarkAdapter implements BookMark {

	private Photo photo;

	public PhotoBookmarkAdapter(Photo photo) {
		this.photo = photo;
	}

	@Override
	public Coordinates getCoordinates() {
		return photo.getCoordinates();
	}

	@Override
	public String getTooltipInfo() {
		return photo.getDescription() + ". Photo uploaded by " + photo.getUser();
	}

	@Override
	public void open() {
		photo.download();
	}

}
