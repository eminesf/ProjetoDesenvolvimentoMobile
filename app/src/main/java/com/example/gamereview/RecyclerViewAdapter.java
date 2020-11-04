package com.example.gamereview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamereview.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Game> mGames;

    public RecyclerViewAdapter(Context mContext, List<Game> mGames) {
        this.mContext = mContext;
        this.mGames = mGames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_game, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_title_game.setText(mGames.get(position).getTitle());
        holder.img_game_thumbnail.setImageResource(mGames.get(position).getThumnail());

    }

    @Override
    public int getItemCount() {
        return mGames.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title_game;
        ImageView img_game_thumbnail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title_game = itemView.findViewById(R.id.game_title_id);
            img_game_thumbnail = itemView.findViewById(R.id.game_img_id);

        }
    }

}
