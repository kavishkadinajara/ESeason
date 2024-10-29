package com.example.e_season;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page); // Make sure login_page layout exists

        ImageView logoImageView = findViewById(R.id.logoImageView); // Verify the ID matches the XML
        Glide.with(this)
                .load(R.drawable.train_animation) // Ensure train_animation drawable exists
                .into(logoImageView);
    }
}
