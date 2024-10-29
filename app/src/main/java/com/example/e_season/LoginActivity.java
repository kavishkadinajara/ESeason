package com.example.e_season;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page); // login_page layout

        // Load background GIF into ImageView
        ImageView backgroundImageView = findViewById(R.id.backgroundImage);
        Glide.with(this)
                .asGif() // Treat it as a GIF
                .load(R.drawable.frame2) // Load the frame2 GIF from drawable
                .into(backgroundImageView); // Use ImageView

        // Load the app logo (if needed)
        ImageView logoImageView = findViewById(R.id.logoImageView);
        Glide.with(this)
                .load(R.drawable.train_animation) // Ensure train_animation drawable exists
                .into(logoImageView);
    }
}
