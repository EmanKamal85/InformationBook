package com.example.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.informationbook.R;
import com.example.informationbook.adapters.ViewPagerCountriesAdapter;
import com.example.informationbook.adapters.ViewPagerWondersAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WondersActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);
//        getSupportFragmentManager().beginTransaction().
//                add(R.id.linear_countries, new UnitedKingdomFragment()).commit();

        tabLayout = findViewById(R.id.tabLayoutWonders);
        viewPager2 = findViewById(R.id.viewPagerWonders);
        ViewPagerWondersAdapter adapter = new ViewPagerWondersAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Taj Mahal");
                        break;
                    case 1:
                        tab.setText("Pyramids");
                        break;

                }
            }
        });
        tabLayoutMediator.attach();
    }
}