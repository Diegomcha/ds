package com.framework.impl.base;

import com.framework.MultimediaArchive;

public abstract class AbstractMultimediaArchive implements MultimediaArchive {

    private String name;

    protected AbstractMultimediaArchive(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        load();
        doDisplay();
        close();
    }

    protected abstract void close();

    protected abstract void doDisplay();

    protected abstract void load();

}