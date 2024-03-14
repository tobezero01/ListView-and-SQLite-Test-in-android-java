package com.example.testexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnback;
    TextView tvDiem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnback = (Button) findViewById(R.id.buttonback);
        tvDiem = (TextView) findViewById(R.id.tvDiem2);

        double mark = getIntent().getDoubleExtra("MARK", 0.0);
        // Xử lý điểm ở đây
        tvDiem.setText(String.valueOf(mark));


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("MARK", mark);
                setResult(MainActivity.RESULT_OK, intent);
                finish();
            }
        });
    }
}