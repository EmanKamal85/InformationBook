package com.example.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.R;
import com.example.informationbook.adapters.ViewPagerCountriesAdapter;
import com.example.informationbook.fragments.UnitedKingdomFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
//        getSupportFragmentManager().beginTransaction().
//                add(R.id.linear_countries, new UnitedKingdomFragment()).commit();

        tabLayout = findViewById(R.id.tabLayoutCountries);
        viewPager2 = findViewById(R.id.viewPagerCountries);
        ViewPagerCountriesAdapter adapter = new ViewPagerCountriesAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("United Kingdom");
                        break;
                    case 1:
                        tab.setText("France");
                        break;
                    case 2:
                        tab.setText("Italy");
                        break;

                }
            }
        });
        tabLayoutMediator.attach();
    }
}