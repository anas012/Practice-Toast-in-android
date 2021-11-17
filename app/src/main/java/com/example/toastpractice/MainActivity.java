package com.example.toastpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.toastbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getBaseContext(),"Hello",Toast.LENGTH_LONG);

                toast.setGravity(Gravity.CENTER|Gravity.RIGHT,100,200);
                toast.show();
            }
        });
    }
}