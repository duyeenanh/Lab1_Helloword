package com.example.baitambuoi1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Dòng này cực kỳ quan trọng để hiển thị giao diện bạn vừa tạo
        setContentView(R.layout.activity_main);
    }
}