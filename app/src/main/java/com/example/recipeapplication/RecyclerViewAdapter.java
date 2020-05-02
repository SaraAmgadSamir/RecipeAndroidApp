package com.example.recipeapplication;
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

import java.util.*;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {
    private Context mContext;
    private List<Recipes> mData;
    public RecyclerViewAdapter(Context con,List<Recipes>data){
        this.mContext=con;
        this.mData=data;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.cardview_recipe,viewGroup,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {
        holder.recipeTitle.setText(mData.get(position).getRecipeName());
        holder.img_recipe_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(mContext, RecipeActivity.class);
                    intent.putExtra("Name", mData.get(position).getRecipeName());
                    intent.putExtra("Ingredients", mData.get(position).getRecipeIngredients());
                    intent.putExtra("MethodTitle", mData.get(position).getRecipeMethodTitle());
                    intent.putExtra("Recipe", mData.get(position).getRecipe());
                    intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                    mContext.startActivity(intent);



            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView recipeTitle;
        CardView cardView;
        ImageView img_recipe_thumbnail;



        public MyHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle=(TextView)itemView.findViewById(R.id.recipe_text);
            img_recipe_thumbnail=(ImageView)itemView.findViewById(R.id.reciper_img_id);
            cardView=(CardView)itemView.findViewById(R.id.cardView_id);
        }
    }


}
