package com.example.android.quizapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment implements LoaderCallbacks<List<PieceOfNews>> {

    private static final String REQUEST_URL =
            "https://newsapi.org/v2/top-headlines?" +
                    "category=entertainment&" +
                    "language=en&" +
                    "country=us&" +
                    "apiKey=99e1cd82b45e44cd810641b653081236";

    private static final int LOADER_ID = 1;

    private NewsAdapter newsAdapter;

    private TextView emptyStateTextView;

    private View rootView;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.news_layout, container, false);

        ListView newsListView = rootView.findViewById(R.id.list);

        emptyStateTextView = rootView.findViewById(R.id.empty_view);
        newsListView.setEmptyView(emptyStateTextView);

        newsAdapter = new NewsAdapter(getActivity(), new ArrayList<PieceOfNews>());

        newsListView.setAdapter(newsAdapter);


        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);

        assert connectivityManager != null;
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();

            loaderManager.initLoader(LOADER_ID, null, this);
        } else {
            View loadingIndicator = rootView.findViewById(R.id.loading_indicator);
            loadingIndicator.setVisibility(View.GONE);

            emptyStateTextView.setText(R.string.no_internet_connection);
        }
        return rootView;
    }

    @Override
    public Loader<List<PieceOfNews>> onCreateLoader(int i, Bundle bundle) {
        return new NewsLoader(getActivity(), REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<PieceOfNews>> loader, List<PieceOfNews> news) {
        View loadingIndicator = rootView.findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

        emptyStateTextView.setText(R.string.no_news_found);

        newsAdapter.clear();

        if (news != null && !news.isEmpty()) {
            newsAdapter.addAll(news);
        }
    }

    @Override
    public void onLoaderReset(Loader loader) {
        newsAdapter.clear();
    }
}