package com.mo_said.azkar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class choseSeb7aRvAdapter extends RecyclerView.Adapter<choseSeb7aRvAdapter.choseSeb7aRvViewHolder> {
    ArrayList<ModelElseb7a> arrayList;
    Context mContext;

    public choseSeb7aRvAdapter(ArrayList<ModelElseb7a> arrayList, Context mContext) {
        this.arrayList = arrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public choseSeb7aRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seb7achoseitem, parent, false);
        choseSeb7aRvViewHolder choseSeb7aRvViewHolder = new choseSeb7aRvViewHolder(view);
        return choseSeb7aRvViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull choseSeb7aRvViewHolder holder, final int position) {
        holder.mText.setText(arrayList.get(position).Title);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class choseSeb7aRvViewHolder extends RecyclerView.ViewHolder {
        TextView mText;

        public choseSeb7aRvViewHolder(@NonNull View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.title_ad3iaItem);
        }
    }
}
