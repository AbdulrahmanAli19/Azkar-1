package com.mo_said.azkar.RV;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.R;

import java.util.ArrayList;

public class RvDo3a2ItemAdapter extends RecyclerView.Adapter<RvDo3a2ItemAdapter.RvDo3a2ItemViewHolder> {
    ArrayList<ModelAd3ia> arrayList;

    public RvDo3a2ItemAdapter(ArrayList<ModelAd3ia> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RvDo3a2ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ad3ia_rv_class,parent,false);
        RvDo3a2ItemViewHolder rvDo3a2ItemViewHolder = new RvDo3a2ItemViewHolder(view);
        return rvDo3a2ItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RvDo3a2ItemViewHolder holder, int position) {
        holder.mTitle.setText(arrayList.get(position).getTitle());
        holder.mDisc.setText(arrayList.get(position).getDisc());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class RvDo3a2ItemViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle,mDisc;
        public RvDo3a2ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.title);
            mDisc = itemView.findViewById(R.id.disc);
        }
    }
}
