package com.example.rawan.music;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<SongData> list;
    RecyclerView.Adapter adapter;
    RecyclerView rv;
    Button btn;
    SongData listdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.RV_ID);
        btn = (Button) findViewById(R.id.btn);
        list = new ArrayList<>();
        RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(layoutmanager);
        rv.setItemAnimator(new DefaultItemAnimator());
        listdata = new SongData();
        listdata.setName("Angelica");
        listdata.setBand("Anathema");
        listdata.setLink("https://ia801507.us.archive.org/24/items/rawaan_ali97_hotmail_Ang/ang.mp3");
        listdata.setDownload("https://sv55.onlinevideoconverter.com/download?file=e4a0b1d3i8f5b1b1");
        list.add(listdata);
        list.add(listdata);
        listdata = new SongData();
        listdata.setName("Stairway");
        listdata.setBand("Led Zeppelin");
        listdata.setLink("https://ia800502.us.archive.org/16/items/StairwayToHeaven_886/40StairwayToHeaven.mp3");
        listdata.setDownload("https://sv35.onlinevideoconverter.com/download?file=b1d3f5i8f5c2a0d3b1");
        list.add(listdata);
        list.add(listdata);
        listdata = new SongData();
        listdata.setName("Stargazer");
        listdata.setBand("Rainbow");
        listdata.setLink("https://ia801509.us.archive.org/33/items/RainbowStargazerwithLyrics/Rainbow%20-%20Stargazer%20%28with%20lyrics%29.mp3");
        listdata.setDownload("https://sv18.onlinevideoconverter.com/download?file=e4h7c2e4a0b1j9c2b1");
        list.add(listdata);
        list.add(listdata);
        listdata = new SongData();
        listdata.setName("To Bid You Farewell");
        listdata.setBand("Opeth");
        listdata.setLink("https://ia801507.us.archive.org/17/items/OpethToBidYouFarewell/Opeth%20-%20To%20Bid%20You%20Farewell.mp3");
        listdata.setDownload("https://s13.onlinevideoconverter.com/download?file=h7g6h7g6c2e4c2g6");
        list.add(listdata);
        list.add(listdata);
        list.add(listdata);

        adapter = new RvAdapter(list, this);
        rv.setAdapter(adapter);
    }

}
