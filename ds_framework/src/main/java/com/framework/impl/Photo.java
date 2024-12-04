package com.framework.impl;

import com.framework.impl.base.AbstractMultimediaArchive;

public class Photo extends AbstractMultimediaArchive {

    public Photo(String name) {
        super(name);
    }

    @Override
    protected void close() {
        System.out.println("Closing photo " + super.getName());

    }

    @Override
    protected void doDisplay() {
        System.out.println("Displaying photo " + super.getName());
    }

    @Override
    protected void load() {
        System.out.println("Loading photo " + super.getName());
    }

}
