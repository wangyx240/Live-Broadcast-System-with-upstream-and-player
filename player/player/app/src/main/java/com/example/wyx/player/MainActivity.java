package com.example.wyx.player;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import io.vov.vitamio.widget.VideoView;

import io.vov.vitamio.LibsChecker;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!LibsChecker.checkVitamioLibs(this))
            return;
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText rtmpUrl=findViewById(R.id.text1);
                String Url1=rtmpUrl.getText().toString();
                VideoView mVideoView=(VideoView) findViewById(R.id.surface_view);
    /*会有几秒延时*/
                mVideoView.setVideoPath(Url1);
            }
        });

    }
}
