package ru.yacevyuk.rr.company.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class GameActivity extends AppCompatActivity {
    public int mCount = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        ImageView avocado1 = findViewById(R.id.avocado);
        Button gamebtn1 = findViewById(R.id.gamebtn);
        TextView resulttext = findViewById(R.id.result);

        gamebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resulttext.setText("0" + ++mCount);
                if (resulttext.getText().toString().equals("2")) {
                    avocado1.setImageResource(R.drawable.firs);
                }
                else if (resulttext.getText().toString().equals("10")) {
                    avocado1.setImageResource(R.drawable.second);
                } else if (resulttext.getText().toString().equals("20")) {
                    avocado1.setImageResource(R.drawable.third);
                } else if (resulttext.getText().toString().equals("30")) {
                    avocado1.setImageResource(R.drawable.fourth);
                }
            }
        });
 }
}