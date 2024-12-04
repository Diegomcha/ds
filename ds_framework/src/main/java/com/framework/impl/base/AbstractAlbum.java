package com.framework.impl.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.framework.Album;
import com.framework.MultimediaArchive;

public abstract class AbstractAlbum implements Album {

    private Map<String, MultimediaArchive> archives = new HashMap<>();
    private String albumName;

    protected AbstractAlbum(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumName() {
        return albumName;
    }

    @Override
    public MultimediaArchive getArchive(String name) {
        if (archives.containsKey(name)) {
            return archives.get(name);
        }
        return null;
    }

    @Override
    public void displayArchive(String name) {
        MultimediaArchive ma = getArchive(name);
        if (ma != null) {
            ma.display();
        } else
            System.out.println("Archive " + name + "does not exist.");
    }

    @Override
    public Set<String> getArchivesList() {
        return archives.keySet();
    }

    @Override
    public boolean insertArchive(MultimediaArchive archive) {
        if (!archives.containsKey(archive.getName())) {
            archives.put(archive.getName(), archive);
            return true;
        }
        return false;
    }

}