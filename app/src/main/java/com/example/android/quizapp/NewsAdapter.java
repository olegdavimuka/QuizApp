package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<PieceOfNews> {

    public NewsAdapter(Activity context, ArrayList<PieceOfNews> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.piece_of_news_list_item, parent, false);
        }

        final PieceOfNews currentPieceOfNews = getItem(position);
        assert currentPieceOfNews != null;

        RelativeLayout relativeLayout = listItemView.findViewById(R.id.relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri pieceOfNewsUri = Uri.parse(currentPieceOfNews.getUrl());
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, pieceOfNewsUri);
                getContext().startActivity(websiteIntent);
            }
        });

        ImageView courseImage = listItemView.findViewById(R.id.imageImageView);
        class DownLoadImageTask extends AsyncTask<String, Void, Bitmap> {
            private ImageView imageView;

            private DownLoadImageTask(ImageView imageView) {
                this.imageView = imageView;
            }

            protected Bitmap doInBackground(String... urls) {
                String imageURL = urls[0];
                Bitmap image = null;
                try {
                    InputStream inputStream = new URL(imageURL).openStream();
                    image = BitmapFactory.decodeStream(inputStream);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return image;
            }

            protected void onPostExecute(Bitmap result) {
                imageView.setImageBitmap(result);
            }
        }

        if (!currentPieceOfNews.getImageUrl().equals("null"))
            new DownLoadImageTask(courseImage).execute(currentPieceOfNews.getImageUrl());

        TextView courseName = listItemView.findViewById(R.id.titleTextView);
        courseName.setText(currentPieceOfNews.getTitle());

        TextView courseDescription = listItemView.findViewById(R.id.descriptionTextView);
        if (!currentPieceOfNews.getDescription().equals("null"))
            courseDescription.setText(currentPieceOfNews.getDescription());
        else courseDescription.setVisibility(View.GONE);

        return listItemView;
    }
}
