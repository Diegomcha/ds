package adapters;

import google.maps.*;
import model.*;

public class MonumentBookmarkAdapter implements BookMark {

	private Monument monument;
	private Navigator navigator = new Navigator();

	public MonumentBookmarkAdapter(Monument monument) {
		this.monument = monument;
	}

	@Override
	public Coordinates getCoordinates() {
		return navigator.getCoordinates(monument.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return monument.getName() + ". Made by " + monument.getAuthor();
	}

	@Override
	public void open() {
		navigator.navigateTo(monument.getAddress());
	}

}
