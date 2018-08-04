package com.example.rawan.music;

import java.io.Serializable;

/**
 * Created by rawan on 8/2/18.
 */

public class SongData implements Serializable {
    private String name;
    private String link;
    private String download;
    private String band;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
