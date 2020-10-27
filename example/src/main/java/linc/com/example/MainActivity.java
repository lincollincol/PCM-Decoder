package linc.com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import linc.com.pcmdecoder.PCMDecoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PCMDecoder.encodeToMp3(
                "/storage/emulated/0/Music/norm.pcm",
                1,
                96000,
                22000,
                "/storage/emulated/0/Music/new_audio.mp3"
        );
    }
}
