package com.example.abhiu.tnapp.activities;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.example.abhiu.tnapp.R;

    //LaunchScreen Activity
public class LaunchScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launchscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent (LaunchScreenActivity.this,MainActivity.class);
                LaunchScreenActivity.this.startActivity(i);
                LaunchScreenActivity.this.finish();
            }
        },2000);
    }
}

