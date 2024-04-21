package com.example.espressoprojrct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView diceimg;
    TextView dicetext;
    Button rollbut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diceimg = findViewById(R.id.dimg);
        dicetext = findViewById(R.id.dtext);
        rollbut = findViewById(R.id.rbut);

        String[] num_array = getResources().getStringArray(R.array.numbers);
        int[] num_img = new int[]{R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        rollbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = (int) (Math.random() * (7 - 1)) + 1;
                dicetext.setText(num_array[1]);
                diceimg.setImageResource(num_img[i-1]);
            }
        });
    }
}