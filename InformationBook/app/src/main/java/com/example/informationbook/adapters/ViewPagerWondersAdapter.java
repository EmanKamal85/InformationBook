package com.example.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.fragments.FranceFragment;
import com.example.informationbook.fragments.ItalyFragment;
import com.example.informationbook.fragments.PyramidsFragment;
import com.example.informationbook.fragments.TajMahalFragment;
import com.example.informationbook.fragments.UnitedKingdomFragment;

public class ViewPagerWondersAdapter extends FragmentStateAdapter {
    public ViewPagerWondersAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = new TajMahalFragment();
                break;
            case 1:
                fragment = new PyramidsFragment();
                break;

            default:
                return  null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
