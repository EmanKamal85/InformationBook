package com.example.informationbook.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.informationbook.ModelClass;
import com.example.informationbook.R;
import com.example.informationbook.activities.CountriesActivity;
import com.example.informationbook.activities.LeadersActivity;
import com.example.informationbook.activities.MuseumsActivity;
import com.example.informationbook.activities.WondersActivity;

import java.util.ArrayList;

public class ModelClassAdapter extends RecyclerView.Adapter<ModelClassAdapter.CardViewHolder> {
    ArrayList<ModelClass> categoryList;
    Context context;

    public ModelClassAdapter(ArrayList<ModelClass> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_design, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        ModelClass mClass = categoryList.get(position);
        holder.imageViewSplash.setImageResource(mClass.getCategoryImage());
        holder.textViewSplash.setText(mClass.getCategoryName());
        holder.cardViewSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if (position == 0){
                    intent = new Intent(context, CountriesActivity.class);
                    context.startActivity(intent);
                } if (position == 1){
                    intent = new Intent(context, MuseumsActivity.class);
                    context.startActivity(intent);
                }if (position == 2){
                    intent = new Intent(context, LeadersActivity.class);
                    context.startActivity(intent);
                }if (position == 3){
                    intent = new Intent(context, WondersActivity.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewSplash;
        TextView textViewSplash;
        CardView cardViewSplash;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
             imageViewSplash = itemView.findViewById(R.id.imageView_splash);
             textViewSplash = itemView.findViewById(R.id.textView_splash);
             cardViewSplash = itemView.findViewById(R.id.card_view);

        }
    }
}
