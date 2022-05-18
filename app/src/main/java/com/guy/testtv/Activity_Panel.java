package com.guy.testtv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Activity_Panel extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
    }

    public void onButtonClick(View v) {
        VideoView videoview1 = (VideoView) findViewById(R.id.videoview1);
        VideoView videoview2 = (VideoView) findViewById(R.id.videoview2);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoplayback);
        videoview1.setVideoURI(uri);
        videoview2.setVideoURI(uri);
        videoview1.start();
        videoview2.start();


    }
}