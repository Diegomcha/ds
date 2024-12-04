package com.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.framework.MultimediaArchive;

public class Collection implements MultimediaArchive {

    Map<String, MultimediaArchive> archives = new HashMap<>();
    String name;

    public Collection(String name) {
        this.name = name;
    }

    public boolean insertArchive(MultimediaArchive archive) {
        if (!archives.containsKey(archive.getName())) {
            archives.put(archive.getName(), archive);
            return true;
        }
        return false;
    }

    public Set<String> getArchivesList() {
        return archives.keySet();
    }

    @Override
    public void display() {
        Set<String> names = archives.keySet();
        for (String n : names) {
            archives.get(n).display();
        }
    }

    @Override
    public String getName() {
        return name;
    }

}
