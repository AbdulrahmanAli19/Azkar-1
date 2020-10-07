package com.mo_said.azkar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RvHomeAdapter extends RecyclerView.Adapter<RvHomeAdapter.RvHomeViewHolder> {
    ArrayList<ModelRvHome> arrayList = new ArrayList<>();
    Context mContext;

    public RvHomeAdapter(ArrayList<ModelRvHome> arrayList, Context mContext) {
        this.arrayList = arrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RvHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_home, parent, false);
        RvHomeViewHolder rvHomeViewHolder = new RvHomeViewHolder(view);
        return rvHomeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RvHomeViewHolder holder, final int position) {
        holder.mImage.setImageResource(arrayList.get(position).getImage());
        holder.mText.setText(arrayList.get(position).getText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position) {
                    case 0:
                        Intent(0, view);
                        break;
                    case 1:
                        Intent0(1, view);
                        break;
                    case 2:
                        Intent(2, view);
                        break;
                    case 3:
                        Intent(3, view);
                        break;
                    case 4:
                        Intent(4, view);
                        break;
                    case 5:
                        Intent(5, view);
                        break;
                    case 6:
                        Intent(6, view);
                        break;
                    case 7:
                        Intent(7, view);
                        break;
                    case 8:
                        Intent(8, view);
                        break;
                    case 9:
                        Intent(9, view);
                        break;
                    case 10:
                        Intent(10, view);
                        break;
                    case 11:
                        Intent(11, view);
                        break;
                    case 12:
                        Intent(12, view);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    void Intent(int pd, View view) {
        Intent n = new Intent(mContext, ShowFromHome.class);
        n.putExtra("ii", arrayList.get(pd).getText());
        n.putExtra("icon", arrayList.get(pd).getImage());
        n.putExtra("io", pd);
        mContext.startActivity(n);
    }

    void Intent0(int pd, View view) {
        Intent n = new Intent(mContext, ShowAd3ia.class);
        n.putExtra("ii", arrayList.get(pd).getText());
        n.putExtra("icon", arrayList.get(pd).getImage());
        n.putExtra("io", pd);
        mContext.startActivity(n);
    }

    class RvHomeViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        TextView mText;

        public RvHomeViewHolder(@NonNull View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.imageRvitemHome);
            mText = itemView.findViewById(R.id.textRvitemHome);
        }
    }
}
