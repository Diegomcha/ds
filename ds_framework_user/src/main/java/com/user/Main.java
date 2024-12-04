package com.user;

import java.util.Set;

import com.basic_model.MyFirstAlbum;
import com.basic_model.multimedia_archives.Photo;
import com.basic_model.multimedia_archives.Video;
import com.framework.MultimediaArchive;

public class Main {
    public static void main(String[] args) {
        MyFirstAlbum myFirstAlbum = new MyFirstAlbum("TestAlbum");

        insertArchives(myFirstAlbum);
        Collection collection = new Collection("London");
        collection.insertArchive(new Photo("Big Ben"));
        collection.insertArchive(new Photo("Tower Bridge"));
        collection.insertArchive(new Video("Thames river"));
        myFirstAlbum.insertArchive(collection);

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