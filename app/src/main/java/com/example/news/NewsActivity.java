package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    private NewsAdapter mNewsAdapter;

    //private static final String NEWS_REQUEST_URL = "https://newsapi.org/v2/top-headlines?country=in&apiKey=038c19dd59b74aa9a6593a819abfaab2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        List<News> news = QueryUtils.extractNews();

        ListView newsList = findViewById(R.id.list);

        mNewsAdapter = new NewsAdapter(this, news);

        newsList.setAdapter(mNewsAdapter);


    }

    /*private class NewsAsyncTask extends AsyncTask<String, Void, List<News>> {

        @Override
        protected List<News> doInBackground(String... urls) {
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            List<News> result = QueryUtils.fetchNewsData(urls[0]);
            return result;
        }

        @Override
        protected void onPostExecute(List<News> data) {
            mNewsAdapter.clear();

            if (data != null && !data.isEmpty()) {
                mNewsAdapter.addAll(data);
            }
        }
    } */


}