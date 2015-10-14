package iaranzadi.com.myandroidportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button mSpotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        final Button mScoresAppButton = (Button) findViewById(R.id.scoresAppButton);
        final Button mLibraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        final Button mBuildItButton = (Button) findViewById(R.id.buildItButton);
        final Button mXyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        final Button mCapstoneAppButton = (Button) findViewById(R.id.capstoneAppButton);

        final String mMessage = "";

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";
                switch(v.getId()) {
                    case R.id.spotifyStreamerButton:
                        message = "This button will launch my Spotify Streamer App";
                        break;
                    case R.id.scoresAppButton:
                        message = "This button will launch my Score App";
                        break;
                    case R.id.libraryAppButton:
                        message = "This button will launch my Library App";
                        break;
                    case R.id.buildItButton:
                        message = "This button will launch my Build It App";
                        break;
                    case R.id.xyzReaderButton:
                        message = "This button will launch my XYZ Reader App";
                        break;
                    case R.id.capstoneAppButton:
                        message = "This button will launch my Capstone App";
                        break;
                }
                //String message = "This button will launch my " + mSpotifyStreamerButton.getText().toString();
                Toast whatAppIsThis = Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG);
                whatAppIsThis.show();
            }
        };
        mSpotifyStreamerButton.setOnClickListener(listener);
        mScoresAppButton.setOnClickListener(listener);
        mLibraryAppButton.setOnClickListener(listener);
        mBuildItButton.setOnClickListener(listener);
        mXyzReaderButton.setOnClickListener(listener);
        mCapstoneAppButton.setOnClickListener(listener);
        
    }
}
