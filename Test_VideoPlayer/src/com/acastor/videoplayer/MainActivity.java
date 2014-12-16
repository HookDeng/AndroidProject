package com.acastor.videoplayer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.provider.MediaStore.Video;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        VideoView v = (VideoView) findViewById(R.id.videoView1);
        v.setVideoPath("/sdcard/vid.mp4");
        v.setMediaController(new MediaController(this));
        v.start();
        v.requestFocus();
    }
}
