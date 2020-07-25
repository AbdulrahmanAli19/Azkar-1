package com.mo_said.azkar.RV;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.mo_said.azkar.R;
import com.mo_said.azkar.RcClickInterface;

import java.util.ArrayList;

public class RvElseb7aAdapter extends RecyclerView.Adapter<RvElseb7aAdapter.RvElseb7aViewHolder> {

    private RcClickInterface rcClickInterface ;




    ArrayList<ModelElseb7a> arrayList;
    ArrayList<ModelElseb7a> arrayList1;
    public RvElseb7aAdapter(ArrayList<ModelElseb7a> arrayList,RcClickInterface rcClickInterface) {
        this.arrayList = arrayList;
        this.rcClickInterface = rcClickInterface;
    }

    @NonNull
    @Override
    public RvElseb7aViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.elseb7a_item,parent,false);
        RvElseb7aViewHolder rvElseb7aViewHolder = new RvElseb7aViewHolder(view);
        return rvElseb7aViewHolder;
    }
//    int mCounter;
//    ArrayList<Counter> counterArrayList;

    @Override
    public void onBindViewHolder(@NonNull final RvElseb7aViewHolder holder, final int position) {
        holder.mTitle.setText(arrayList.get(position).mtitle);
        holder.mAnimationView.pauseAnimation();



















//        counterArrayList = new ArrayList<>();
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                counterArrayList.add(new Counter(position,0));
//                int M=counterArrayList.get(pp).mPositoin;
//                M++;
//                animation(M);
//            }
//
//            void  animation(int M){
//                int CounterAnimation = M*9;
//                holder.mAnimationView.setFrame(CounterAnimation);
//                holder.mTextCounter.setText(String.valueOf(M));
//                if (mCounter==100){
//                    holder.mAnimationView.setFrame(0);
//                    mCounter=0;
//                }
//
//          };


//        });



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class RvElseb7aViewHolder extends RecyclerView.ViewHolder {
        LottieAnimationView mAnimationView;
        TextView mTextCounter;
        TextView mTitle;
        public RvElseb7aViewHolder(@NonNull View itemView) {
            super(itemView);
            mAnimationView = itemView.findViewById(R.id.animationView_item);
            mTextCounter = itemView.findViewById(R.id.c_text_item);
            mTitle = itemView.findViewById(R.id.title_item_elsebha);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rcClickInterface.onItemClickListener(getAdapterPosition());
                }
            });


        }
    }



}
