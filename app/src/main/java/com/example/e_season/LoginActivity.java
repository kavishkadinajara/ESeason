package com.example.e_season;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        ImageView logoImageView = findViewById(R.id.logoImageView);
        Glide.with(this)
                .load(R.drawable.train_animation)
                .into(logoImageView);
    }
}
