package com.mo_said.azkar.RV;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.R;
import com.mo_said.azkar.ShowAzkar;
import com.mo_said.azkar.ShowData;

import java.util.ArrayList;

public class RvِAzkarAdapter extends RecyclerView.Adapter<RvِAzkarAdapter.RvViewHolder> {

    ArrayList<ModelAzkar> arrayList;
    Context mContext;


    public RvِAzkarAdapter(ArrayList<ModelAzkar> arrayList,Context mContext) {
        this.arrayList = arrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.azkar_item,parent,false);
        RvViewHolder rvViewHolder = new RvViewHolder(view);
        return rvViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, final int position) {
        holder.mIcon.setImageResource(arrayList.get(position).mIcon);
        holder.mTitle.setText(arrayList.get(position).mtitle);
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
                    case 10:Intent(10,view); break;
                    case 11:Intent(11,view); break;
                    case 12:Intent(12,view); break;
                }
            }
        });
    }

    void Intent(int pd,View view){
        Intent n =new Intent(view.getContext(), ShowAzkar.class);
        n.putExtra("ii",arrayList.get(pd).mtitle);
        n.putExtra("icon",arrayList.get(pd).mIcon);
        n.putExtra("io",pd);
        mContext.startActivity(n);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class RvViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle;
        ImageView mIcon;

        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.title);
            mIcon = itemView.findViewById(R.id.icon);
        }
    }
}
