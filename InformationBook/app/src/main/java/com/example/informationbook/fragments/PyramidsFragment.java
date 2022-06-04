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

public class PyramidsFragment extends Fragment {

    ImageView imageViewPyramids;
    ProgressBar progressBarPyramids;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pyramids, container, false);
        imageViewPyramids = view.findViewById(R.id.imageViewPyramids);
        progressBarPyramids = view.findViewById(R.id.progressBarPyramids);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/All_Gizah_Pyramids.jpg/1024px-All_Gizah_Pyramids.jpg")
                .into(imageViewPyramids, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPyramids.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        return view;

    }
}
