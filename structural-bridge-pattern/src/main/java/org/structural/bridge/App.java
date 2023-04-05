package org.structural.bridge;

import org.structural.bridge.abtraction.LongView;
import org.structural.bridge.abtraction.ShortView;
import org.structural.bridge.abtraction.View;
import org.structural.bridge.implementation.Artist;
import org.structural.bridge.implementation.ArtistResource;
import org.structural.bridge.implementation.BookResource;
import org.structural.bridge.implementation.Resource;

public class App
{
    public static void main( String[] args )
    {
        // artist resource
        Resource artistResource = new ArtistResource();
        View longView = new LongView(artistResource);
        longView.show();
        System.out.println( "H************" );

        View shortView = new ShortView(artistResource);
        shortView.show();

    }
}
