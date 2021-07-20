package com.example.kuis2_d_672018025;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private MediaController mediaController;
    private VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv = (VideoView) findViewById(R.id.videoView);
        if (mediaController == null){
            mediaController = new MediaController(this);
            mediaController.setAnchorView(vv);
        }
        vv.setMediaController(mediaController);
        Uri uri = Uri.parse("android.resource://" +getPackageName() + "/" + R.raw.mahen);
        //Uri uri = Uri.parse("https://www.youtube.com/watch?v=hRIkiQTME8Q");
        vv.setVideoURI(uri);
        vv.start();

    }
}
