package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image1);
        image.setImageResource(R.drawable.one);
    }

    public void rollEvent(View view) {
        int randomNumber = rand.nextInt(5);
        Toast.makeText(this, Integer.toString(randomNumber+1), Toast.LENGTH_SHORT).show();
        switch (randomNumber){
            case 0:
                image.setImageResource(R.drawable.one);
                break;
            case 1:
                image.setImageResource(R.drawable.two);
                break;
            case 2:
                image.setImageResource(R.drawable.three);
                break;
            case 3:
                image.setImageResource(R.drawable.four);
                break;
            case 4:
                image.setImageResource(R.drawable.five);
                break;
            case 5:
                image.setImageResource(R.drawable.six);
                break;
        }
    }
}