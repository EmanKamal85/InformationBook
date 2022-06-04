package com.example.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class TajMahalFragment extends Fragment {

    ImageView imageViewTajMahal;
    ProgressBar progressBarTajMahal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_taj_mahal, container, false);
        imageViewTajMahal = view.findViewById(R.id.imageViewTajMahal);
        progressBarTajMahal = view.findViewById(R.id.progressBarTajMahal);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Taj_Mahal_in_India_-_Kristian_Bertel.jpg/1024px-Taj_Mahal_in_India_-_Kristian_Bertel.jpg")
                .into(imageViewTajMahal, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTajMahal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        return view;

    }
}
