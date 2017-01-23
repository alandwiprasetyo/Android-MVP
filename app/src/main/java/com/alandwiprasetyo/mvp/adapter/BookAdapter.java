package com.alandwiprasetyo.mvp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.alandwiprasetyo.mvp.R;
import com.alandwiprasetyo.mvp.models.Item;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by alandwiprasetyo on 11/21/16.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MovieViewHolder> {

    private List<Item> movies;
    private int rowLayout;
    private Context context;

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView author;
        ImageView thumbnail;
        RatingBar rating;

        MovieViewHolder(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            author = (TextView) v.findViewById(R.id.author);
            thumbnail = (ImageView) v.findViewById(R.id.thumbnail);
            rating = (RatingBar) v.findViewById(R.id.rating);
        }
    }

    public BookAdapter(List<Item> movies, int rowLayout, Context context) {
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public BookAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        try {
            holder.title.setText(movies.get(position).getVolumeInfo().getTitle());
            holder.author.setText(String.format("Author by %s", movies.get(position).getVolumeInfo().getAuthors().get(0)));
            Glide.with(context).load(movies.get(position).getVolumeInfo().getImageLinks().getThumbnail()).into(holder.thumbnail);
            holder.rating.setRating(movies.get(position).getVolumeInfo().getAverageRating().floatValue());
        } catch (NullPointerException e) {
            holder.rating.setRating(0);
        }
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
