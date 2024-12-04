package com.main;

import java.util.Set;

import com.framework.MultimediaArchive;
import com.framework.impl.MyFirstAlbum;
import com.framework.impl.Photo;
import com.framework.impl.Video;

public class Main {
    public static void main(String[] args) {
        MyFirstAlbum myFirstAlbum = new MyFirstAlbum("TestAlbum");

        insertArchives(myFirstAlbum);

        Set<String> archives = myFirstAlbum.getArchivesList();
        for (String maName : archives) {
            MultimediaArchive ma = myFirstAlbum.getArchive(maName);
            System.out.println("\n\t- Dialing with archive " + ma.getName());
            ma.display();
        }
    }

    private static void insertArchives(MyFirstAlbum myFirstAlbum) {
        // Insert archives
        myFirstAlbum.insertArchive(new Photo("Photo Oviedo"));
        myFirstAlbum.insertArchive(new Video("Video Gijón"));
        myFirstAlbum.insertArchive(new Photo("Photo Avilés"));
        myFirstAlbum.insertArchive(new Video("Video Madrid"));
        myFirstAlbum.insertArchive(new Photo("Photo Salamanca"));
        myFirstAlbum.insertArchive(new Video("Video Barcelona"));
    }
}