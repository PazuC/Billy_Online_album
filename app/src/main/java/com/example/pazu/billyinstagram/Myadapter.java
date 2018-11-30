package com.example.pazu.billyinstagram;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {

    private List<String> mData;

    Myadapter(List<String> data){
        mData = data;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView title;
        private TextView description;

        ViewHolder( View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            title = ( TextView)itemView.findViewById(R.id.title);
            description = ( TextView)itemView.findViewById(R.id.description);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }


}