package assistant.genuinecoder.s_assistant;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicPlayer extends AppCompatActivity {
    //Initialize the Variables that is required in this class
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Create Variables Default OnCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        //OnCreate Also Create MediaPlayer
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.thillana);
    }

    public void playPause (View v){
        if(mediaPlayer.isPlaying())
            mediaPlayer.pause();
        else
            mediaPlayer.start();
    }







}
