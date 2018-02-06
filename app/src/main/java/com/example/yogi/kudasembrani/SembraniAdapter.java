package com.example.yogi.kudasembrani;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import java.util.List;
/**
 * Created by yogi on 05/02/18.
 */

public class SembraniAdapter extends RecyclerView.Adapter<SembraniAdapter.MyHolder>{
    private Context context;

    public SembraniAdapter(Context context, List<Sembrani> sembraniList){
        this.context = context;
        this.sembraniList = sembraniList;
    }

    @Override
    public SembraniAdapter.MyHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.sembrani_list_row, viewGroup, false);
        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SembraniAdapter.MyHolder myHolder, int position){
        Sembrani sembrani = sembraniList.get(position);
        myHolder.img_android.setImageResource(sembraniList.get(position).getImgUrl());
        myHolder.title.setText(sembrani.getTitle());
        myHolder.subtitle.setText(sembrani.getSubtitle());
    }

    public Object getItem(int position){
        return sembraniList.get(position);
    }

    @Override
    public int getItemCount(){
        return sembraniList.size();
    }

    public SembraniAdapter(List<Sembrani> sembraniList){
        this.sembraniList = sembraniList;
    }

    private List<Sembrani> sembraniList;

    public class MyHolder extends RecyclerView.ViewHolder{
        public TextView title, subtitle;
        public ImageView img_android;
        public MyHolder(final View itemView){
            super(itemView);
            img_android = (ImageView) itemView.findViewById(R.id.img_android);
            title = (TextView) itemView.findViewById(R.id.title);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle);

            itemView.setClickable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailUser.class);
                    intent.putExtra("title", R.id.title);
                    intent.putExtra("subtitle", R.id.subtitle);
                    context.startActivity(intent);
                }
            });
        }
    }
}
