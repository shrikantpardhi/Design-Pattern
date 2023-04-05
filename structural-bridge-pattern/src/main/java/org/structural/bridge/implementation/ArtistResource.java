package org.structural.bridge.implementation;

public class ArtistResource implements Resource{
    Artist artist;

    public ArtistResource() {
        this.artist = new Artist();
    }

    @Override
    public void snippet() {
        System.out.println("Artist snippet");
    }

    @Override
    public void title() {
        System.out.println("Artist name " +artist.fname +" "+artist.lName);
    }

    @Override
    public void image() {
        System.out.println("Artist image url " +artist.image);
    }
}
