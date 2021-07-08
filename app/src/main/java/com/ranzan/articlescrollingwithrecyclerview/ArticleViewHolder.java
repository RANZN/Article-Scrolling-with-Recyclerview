package com.ranzan.articlescrollingwithrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
    private ImageView Image;
    private TextView title;
    private TextView context;


    public ArticleViewHolder(@NonNull View itemView) {
        super(itemView);
        initValues(itemView);
    }

    private void initValues(View itemView) {
        Image = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.title);
        context = itemView.findViewById(R.id.context);
    }

    public void setData(Article article) {
        Image.setImageResource(article.getImageId());
        title.setText(article.getTitle());
        context.setText(article.getContext());
    }
}
