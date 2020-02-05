package com.example.aplikacja_zal;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            setContentView(R.layout.activity_main);

            button = findViewById(R.id.przycisk);

            button.setOnClickListener(v -> {
                Intent intent = new Intent(this, AbsenceActivity.class);
                startActivity(intent);
                //obsługa przycisku, która przenosi nas na następny ekran
            });

    }
}
