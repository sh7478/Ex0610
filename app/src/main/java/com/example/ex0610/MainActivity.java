package com.example.ex0610;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    ToggleButton tb;

    LinearLayout homepage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.tb);
        switch1 = findViewById(R.id.switch1);
        homepage = findViewById(R.id.homePage);
    }

    public void change(View view)
    {
        if (tb.isChecked() && switch1.isChecked())
        {
            homepage.setBackgroundColor(Color.BLUE);
        }
        else if(tb.isChecked())
        {
            homepage.setBackgroundColor(Color.GREEN);
        }
        else if(switch1.isChecked())
        {
            homepage.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            homepage.setBackgroundColor(Color.RED);
        }
    }
}