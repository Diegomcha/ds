package com.framework;

import java.util.Set;

public interface Album {
	MultimediaArchive getArchive(String name);

	void displayArchive(String name);

	Set<String> getArchivesList();

	boolean insertArchive(MultimediaArchive archive);
}
