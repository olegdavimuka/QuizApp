package com.example.android.quizapp;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<PieceOfNews>> {

    private String url;

    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<PieceOfNews> loadInBackground() {
        if (url == null) {
            return null;
        }
        return ExtractingJSONHelperMethods.getNewsData(url);
    }
}
