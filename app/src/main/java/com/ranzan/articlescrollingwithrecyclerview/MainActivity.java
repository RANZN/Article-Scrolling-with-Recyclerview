package com.ranzan.articlescrollingwithrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Article> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initValues();
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        ArticleAdapter articleAdapter = new ArticleAdapter(articleList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager((linearLayoutManager));
        recyclerView.setAdapter(articleAdapter);
    }

    private void initValues() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void buildList() {
        articleList = new ArrayList<>();
        Article article1 = new Article(R.drawable.ocean, getString(R.string.t1), getString(R.string.s1));
        articleList.add(article1);
        Article article2 = new Article(R.drawable.bridge, getString(R.string.t2), getString(R.string.s2));
        articleList.add(article2);
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article1);
        articleList.add(article2);
    }
}