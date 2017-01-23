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

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<Item> books;
    private int rowLayout;
    private Context context;

    static class BookViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView author;
        ImageView thumbnail;
        RatingBar rating;

        BookViewHolder(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            author = (TextView) v.findViewById(R.id.author);
            thumbnail = (ImageView) v.findViewById(R.id.thumbnail);
            rating = (RatingBar) v.findViewById(R.id.rating);
        }
    }

    public BookAdapter(List<Item> books, int rowLayout, Context context) {
        this.books = books;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public BookAdapter.BookViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, final int position) {
        try {
            holder.title.setText(books.get(position).getVolumeInfo().getTitle());
            holder.author.setText(String.format("Author by %s", books.get(position).getVolumeInfo().getAuthors().get(0)));
            Glide.with(context).load(books.get(position).getVolumeInfo().getImageLinks().getThumbnail()).into(holder.thumbnail);
            holder.rating.setRating(books.get(position).getVolumeInfo().getAverageRating().floatValue());
        } catch (NullPointerException e) {
            holder.rating.setRating(0);
        }
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
