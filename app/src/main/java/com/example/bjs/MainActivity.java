package com.example.bjs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView player;
    Button stone;
    Button paper;
    Button scissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = findViewById(R.id.player);
        stone = findViewById(R.id.stone);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);
    }
    public void OnClick(View v){
        
    }
}