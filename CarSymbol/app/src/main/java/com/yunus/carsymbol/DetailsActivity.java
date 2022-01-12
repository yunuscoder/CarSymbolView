package com.yunus.carsymbol;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;


import com.yunus.carsymbol.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSelectedLandmark();


        binding.textView.setText(selectedLandmark.name);
        binding.textView2.setText(selectedLandmark.description);
        binding.imageView.setImageResource(selectedLandmark.image);

    }
}