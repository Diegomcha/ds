package com.framework.impl;

import com.framework.impl.base.AbstractMultimediaArchive;

public class Video extends AbstractMultimediaArchive {

    public Video(String name) {
        super(name);
    }

    @Override
    protected void close() {
        System.out.println("Closing video " + super.getName());

    }

    @Override
    protected void doDisplay() {
        System.out.println("Reproducing video " + super.getName());
    }

    @Override
    protected void load() {
        System.out.println("Loading video " + super.getName());
    }

}
