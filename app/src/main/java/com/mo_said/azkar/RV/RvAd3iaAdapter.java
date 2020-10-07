package com.mo_said.azkar.RV;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.R;
import com.mo_said.azkar.ShowAd3ia;

import java.util.ArrayList;

public class RvAd3iaAdapter extends RecyclerView.Adapter<RvAd3iaAdapter.RvAd3iaViewHolder> {
    ArrayList<Model> arrayList_;
    Context mContext;

    public RvAd3iaAdapter(ArrayList<Model> arrayList_, Context mContext) {
        this.arrayList_ = arrayList_;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RvAd3iaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ad3ia_item,parent,false);
        RvAd3iaViewHolder rvAd3iaViewHolder = new RvAd3iaViewHolder(view);
        return rvAd3iaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RvAd3iaViewHolder holder, final int position) {
        holder.mTitle.setText(arrayList_.get(position).title);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    switch (position){
                        case 0:Intent(0,view); break;
                        case 1:Intent(1,view); break;
                        case 2:Intent(2,view); break;
                        case 3:Intent(3,view); break;
                        case 4:Intent(4,view); break;
                        case 5:Intent(5,view); break;
                        case 6:Intent(6,view); break;
                        case 7:Intent(7,view); break;
                        case 8:Intent(8,view); break;
                        case 9:Intent(9,view); break;

                    }
            }
        });

    }
    void Intent(int pd,View view){
        Intent n = new Intent(view.getContext(), ShowAd3ia.class);
        n.putExtra("ii",arrayList_.get(pd).title);
        n.putExtra("io",pd);
        mContext.startActivity(n);


    }
    @Override

    public int getItemCount() {
        return arrayList_.size();
    }



    class RvAd3iaViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle;
        public RvAd3iaViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.title_ad3iaItem);



        }
    }
}
