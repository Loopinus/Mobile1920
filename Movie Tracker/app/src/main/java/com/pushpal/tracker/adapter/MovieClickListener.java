package com.pushpal.tracker.adapter;

import android.widget.ImageView;

import com.pushpal.tracker.model.Movie;

public interface MovieClickListener {
    void onMovieClick(int pos, Movie movie, ImageView shareImageView);
}