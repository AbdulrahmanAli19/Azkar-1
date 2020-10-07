package com.mo_said.azkar;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.RV.Model;

import java.util.ArrayList;

public class RvFromHomeAdapter extends RecyclerView.Adapter<RvFromHomeAdapter.RvFromHomeViewHolder> {
    ArrayList<Model> arrayList = new ArrayList<>();

    public RvFromHomeAdapter(ArrayList<Model> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RvFromHomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_from_home, parent, false);
        RvFromHomeViewHolder rvFromHomeViewHolder = new RvFromHomeViewHolder(view);
        return rvFromHomeViewHolder;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull RvFromHomeViewHolder holder, int position) {
        holder.mText.setText(arrayList.get(position).getTitle());
        holder.mDisc.setText(arrayList.get(position).getDisc());
        holder.card.setCardBackgroundColor(Color.parseColor(arrayList.get(position).getColor()));


        boolean isExpanded = arrayList.get(position).isExpanded();
        holder.mDisc.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class RvFromHomeViewHolder extends RecyclerView.ViewHolder {
        TextView mText, mDisc;
        CardView card;

        public RvFromHomeViewHolder(@NonNull View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.itemText);
            card = itemView.findViewById(R.id.Card_Top);
            mDisc = itemView.findViewById(R.id.disc);


            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Model model = arrayList.get(getAdapterPosition());
                    model.setExpanded(!model.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
