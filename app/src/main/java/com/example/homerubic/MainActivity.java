package com.example.homerubic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView getstarted;
    TextView how, about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getstarted = (ImageView) findViewById(R.id.getstarted);
//        getstarted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openencryptpage();
//            }
//        });
        getstarted = (ImageView) findViewById(R.id.getstarted);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openencryptpage();
            }
        });

//        button2 = (ImageView) findViewById(R.id.decrypt);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opendecryptpage();
//            }
//        });

        how = (TextView) findViewById(R.id.how);
        how.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhowpage();
            }
        });

        about = (TextView) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();
            }
        });
    }

    private void openabout() {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    private void openhowpage() {
        Intent intent = new Intent(this, How.class);
        startActivity(intent);
    }

    public void opendecryptpage() {
        Intent intent = new Intent(this, decryptpage.class);
        startActivity(intent);
    }
    public void openencryptpage() {
        Intent intent = new Intent(this, encryptpage.class);
        startActivity(intent);
    }
}